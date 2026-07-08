package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vIV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM$updateEffectImage$1", f = "EffectEditVM.kt", l = {}, m = "invokeSuspend")
public final class C1736810vIV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Uri LL;
    public final /* synthetic */ EffectEditVM LLILLJJLI;
    public final /* synthetic */ EditImageEffectImgCreatorData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1736810vIV(Uri uri, EffectEditVM effectEditVM, EditImageEffectImgCreatorData editImageEffectImgCreatorData, InterfaceC1364105Vn<? super C1736810vIV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = uri;
        this.LLILLJJLI = effectEditVM;
        this.LLILLL = editImageEffectImgCreatorData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1736810vIV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String parent;
        C1C7U.LIZ("EffectEditVM@62f.updateEffectImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String path = this.LL.getPath();
        if (path != null) {
            EffectEditVM effectEditVM = this.LLILLJJLI;
            EditImageEffectImgCreatorData editImageEffectImgCreatorData = this.LLILLL;
            C0VSJ c0vsj = new C0VSJ(path);
            if (c0vsj.exists() && c0vsj.getParent() != null && (parent = c0vsj.getParent()) != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(parent);
                sbLIZ.append('/');
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(".png");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2354709Kn.LJIL(path, strLIZIZ);
                effectEditVM.CQ2();
                EditImage editImage = new EditImage(Uri.fromFile(new C0VSJ(strLIZIZ)), System.currentTimeMillis(), editImageEffectImgCreatorData);
                effectEditVM.setState(new AwS605S0100000_26(editImage, 391));
                effectEditVM.DQ2(editImage);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditVM@62f.updateEffectImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
