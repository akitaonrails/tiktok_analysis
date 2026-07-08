package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS118S1100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0DVS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.linkshare.view.LinkShareUIUtils$Companion$showMusicShareFailureDialog$1", f = "LinkShareUIUtils.kt", l = {}, m = "invokeSuspend")
public final class C0DVS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DVS(Context context, String str, boolean z, Function0<Unit> function0, InterfaceC1364105Vn<? super C0DVS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DVS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("LinkShareUIUtils$Companion@71bb.showMusicShareFailureDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LLILLL;
        C0HTI c0hti = new C0HTI();
        if (z) {
            i = R.drawable.qw;
        } else {
            i = R.drawable.vo;
        }
        c0hti.LIZ = i;
        Drawable drawableLIZ = c0hti.LIZ(this.LL);
        String str = this.LLILLJJLI;
        String string = this.LL.getString(2131832468);
        Context context = this.LL;
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJIIIZ = new C1391770mJz(context, drawableLIZ, new Rect(0, 0, 0, 0));
        c1397580mTM.LIZIZ(str);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS118S1100000_4(string, (String) this.LLILZ, (Function0<Unit>) 0));
        new C1397510mTF(c1397580mTM).LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LinkShareUIUtils$Companion@71bb.showMusicShareFailureDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
