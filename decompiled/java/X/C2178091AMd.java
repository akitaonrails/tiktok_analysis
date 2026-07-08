package X;

import android.content.Context;
import com.bytedance.ies.xelement.audiott.bean.XAudioSrc;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS242S0300000_33;
import kotlin.jvm.internal.AwS310S0300000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1AMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178091AMd extends C2178101AMe {
    public final Context LIZIZ;
    public final InterfaceC2033107xp<C1290210jgB> LIZJ;

    public C2178091AMd(Context context, C1547950qNt c1547950qNt) {
        super(context);
        this.LIZIZ = context;
        this.LIZJ = c1547950qNt;
    }

    @Override // X.C2178101AMe, X.InterfaceC2178111AMf
    public final /* bridge */ /* synthetic */ void LIZ(AwS612S0100000_33 awS612S0100000_33, XAudioSrc xAudioSrc) {
        LIZIZ(xAudioSrc, awS612S0100000_33);
    }

    @Override // X.C2178101AMe, X.C2178081AMc
    public final void LIZIZ(XAudioSrc xAudioSrc, Function1<? super C2178071AMb, Unit> function1) {
        String playUrl;
        String playUrl2 = null;
        if (xAudioSrc != null && (playUrl = xAudioSrc.getPlayUrl()) != null && playUrl.length() != 0) {
            InterfaceC2033107xp<C1290210jgB> interfaceC2033107xp = this.LIZJ;
            if (interfaceC2033107xp == null) {
                super.LIZIZ(xAudioSrc, function1);
                return;
            }
            if (xAudioSrc != null) {
                playUrl2 = xAudioSrc.getPlayUrl();
            }
            AwS612S0100000_33 awS612S0100000_33 = (AwS612S0100000_33) function1;
            interfaceC2033107xp.LIZ(playUrl2, new AwS242S0300000_33(this, xAudioSrc, awS612S0100000_33, 0), new AwS310S0300000_33(this, xAudioSrc, awS612S0100000_33, 0));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("origin=");
        sbLIZ.append(xAudioSrc);
        sbLIZ.append(", origin.playUrl=");
        if (xAudioSrc != null) {
            playUrl2 = xAudioSrc.getPlayUrl();
        }
        sbLIZ.append(playUrl2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (xAudioSrc != null && xAudioSrc.getPlayModel() != null) {
            ((AwS612S0100000_33) function1).invoke(new C2178071AMb(null, null, null, null, xAudioSrc.getPlayModel(), 15));
        }
    }
}
