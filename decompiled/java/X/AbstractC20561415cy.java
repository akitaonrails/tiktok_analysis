package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20561415cy implements InterfaceC20562615dA {
    public final EnumC1783170wVH LL = EnumC1783170wVH.STRATEGY;
    public final C054G LLILLJJLI = C2296808zG.LIZ(C0PEM.LIZJ);
    public final C054G LLILLL = C2296808zG.LIZ(C2107308Nj.LIZ);

    public abstract InterfaceC1869460ykS LIZ();

    public boolean LIZIZ() {
        return false;
    }

    public abstract boolean LIZJ(VideoAdaptionParams videoAdaptionParams);

    @Override // X.InterfaceC20562615dA
    public final EnumC1783170wVH getNodeType() {
        return this.LL;
    }

    public final VideoAdaptionResult LIZLLL(List<? extends AbstractC20562115d5> list, VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult) {
        for (AbstractC20562115d5 abstractC20562115d5 : list) {
            if (!C20039813b2.LIZIZ) {
                C20569715eJ.LJII(this, new AwS575S0100000_31(abstractC20562115d5, 1448), videoAdaptionParams, videoAdaptionResult);
            }
            VideoAdaptionResult videoAdaptionResultLIZ = abstractC20562115d5.LIZ(videoAdaptionParams, videoAdaptionResult);
            if (videoAdaptionResult == null) {
                if (videoAdaptionResultLIZ == null) {
                    Ui(AFwS221S0000000_31.get$arr$(398), videoAdaptionParams, null);
                    return null;
                }
            } else if (videoAdaptionResultLIZ == null) {
                if (!C20039813b2.LIZIZ) {
                    em(new C20438914yJ(), null, videoAdaptionResult);
                }
                return videoAdaptionResult;
            }
            if (!C20039813b2.LIZIZ) {
                ah(AFwS221S0000000_31.get$arr$(399), null, videoAdaptionResultLIZ);
            }
            videoAdaptionResult = videoAdaptionResultLIZ;
        }
        return videoAdaptionResult;
    }

    @Override // X.InterfaceC20562615dA
    public final void Ui(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJIIIZ(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void ah(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJII(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void em(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJIIJJI(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void Lj(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LJ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void y5(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LIZJ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void zb(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LIZ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }
}
