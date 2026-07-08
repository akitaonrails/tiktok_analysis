package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS275S0300000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS85S0500000_31;
import njp.a;

/* JADX INFO: renamed from: X.167d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.browser.jsbridge.idlmethod.impl.ChooseImageForSubV2Method$parsePictureList$1", f = "ChooseImageForSubV2Method.kt", l = {}, m = "invokeSuspend")
public final class C207227167d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<LiveSubMediaModel> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ InterfaceC207228167e LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207227167d(List<LiveSubMediaModel> list, Context context, InterfaceC207228167e interfaceC207228167e, InterfaceC1364105Vn<? super C207227167d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = context;
        this.LLILLL = interfaceC207228167e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C207227167d(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChooseImageForSubV2Method@fbd7.parsePictureList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C118300cf c118300cf = new C118300cf();
        C118300cf c118300cf2 = new C118300cf();
        List<LiveSubMediaModel> list = this.LL;
        Context context = this.LLILLJJLI;
        InterfaceC207228167e interfaceC207228167e = this.LLILLL;
        for (LiveSubMediaModel liveSubMediaModel : list) {
            IHostSubscription.Result.PhotoFile photoFileVq2 = ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).vq2(context, liveSubMediaModel, interfaceC207228167e.getMinWidth().intValue(), interfaceC207228167e.getMinHeight().intValue(), interfaceC207228167e.getMaxWidth().intValue(), interfaceC207228167e.getMaxHeight().intValue(), true);
            if (photoFileVq2 == null) {
                C500260Jjc.LJJLIIIJJIZ(new AwS432S0200000_31(liveSubMediaModel, interfaceC207228167e, 95));
            } else {
                if (photoFileVq2.isLittlePhoto) {
                    c118300cf.element++;
                }
                if (photoFileVq2.isCropped) {
                    c118300cf2.element++;
                }
                C500260Jjc.LJJLIIIJJIZ(new AwS275S0300000_31(liveSubMediaModel, photoFileVq2, interfaceC207228167e, 32));
            }
        }
        C500260Jjc.LJJLIIIJJIZ(new AwS85S0500000_31(c118300cf, (C118300cf) this.LLILLJJLI, (Context) this.LLILLL, (InterfaceC207228167e) c118300cf2, (C118300cf) this.LL, (List<LiveSubMediaModel>) 3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseImageForSubV2Method@fbd7.parsePictureList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
