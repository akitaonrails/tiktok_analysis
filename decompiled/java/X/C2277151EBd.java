package X;

import android.view.SurfaceView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277151EBd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Object[] LLILZ;
    public final /* synthetic */ C2277251EBn LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277151EBd(int i, long j, long j2, Object[] objArr, C2277251EBn c2277251EBn) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = objArr;
        this.LLILZIL = c2277251EBn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC2277241EBm interfaceC2277241EBm;
        switch (this.LL) {
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MSG_INFO_SINGLE_TO_MULTI_VIEW, code=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", subCode=");
                sbLIZ.append(this.LLILLL);
                C20441214yg.LIZIZ("RustClientCallback", C2188811AlT.LIZIZ(sbLIZ));
                Object[] objArr = this.LLILZ;
                if (objArr.length >= 2) {
                    Object obj = objArr[0];
                    String str = obj instanceof String ? (String) obj : null;
                    Object obj2 = objArr[1];
                    SurfaceView surfaceView = obj2 instanceof SurfaceView ? (SurfaceView) obj2 : null;
                    if (str != null && (interfaceC2277241EBm = this.LLILZIL.LIZ) != null) {
                        interfaceC2277241EBm.LJJ(str, surfaceView);
                    }
                }
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MSG_INFO_EFFECT_MIX_START, code=");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append(", subCode=");
                sbLIZ2.append(this.LLILLL);
                C20441214yg.LIZIZ("RustClientCallback", C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC2277241EBm interfaceC2277241EBm2 = this.LLILZIL.LIZ;
                if (interfaceC2277241EBm2 != null) {
                    interfaceC2277241EBm2.LJIJJLI();
                }
                break;
            case 35:
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("MSG_INFO_EFFECT_MIX_FINISHED, code=");
                sbLIZ3.append(this.LLILLJJLI);
                sbLIZ3.append(", subCode=");
                sbLIZ3.append(this.LLILLL);
                C20441214yg.LIZIZ("RustClientCallback", C2188811AlT.LIZIZ(sbLIZ3));
                InterfaceC2277241EBm interfaceC2277241EBm3 = this.LLILZIL.LIZ;
                if (interfaceC2277241EBm3 != null) {
                    interfaceC2277241EBm3.LJ();
                }
                break;
        }
        return Unit.LIZ;
    }
}
