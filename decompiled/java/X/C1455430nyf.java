package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS105S1200000_22;
import kotlin.jvm.internal.AwS15S0600000_5;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1455430nyf {
    public final InterfaceC1461350o8D LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final Context LIZJ;
    public final Scene LIZLLL;
    public final InterfaceC1455500nym LJ;
    public final InterfaceC1456910o13 LJFF;
    public final InterfaceC1460000o62 LJI;
    public final InterfaceC1455860nzM LJII;
    public final C1462070o9N LJIIIIZZ;
    public final C364440EQo LJIIIZ;
    public final Function1<Integer, Unit> LJIIJ;
    public final C0EYP LJIIJJI;
    public final Function0<InterfaceC1455620nyy> LJIIL;
    public final C0EPM LJIILIIL;
    public final Function0<InterfaceC1456070nzh> LJIILJJIL;
    public final NLEModel LJIILL;

    public final boolean LIZJ(String str) {
        Integer numValueOf;
        C122Q c122q;
        MutableLiveData<Boolean> mutableLiveDataRb;
        MutableLiveData<Boolean> mutableLiveDataQE2;
        boolean zLJFF;
        boolean z;
        int iLIZJ;
        InterfaceC1455620nyy interfaceC1455620nyyInvoke;
        InterfaceC1455620nyy interfaceC1455620nyyInvoke2;
        InterfaceC1456910o13 interfaceC1456910o13 = this.LJFF;
        if (interfaceC1456910o13 != null) {
            interfaceC1456910o13.cn2();
        }
        Function0<InterfaceC1455620nyy> function0 = this.LJIIL;
        if (function0 != null && (interfaceC1455620nyyInvoke2 = function0.invoke()) != null) {
            interfaceC1455620nyyInvoke2.oy();
        }
        C391040FUw c391040FUw = C391040FUw.LIZ;
        Function0<InterfaceC1455620nyy> function02 = this.LJIIL;
        InterfaceC1455620nyy interfaceC1455620nyyInvoke3 = null;
        if (function02 != null && (interfaceC1455620nyyInvoke = function02.invoke()) != null) {
            numValueOf = Integer.valueOf(interfaceC1455620nyyInvoke.hashCode());
        } else {
            numValueOf = null;
        }
        c391040FUw.getClass();
        if (numValueOf != null) {
            numValueOf.intValue();
            Keva keva = C391040FUw.LIZIZ;
            ArrayList arrayList = new ArrayList(a0.LJJLIIIJILLIZJL(keva.getString("text_not_use_caption_creation_ids", ""), new String[]{","}, 0, 6));
            if (arrayList.contains(numValueOf.toString())) {
                arrayList.remove(numValueOf.toString());
                arrayList.remove("text_caption_item_first_pin");
            }
            keva.storeString("text_not_use_caption_creation_ids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        }
        Context context = this.LIZJ;
        C0EYP c0eyp = this.LJIIJJI;
        Function0<InterfaceC1455620nyy> function03 = this.LJIIL;
        if (function03 != null) {
            interfaceC1455620nyyInvoke3 = function03.invoke();
        }
        final InterfaceC1455860nzM interfaceC1455860nzM = this.LJII;
        final Function0<InterfaceC1456070nzh> function04 = this.LJIILJJIL;
        Scene scene = this.LIZLLL;
        final VideoPublishEditModel videoPublishEditModel = this.LIZIZ;
        C364440EQo c364440EQo = this.LJIIIZ;
        if (interfaceC1455620nyyInvoke3 != null) {
            interfaceC1455620nyyInvoke3.AA();
        }
        if (context != null && scene != null) {
            if (interfaceC1455620nyyInvoke3 != null && interfaceC1455620nyyInvoke3.u10()) {
                interfaceC1455620nyyInvoke3.z60(context, c364440EQo);
                return true;
            }
            if (u4.LJLJJI(videoPublishEditModel)) {
                C0ET3.LIZ.getClass();
                if (C0ET3.LIZ(videoPublishEditModel)) {
                    final AwS15S0600000_5 awS15S0600000_5 = new AwS15S0600000_5(context, scene, videoPublishEditModel, c364440EQo, interfaceC1455620nyyInvoke3, c0eyp, 0);
                    AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(207);
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
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(context.getString(2131826991));
                        if (z2) {
                            arrayList2.add(context.getString(2131858279));
                        }
                        if (zLJJJJJL) {
                            arrayList2.add(context.getString(2131820744));
                        }
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
                        if (!C338630DPh.LIZ() && !u4.LJJIIZ(videoPublishEditModel)) {
                            iLIZJ = 2131825215;
                        } else {
                            C1455810nzH.LIZ.getClass();
                            iLIZJ = C1455810nzH.LIZJ();
                        }
                        C21566919al c21566919al = new C21566919al(context);
                        c21566919al.LIZJ = context.getString(iLIZJ, strLJJLIIIJ);
                        c21566919al.LJIIJ(R.string.fte, new DialogInterface.OnClickListener() { // from class: X.0F5v
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                InterfaceC1456070nzh interfaceC1456070nzhInvoke;
                                Function0<InterfaceC1456070nzh> function05 = function04;
                                if (function05 != null && (interfaceC1456070nzhInvoke = function05.invoke()) != null) {
                                    interfaceC1456070nzhInvoke.ij(interfaceC1455860nzM, videoPublishEditModel);
                                }
                                videoPublishEditModel.setVeAudioEffectParam(null);
                                awS15S0600000_5.invoke();
                            }
                        }, false);
                        c21566919al.LJII(R.string.f1_, new DialogInterfaceOnClickListenerC1466630oGj(aFwS210S0000000_22, 1), false);
                        new C21566519ah(c21566919al).LIZLLL();
                        return true;
                    }
                    awS15S0600000_5.invoke();
                    return true;
                }
            }
        }
        InterfaceC1461350o8D interfaceC1461350o8D = this.LIZ;
        if (interfaceC1461350o8D != null && (mutableLiveDataQE2 = interfaceC1461350o8D.QE2()) != null) {
            mutableLiveDataQE2.setValue(Boolean.TRUE);
        }
        InterfaceC1461350o8D interfaceC1461350o8D2 = this.LIZ;
        if (interfaceC1461350o8D2 != null && (mutableLiveDataRb = interfaceC1461350o8D2.rb()) != null) {
            mutableLiveDataRb.setValue(Boolean.TRUE);
        }
        InterfaceC1461350o8D interfaceC1461350o8D3 = this.LIZ;
        if (interfaceC1461350o8D3 != null) {
            interfaceC1461350o8D3.LLJJIJIL();
        }
        InterfaceC1456910o13 interfaceC1456910o132 = this.LJFF;
        if (interfaceC1456910o132 != null) {
            interfaceC1456910o132.iW(str);
        }
        InterfaceC1460000o62 interfaceC1460000o62 = this.LJI;
        if (interfaceC1460000o62 != null) {
            interfaceC1460000o62.bo();
        }
        if (!u4.LJLJLJ(this.LIZIZ)) {
            return false;
        }
        C1462070o9N c1462070o9N = this.LJIIIIZZ;
        if (c1462070o9N != null && (c122q = c1462070o9N.LLLLLJLJLL) != null) {
            c122q.dQ2(true);
        }
        InterfaceC1461350o8D interfaceC1461350o8D4 = this.LIZ;
        if (interfaceC1461350o8D4 != null) {
            interfaceC1461350o8D4.KL(false);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(final java.lang.String r8, final kotlin.jvm.functions.Function0<kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455430nyf.LIZ(java.lang.String, kotlin.jvm.functions.Function0):boolean");
    }

    public final void LIZIZ(String str, Function0<Unit> function0) {
        Context sceneContext = this.LIZLLL.getSceneContext();
        if (sceneContext != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(sceneContext);
            c1397580mTM.LJFF(2131828406);
            c1397580mTM.LIZ(2131828404);
            C985403tE.LIZ(c1397580mTM, new AwS105S1200000_22(this, (C1455430nyf) str, (String) function0, (Function0<Unit>) 2));
            c1397580mTM.LIZLLL(new AwS601S0100000_22(function0, (Function0<Unit>) 331));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C1455430nyf(InterfaceC1461350o8D interfaceC1461350o8D, VideoPublishEditModel videoPublishEditModel, Context context, AbstractC1453750nvx abstractC1453750nvx, InterfaceC1455500nym interfaceC1455500nym, InterfaceC1456910o13 interfaceC1456910o13, InterfaceC1460000o62 interfaceC1460000o62, InterfaceC1446740nke interfaceC1446740nke, C1462070o9N c1462070o9N, C364440EQo c364440EQo, C1462130o9T c1462130o9T, C0EYP c0eyp, AwS566S0100000_22 awS566S0100000_22, C0EPM c0epm, AwS566S0100000_22 awS566S0100000_222, NLEModel nLEModel) {
        this.LIZ = interfaceC1461350o8D;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = context;
        this.LIZLLL = abstractC1453750nvx;
        this.LJ = interfaceC1455500nym;
        this.LJFF = interfaceC1456910o13;
        this.LJI = interfaceC1460000o62;
        this.LJII = interfaceC1446740nke;
        this.LJIIIIZZ = c1462070o9N;
        this.LJIIIZ = c364440EQo;
        this.LJIIJ = c1462130o9T;
        this.LJIIJJI = c0eyp;
        this.LJIIL = awS566S0100000_22;
        this.LJIILIIL = c0epm;
        this.LJIILJJIL = awS566S0100000_222;
        this.LJIILL = nLEModel;
    }
}
