package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0mvd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415110mvd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1415220mvo LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1415110mvd(C1415220mvo c1415220mvo, int i, String str, boolean z) {
        super(0);
        this.LL = c1415220mvo;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        this.LL.i3(AFwS261S0000000_22.get$arr$(211));
        this.LL.S5().removeCallbacks(this.LL.v5());
        this.LL.S5().postDelayed(this.LL.v5(), 10000L);
        this.LL.T4(this.LLILLJJLI, this.LLILLL);
        if (this.LLILZ) {
            InterfaceC1452170ntP value = this.LL.JY0().g().getValue();
            if (value != null) {
                VEEditor.SEEK_MODE seek_mode = VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek;
                final C1415220mvo c1415220mvo = this.LL;
                value.Yf(0, seek_mode, new InterfaceC1464180oCm() { // from class: X.0mve
                    @Override // X.InterfaceC1464180oCm
                    public final void onSeekDone(int i) {
                        InterfaceC1452170ntP value2 = c1415220mvo.JY0().g().getValue();
                        if (value2 != null) {
                            value2.play();
                        }
                    }
                });
            }
        } else {
            InterfaceC1452170ntP value2 = this.LL.JY0().g().getValue();
            if (value2 != null) {
                value2.play();
            }
        }
        InterfaceC1452170ntP value3 = this.LL.JY0().g().getValue();
        if (value3 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value3)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
            C350410DoV.LIZ(nLEEditor, true, true);
        }
        this.LL.Z4();
        return Unit.LIZ;
    }
}
