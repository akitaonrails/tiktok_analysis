package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384550F5x {
    public final VideoPublishEditModel LIZ;
    public final Scene LIZIZ;
    public final InterfaceC1455500nym LIZJ;
    public final InterfaceC1455860nzM LIZLLL;
    public final C364440EQo LJ;
    public final C0EYP LJFF;
    public final Function0<InterfaceC1456070nzh> LJI;
    public final boolean LJII;

    public final boolean LIZ(final String str, final Function0<Unit> function0) {
        boolean zLJFF;
        boolean z;
        int iLIZJ;
        if (this.LIZ.isTimeEffectApply()) {
            C21566919al c21566919al = new C21566919al(this.LIZIZ.requireActivity());
            c21566919al.LJFF(2131826917);
            c21566919al.LIZ(2131826916);
            c21566919al.LJII(2131832438, new DialogInterfaceOnClickListenerC391560FWw(function0, 0), false);
            c21566919al.LIZLLL(new AwS584S0100000_5(function0, (Function0<Unit>) 157));
            c21566919al.LJIIJ(R.string.s27, new DialogInterface.OnClickListener() { // from class: X.0F5y
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InterfaceC1455500nym interfaceC1455500nym = this.LL.LIZJ;
                    if (interfaceC1455500nym != null) {
                        interfaceC1455500nym.aH(true);
                    }
                    if (!this.LL.LIZ(str, function0)) {
                        function0.invoke();
                    }
                }
            }, false);
            new C21566519ah(c21566919al).LIZLLL();
            return true;
        }
        Activity activityRequireActivity = this.LIZIZ.requireActivity();
        C0EYP c0eyp = this.LJFF;
        final InterfaceC1455860nzM interfaceC1455860nzM = this.LIZLLL;
        final Function0<InterfaceC1456070nzh> function02 = this.LJI;
        Scene scene = this.LIZIZ;
        final VideoPublishEditModel videoPublishEditModel = this.LIZ;
        C364440EQo c364440EQo = this.LJ;
        if (activityRequireActivity != null && scene != null && u4.LJLJJI(videoPublishEditModel)) {
            final AwS134S0400000_5 awS134S0400000_5 = new AwS134S0400000_5(c0eyp, scene, this, c364440EQo, 1);
            AFwS191S0000000_5 aFwS191S0000000_5 = AFwS191S0000000_5.get$arr$(71);
            boolean z2 = videoPublishEditModel.creativeModel.voiceConversionModel.hasStyleConversion;
            boolean zLJJJJJL = C1428520nHG.LJJJJJL(videoPublishEditModel);
            InterfaceC1452170ntP value = interfaceC1455860nzM.g().getValue();
            if (value != null) {
                zLJFF = C348930Dm7.LJFF(((C1463670oBx) value).LIZJ());
            } else {
                zLJFF = false;
            }
            VoiceConversionModel voiceConversionModel = videoPublishEditModel.creativeModel.voiceConversionModel;
            if (!voiceConversionModel.hasDubVoiceConversion && !voiceConversionModel.hasOriginVoiceConversion && !zLJFF) {
                z = false;
            } else {
                z = true;
            }
            if (videoPublishEditModel.getVeAudioEffectParam() == null || z ? z2 || 0 != 0 || (z && !C301760BsE.LIZ()) : z2 || !zLJJJJJL) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(activityRequireActivity.getString(2131826991));
                if (z2) {
                    arrayList.add(activityRequireActivity.getString(2131858279));
                }
                if (zLJJJJJL) {
                    arrayList.add(activityRequireActivity.getString(2131820744));
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                if (!C338630DPh.LIZ() && !u4.LJJIIZ(videoPublishEditModel)) {
                    iLIZJ = 2131825215;
                } else {
                    C1455810nzH.LIZ.getClass();
                    iLIZJ = C1455810nzH.LIZJ();
                }
                C21566919al c21566919al2 = new C21566919al(activityRequireActivity);
                c21566919al2.LIZJ = activityRequireActivity.getString(iLIZJ, strLJJLIIIJ);
                c21566919al2.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0F5w
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        InterfaceC1456070nzh interfaceC1456070nzhInvoke;
                        Function0<InterfaceC1456070nzh> function03 = function02;
                        if (function03 != null && (interfaceC1456070nzhInvoke = function03.invoke()) != null) {
                            interfaceC1456070nzhInvoke.ij(interfaceC1455860nzM, videoPublishEditModel);
                        }
                        videoPublishEditModel.setVeAudioEffectParam(null);
                        awS134S0400000_5.invoke();
                    }
                }, false);
                c21566919al2.LJII(R.string.f1_, new DialogInterfaceOnClickListenerC391560FWw(aFwS191S0000000_5, 1), false);
                new C21566519ah(c21566919al2).LIZLLL();
                return true;
            }
            awS134S0400000_5.invoke();
            return true;
        }
        return false;
    }

    public C384550F5x(VideoPublishEditModel videoPublishEditModel, Scene scene, InterfaceC1455500nym interfaceC1455500nym, InterfaceC1446740nke interfaceC1446740nke, C364440EQo c364440EQo, C0EYP c0eyp, AwS549S0100000_5 awS549S0100000_5, boolean z) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = scene;
        this.LIZJ = interfaceC1455500nym;
        this.LIZLLL = interfaceC1446740nke;
        this.LJ = c364440EQo;
        this.LJFF = c0eyp;
        this.LJI = awS549S0100000_5;
        this.LJII = z;
    }
}
