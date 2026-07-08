package X;

import android.util.SizeF;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEHSLColorType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentChromaChannel;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nleeditor.NLE;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import com.ss.ugc.android.editor.core.editor.ColorPickerInfo;
import com.ss.ugc.android.editor.core.model.StrokeParams;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dvi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354880Dvi implements InterfaceC351350Dq1 {
    public final C0E48 LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public NLEEditor LJIILLIIL;

    public final InterfaceC351310Dpx LJIIJ() {
        return (InterfaceC351310Dpx) this.LJIIJ.getValue();
    }

    public final InterfaceC351130Dpf LJIILIIL() {
        return (InterfaceC351130Dpf) this.LIZJ.getValue();
    }

    public final InterfaceC354910Dvl LJJI() {
        return (InterfaceC354910Dvl) this.LJI.getValue();
    }

    public final InterfaceC354890Dvj LJJIII() {
        return (InterfaceC354890Dvj) this.LJIILJJIL.getValue();
    }

    public final InterfaceC354930Dvn LJJIIJ() {
        return (InterfaceC354930Dvn) this.LJIIL.getValue();
    }

    public final InterfaceC353780Dtw LJJIJL() {
        return (InterfaceC353780Dtw) this.LJIILL.getValue();
    }

    public final InterfaceC353130Dst LJJJIL() {
        return (InterfaceC353130Dst) this.LIZLLL.getValue();
    }

    public final InterfaceC350850DpD LJJJJL() {
        return (InterfaceC350850DpD) this.LIZIZ.getValue();
    }

    public final InterfaceC354900Dvk LJJLIIIJJIZ() {
        return (InterfaceC354900Dvk) this.LJ.getValue();
    }

    @Override // X.InterfaceC354950Dvp
    public final void LJLIL() {
        ((InterfaceC354950Dvp) this.LJIILIIL.getValue()).LJLIL();
    }

    @Override // X.InterfaceC350850DpD
    public final NLETrackSlot LJIILL() {
        return LJJJJL().LJIILL();
    }

    @Override // X.InterfaceC354890Dvj
    public final Pair<String, EnumC356150Dxl> LJJII() {
        return LJJIII().LJJII();
    }

    @Override // X.InterfaceC351310Dpx
    public final void LJJIJIL() {
        LJIIJ().LJJIJIL();
    }

    @Override // X.InterfaceC354900Dvk
    public final void LJJJJLI() {
        LJJLIIIJJIZ().LJJJJLI();
    }

    @Override // X.InterfaceC350850DpD
    public final NLETrackSlot LJJLIIIJLLLLLLLZ() {
        return LJJJJL().LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC350850DpD
    public final void LJJLJLI() {
        LJJJJL().LJJLJLI();
    }

    @Override // X.InterfaceC354910Dvl
    public final boolean LJLIIIL() {
        return LJJI().LJLIIIL();
    }

    @Override // X.InterfaceC354910Dvl
    public final float LLIILZL() {
        return LJJI().LLIILZL();
    }

    @Override // X.InterfaceC354900Dvk
    public final float LLIZLLLIL() {
        return LJJLIIIJJIZ().LLIZLLLIL();
    }

    @Override // X.InterfaceC351350Dq1
    public final NLEModel LLZ() {
        if (LJI().getModel() != null) {
            return LJI().getModel();
        }
        NLEModel nLEModel = new NLEModel();
        LJI().setModel(nLEModel);
        return nLEModel;
    }

    @Override // X.InterfaceC351350Dq1
    public final NLEEditor LJI() {
        return this.LJIILLIIL;
    }

    public C354880Dvi(C0E48 c0e48) {
        this.LIZ = c0e48;
        NLE.loadNLELibrary$default(NLE.INSTANCE, false, C293550Bez.LIZ(), false, 5, null);
        this.LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1485));
        this.LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1473));
        this.LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1484));
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1486));
        this.LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1482));
        this.LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1474));
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1476));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1483));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1479));
        this.LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1472));
        this.LJIIJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1475));
        this.LJIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1478));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1481));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1477));
        this.LJIILL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1480));
        this.LJIILLIIL = C346630DiP.LIZ();
    }

    @Override // X.InterfaceC351130Dpf
    public final void LIZ(C350800Dp8 c350800Dp8) {
        LJIILIIL().LIZ(c350800Dp8);
    }

    @Override // X.InterfaceC351310Dpx
    public final Map<EnumC355950DxR, C351400Dq6> LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        return LJIIJ().LJIIIIZZ(nLETrackSlot);
    }

    @Override // X.InterfaceC354910Dvl
    public final Pair<Long, Long> LJJIJ(NLETrackSlot nLETrackSlot) {
        return LJJI().LJJIJ(nLETrackSlot);
    }

    @Override // X.InterfaceC350850DpD
    public final void LJJIJIIJI(long j) {
        LJJJJL().LJJIJIIJI(j);
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJJIL(long j) {
        LJJI().LJJIL(j);
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LJJJI(EnumC356070Dxd enumC356070Dxd) {
        return LJJLIIIJJIZ().LJJJI(enumC356070Dxd);
    }

    @Override // X.InterfaceC353780Dtw
    public final MaskParam LJJJJ(NLETrackSlot nLETrackSlot) {
        return LJJIJL().LJJJJ(nLETrackSlot);
    }

    @Override // X.InterfaceC351310Dpx
    public final NLETrackSlot LJJJJIZL(long j) {
        return LJIIJ().LJJJJIZL(j);
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LJJJJLL(EnumC356070Dxd enumC356070Dxd) {
        return LJJLIIIJJIZ().LJJJJLL(enumC356070Dxd);
    }

    @Override // X.InterfaceC351310Dpx
    public final NLETrack LJJJJZI(EnumC356070Dxd enumC356070Dxd) {
        return LJIIJ().LJJJJZI(enumC356070Dxd);
    }

    @Override // X.InterfaceC354900Dvk
    public final void LJJLI(InterfaceC351200Dpm interfaceC351200Dpm) {
        LJJLIIIJJIZ().LJJLI(interfaceC351200Dpm);
    }

    @Override // X.InterfaceC351350Dq1
    public final void LJJLIIIIJ(NLEEditor nLEEditor) {
        this.LJIILLIIL = nLEEditor;
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJJLIL(C354750DvV c354750DvV) {
        LJJIII().LJJLIL(c354750DvV);
    }

    @Override // X.InterfaceC354950Dvp
    public final void LJJLL(InterfaceC355380DwW interfaceC355380DwW) {
        ((InterfaceC354950Dvp) this.LJIILIIL.getValue()).LJJLL(interfaceC355380DwW);
    }

    @Override // X.InterfaceC351310Dpx
    public final void LJL(EnumC356070Dxd enumC356070Dxd) {
        LJIIJ().LJL(EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC353780Dtw
    public final void LJLILLLLZI(NLETrackSlot nLETrackSlot) {
        LJJIJL().LJLILLLLZI(nLETrackSlot);
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJLJJL(long j) {
        LJJI().LJLJJL(j);
    }

    @Override // X.InterfaceC354910Dvl
    public final NLETrackSlot LJLJJLL(C350340DoO c350340DoO) {
        return LJJI().LJLJJLL(c350340DoO);
    }

    @Override // X.InterfaceC351310Dpx
    public final Map<NLEHSLColorType, C351400Dq6> LJLZ(NLETrackSlot nLETrackSlot) {
        return LJIIJ().LJLZ(nLETrackSlot);
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJZ(NLETrack nLETrack) {
        LJJI().LJZ(nLETrack);
    }

    @Override // X.InterfaceC353130Dst
    public final AbstractC351020DpU LLIIIL(NLETrackSlot nLETrackSlot) {
        return LJJJIL().LLIIIL(nLETrackSlot);
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LLIL(EnumC356070Dxd enumC356070Dxd) {
        return LJJLIIIJJIZ().LLIL(enumC356070Dxd);
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LLILZ(EnumC356070Dxd enumC356070Dxd) {
        return LJJLIIIJJIZ().LLILZ(enumC356070Dxd);
    }

    @Override // X.InterfaceC354930Dvn
    public final Pair<NLETrack, NLETrackSlot> LIZIZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        return LJJIIJ().LIZIZ(nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC351130Dpf
    public final void LIZJ(C350790Dp7 c350790Dp7, EnumC356070Dxd enumC356070Dxd) {
        LJIILIIL().LIZJ(c350790Dp7, enumC356070Dxd);
    }

    @Override // X.InterfaceC351130Dpf
    public final void LJ(C350650Dot c350650Dot, EnumC356070Dxd enumC356070Dxd) {
        LJIILIIL().LJ(c350650Dot, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJIIIZ(NLETrackSlot nLETrackSlot, float f) {
        LJJIII().LJIIIZ(nLETrackSlot, f);
    }

    @Override // X.InterfaceC351130Dpf
    public final NLETrackSlot LJIIJJI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        return LJIILIIL().LJIIJJI(nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC353780Dtw
    public final void LJIIL(NLETrackSlot nLETrackSlot, MaskParam maskParam) {
        LJJIJL().LJIIL(nLETrackSlot, maskParam);
    }

    @Override // X.InterfaceC351310Dpx
    public final boolean LJIILLIIL(C351270Dpt c351270Dpt, EnumC356070Dxd enumC356070Dxd) {
        return LJIIJ().LJIILLIIL(c351270Dpt, enumC356070Dxd);
    }

    @Override // X.InterfaceC351130Dpf
    public final C443120HZe<Boolean, Boolean, NLEVideoAnimation> LJIJJLI(C350780Dp6 c350780Dp6, EnumC356070Dxd enumC356070Dxd) {
        return LJIILIIL().LJIJJLI(c350780Dp6, enumC356070Dxd);
    }

    @Override // X.InterfaceC353780Dtw
    public final void LJJIIZI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        LJJIJL().LJJIIZI(nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJJIJIIJIL(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        LJJIII().LJJIJIIJIL(nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC353130Dst
    public final boolean LJJIJLIJ(List list, AwS214S0300000_5 awS214S0300000_5) {
        return LJJJIL().LJJIJLIJ(list, awS214S0300000_5);
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJJJJZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        LJJI().LJJJJZ(nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final Pair<NLETrackSlot, NLETrackSlot> LJJJLIIL(C354760DvW c354760DvW, EnumC356070Dxd enumC356070Dxd) {
        return LJJIII().LJJJLIIL(c354760DvW, enumC356070Dxd);
    }

    @Override // X.InterfaceC350850DpD
    public final void LJJL(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        LJJJJL().LJJL(nLETrackSlot, nLETrackSlot2);
    }

    @Override // X.InterfaceC354940Dvo
    public final void LJJLIIIJ(C355420Dwa c355420Dwa, C360110E9x c360110E9x) {
        ((InterfaceC354940Dvo) this.LJIIJJI.getValue()).LJJLIIIJ(c355420Dwa, c360110E9x);
    }

    @Override // X.InterfaceC350850DpD
    public final void LJJLIIIJILLIZJL(C350820DpA c350820DpA, EnumC356070Dxd enumC356070Dxd) {
        LJJJJL().LJJLIIIJILLIZJL(c350820DpA, EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC353780Dtw
    public final MaskParam LJJLIIIJJI(NLETrackSlot nLETrackSlot, String str) {
        return LJJIJL().LJJLIIIJJI(nLETrackSlot, str);
    }

    @Override // X.InterfaceC354910Dvl
    public final Pair<NLETrack, NLETrackSlot> LJJLIIIJLJLI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        return LJJI().LJJLIIIJLJLI(nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJLJJI(C354780DvY c354780DvY, EnumC356070Dxd enumC356070Dxd) {
        LJJIII().LJLJJI(c354780DvY, enumC356070Dxd);
    }

    @Override // X.InterfaceC350850DpD
    public final void LJLJLJ(long j, EnumC356070Dxd enumC356070Dxd) {
        LJJJJL().LJLJLJ(j, enumC356070Dxd);
    }

    @Override // X.InterfaceC351310Dpx
    public final void LJLL(NLESegmentFilter nLESegmentFilter, C351280Dpu c351280Dpu) {
        LJIIJ().LJLL(nLESegmentFilter, c351280Dpu);
    }

    @Override // X.InterfaceC354900Dvk
    public final boolean LJLLI(EnumC356070Dxd enumC356070Dxd, InterfaceC349350Dmn interfaceC349350Dmn) {
        return LJJLIIIJJIZ().LJLLI(enumC356070Dxd, interfaceC349350Dmn);
    }

    @Override // X.InterfaceC353130Dst
    public final void LJLLLLLL(List<C350130Do3> list, C350990DpR c350990DpR) {
        LJJJIL().LJLLLLLL(list, c350990DpR);
    }

    @Override // X.InterfaceC353460DtQ
    public final void LLFFF(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        ((InterfaceC353460DtQ) this.LJFF.getValue()).LLFFF(nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LLIIIJ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        LJJIII().LLIIIJ(nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC354910Dvl
    public final NLETrackSlot LLILLIZIL(C350340DoO c350340DoO, EnumC356070Dxd enumC356070Dxd) {
        return LJJI().LLILLIZIL(c350340DoO, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LLILZIL(NLETrackSlot nLETrackSlot, Pair<Integer, Integer> pair) {
        LJJIII().LLILZIL(nLETrackSlot, pair);
    }

    @Override // X.InterfaceC350850DpD
    public final void LLJILLL(C350820DpA c350820DpA, EnumC356070Dxd enumC356070Dxd) {
        LJJJJL().LLJILLL(c350820DpA, enumC356070Dxd);
    }

    @Override // X.InterfaceC354900Dvk
    public final void changeVolume(float f, EnumC356070Dxd enumC356070Dxd) {
        LJJLIIIJJIZ().changeVolume(f, enumC356070Dxd);
    }

    @Override // X.InterfaceC351130Dpf
    public final NLETrackSlot LIZLLL(C350780Dp6 c350780Dp6, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
        return LJIILIIL().LIZLLL(c350780Dp6, enumC356070Dxd, nLEModel);
    }

    @Override // X.InterfaceC354920Dvm
    public final NLETrackSlot LJII(NLETrack nLETrack, C350470Dob c350470Dob, EnumC356070Dxd enumC356070Dxd) {
        return ((InterfaceC354920Dvm) this.LJIIIZ.getValue()).LJII(nLETrack, c350470Dob, enumC356070Dxd);
    }

    @Override // X.InterfaceC354930Dvn
    public final NLETrackSlot LJIJJ(NLETrack nLETrack, C350470Dob c350470Dob, EnumC356070Dxd enumC356070Dxd) {
        return LJJIIJ().LJIJJ(nLETrack, c350470Dob, enumC356070Dxd);
    }

    @Override // X.InterfaceC351310Dpx
    public final void LJJIFFI(NLESegmentFilter nLESegmentFilter, float f, EnumC355950DxR enumC355950DxR) {
        LJIIJ().LJJIFFI(nLESegmentFilter, f, enumC355950DxR);
    }

    @Override // X.InterfaceC354930Dvn
    public final NLETrackSlot LJJIIZ(NLETrack nLETrack, C350460Doa c350460Doa, EnumC356070Dxd enumC356070Dxd) {
        return LJJIIJ().LJJIIZ(nLETrack, c350460Doa, enumC356070Dxd);
    }

    @Override // X.InterfaceC354930Dvn
    public final NLENode LJJJ(NLETrackSlot nLETrackSlot, C350460Doa c350460Doa, EnumC356070Dxd enumC356070Dxd) {
        return LJJIIJ().LJJJ(nLETrackSlot, c350460Doa, enumC356070Dxd);
    }

    @Override // X.InterfaceC350930DpL
    public final Pair<NLETrack, NLETrackSlot> LJJJJI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
        return ((InterfaceC350930DpL) this.LJIIIIZZ.getValue()).LJJJJI(nLETrackSlot, enumC356070Dxd, nLEModel);
    }

    @Override // X.InterfaceC353460DtQ
    public final void LJJJJJ(NLETrackSlot nLETrackSlot, C350740Dp2 c350740Dp2, EnumC356070Dxd enumC356070Dxd) {
        ((InterfaceC353460DtQ) this.LJFF.getValue()).LJJJJJ(nLETrackSlot, c350740Dp2, enumC356070Dxd);
    }

    @Override // X.InterfaceC350930DpL
    public final NLETrackSlot LJJJLL(C089X c089x, C350910DpJ c350910DpJ, EnumC356070Dxd enumC356070Dxd) {
        return ((InterfaceC350930DpL) this.LJIIIIZZ.getValue()).LJJJLL(c089x, c350910DpJ, enumC356070Dxd);
    }

    @Override // X.InterfaceC354940Dvo
    public final void LJJJZ(NLETrackSlot nLETrackSlot, List<C351390Dq5> list, EnumC356070Dxd enumC356070Dxd) {
        ((InterfaceC354940Dvo) this.LJIIJJI.getValue()).LJJJZ(nLETrackSlot, list, enumC356070Dxd);
    }

    @Override // X.InterfaceC354940Dvo
    public final void LJJLIIJ(NLETrackSlot nLETrackSlot, C351410Dq7 c351410Dq7, EnumC356070Dxd enumC356070Dxd) {
        ((InterfaceC354940Dvo) this.LJIIJJI.getValue()).LJJLIIJ(nLETrackSlot, c351410Dq7, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJJZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, Function1<? super NLESegmentChromaChannel, Unit> function1) {
        LJJIII().LJJZ(nLETrackSlot, enumC356070Dxd, function1);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJJZZI(NLETrackSlot nLETrackSlot, int i, String str) {
        LJJIII().LJJZZI(nLETrackSlot, i, str);
    }

    @Override // X.InterfaceC353780Dtw
    public final void LJJZZIII(MaskParam maskParam, NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        LJJIJL().LJJZZIII(maskParam, nLETrackSlot, enumC356070Dxd);
    }

    @Override // X.InterfaceC354910Dvl
    public final Pair<Long, Long> LJLI(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, String str) {
        return LJJI().LJLI(nLETrackSlot, enumC356070Dxd, str);
    }

    @Override // X.InterfaceC354950Dvp
    public final void LJLJL(float f, float f2, InterfaceC355360DwU interfaceC355360DwU) {
        ((InterfaceC354950Dvp) this.LJIILIIL.getValue()).LJLJL(f, f2, interfaceC355360DwU);
    }

    @Override // X.InterfaceC350850DpD
    public final void LJLLILLLL(NLEModel nLEModel, NLETrackSlot nLETrackSlot, C0E48 c0e48) {
        LJJJJL().LJLLILLLL(nLEModel, nLETrackSlot, c0e48);
    }

    @Override // X.InterfaceC354900Dvk
    public final void LJLLJ(C351630DqT c351630DqT, EnumC356070Dxd enumC356070Dxd, NLETrackSlot nLETrackSlot) {
        LJJLIIIJJIZ().LJLLJ(c351630DqT, enumC356070Dxd, null);
    }

    @Override // X.InterfaceC354930Dvn
    public final NLETrackSlot LJLLLL(NLETrackSlot nLETrackSlot, C350460Doa c350460Doa, EnumC356070Dxd enumC356070Dxd) {
        return LJJIIJ().LJLLLL(nLETrackSlot, c350460Doa, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJZL(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, Function1<? super NLEAIMatting, Unit> function1) {
        LJJIII().LJZL(nLETrackSlot, enumC356070Dxd, function1);
    }

    @Override // X.InterfaceC354900Dvk
    public final void LLFII(C351600DqQ c351600DqQ, EnumC356070Dxd enumC356070Dxd, Function1<? super NLETrackSlot, Unit> function1) {
        LJJLIIIJJIZ().LLFII(c351600DqQ, enumC356070Dxd, function1);
    }

    @Override // X.InterfaceC354900Dvk
    public final Pair<NLETrack, NLETrackSlot> LLIIII(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, boolean z) {
        return LJJLIIIJJIZ().LLIIII(nLETrackSlot, enumC356070Dxd, z);
    }

    @Override // X.InterfaceC354910Dvl
    public final void LLIIIILZ(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, String str) {
        LJJI().LLIIIILZ(nLETrackSlot, enumC356070Dxd, str);
    }

    @Override // X.InterfaceC354930Dvn
    public final void LLIIJI(NLETrackSlot nLETrackSlot, C350460Doa c350460Doa, EnumC356070Dxd enumC356070Dxd) {
        LJJIIJ().LLIIJI(nLETrackSlot, c350460Doa, enumC356070Dxd);
    }

    @Override // X.InterfaceC353460DtQ
    public final void LLIIJLIL(NLETrackSlot nLETrackSlot, C350730Dp1 c350730Dp1, EnumC356070Dxd enumC356070Dxd) {
        ((InterfaceC353460DtQ) this.LJFF.getValue()).LLIIJLIL(nLETrackSlot, c350730Dp1, enumC356070Dxd);
    }

    @Override // X.InterfaceC353130Dst
    public final boolean LLIIL(List list, Boolean bool, AwS249S0300000_5 awS249S0300000_5) {
        return LJJJIL().LLIIL(list, bool, awS249S0300000_5);
    }

    @Override // X.InterfaceC354900Dvk
    public final void LLIIZ(boolean z, boolean z2, EnumC356070Dxd enumC356070Dxd) {
        LJJLIIIJJIZ().LLIIZ(z, z2, enumC356070Dxd);
    }

    @Override // X.InterfaceC353460DtQ
    public final void LLILL(NLETrackSlot nLETrackSlot, C350740Dp2 c350740Dp2, EnumC356070Dxd enumC356070Dxd) {
        ((InterfaceC353460DtQ) this.LJFF.getValue()).LLILL(nLETrackSlot, c350740Dp2, enumC356070Dxd);
    }

    @Override // X.InterfaceC354910Dvl
    public final NLETrackSlot LLILLL(C350340DoO c350340DoO, NLETrack nLETrack, EnumC356070Dxd enumC356070Dxd) {
        return LJJI().LLILLL(c350340DoO, nLETrack, enumC356070Dxd);
    }

    @Override // X.InterfaceC354900Dvk
    public final void LLIZ(NLETrackSlot nLETrackSlot, float f, EnumC356070Dxd enumC356070Dxd) {
        LJJLIIIJJIZ().LLIZ(nLETrackSlot, f, enumC356070Dxd);
    }

    @Override // X.InterfaceC354940Dvo
    public final void LLJILJIL(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, String str) {
        ((InterfaceC354940Dvo) this.LJIIJJI.getValue()).LLJILJIL(nLETrackSlot, enumC356070Dxd, str);
    }

    @Override // X.InterfaceC354950Dvp
    public final void LLJILJILJ(boolean z, ArrayList arrayList, C351500DqG c351500DqG) {
        ((InterfaceC354950Dvp) this.LJIILIIL.getValue()).LLJILJILJ(z, arrayList, c351500DqG);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJFF(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, float f, EnumC356070Dxd enumC356070Dxd) {
        LJJIII().LJFF(nLETrackSlot, nLETrackSlot2, f, enumC356070Dxd);
    }

    @Override // X.InterfaceC354910Dvl
    public final void LJIIZILJ(C350350DoP c350350DoP, NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, String str) {
        LJJI().LJIIZILJ(c350350DoP, nLETrackSlot, enumC356070Dxd, str);
    }

    @Override // X.InterfaceC354920Dvm
    public final Pair<NLETrack, NLETrackSlot> LJIJ(boolean z, NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
        return ((InterfaceC354920Dvm) this.LJIIIZ.getValue()).LJIJ(z, nLETrackSlot, enumC356070Dxd, nLEModel);
    }

    @Override // X.InterfaceC353130Dst
    public final void LJIJI(NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        LJJJIL().LJIJI(nLETrack, nLETrackSlot, z, z2);
    }

    @Override // X.InterfaceC353130Dst
    public final NLETrackSlot LJJ(EditMedia editMedia, C350990DpR c350990DpR, InterfaceC351060DpY interfaceC351060DpY, Function1<? super NLETrackSlot, Unit> function1) {
        return LJJJIL().LJJ(editMedia, c350990DpR, interfaceC351060DpY, function1);
    }

    @Override // X.InterfaceC353130Dst
    public final void LJJIIJZLJL(NLETrackSlot nLETrackSlot, int i, int i2, EnumC356070Dxd enumC356070Dxd) {
        LJJJIL().LJJIIJZLJL(nLETrackSlot, i, i2, enumC356070Dxd);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJLJI(NLETrackSlot nLETrackSlot, NLEResourceNode nLEResourceNode, StrokeParams strokeParams, EnumC356070Dxd enumC356070Dxd) {
        LJJIII().LJLJI(nLETrackSlot, nLEResourceNode, strokeParams, enumC356070Dxd);
    }

    @Override // X.InterfaceC353130Dst
    public final void LJLJLLL(List<EditMedia> list, C350990DpR c350990DpR, boolean z, Function1<? super NLETrackSlot, Unit> function1) {
        LJJJIL().LJLJLLL(list, c350990DpR, z, function1);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LLI(boolean z, NLETrackSlot nLETrackSlot, int i, EnumC356070Dxd enumC356070Dxd) {
        LJJIII().LLI(z, nLETrackSlot, i, enumC356070Dxd);
    }

    @Override // X.InterfaceC354910Dvl
    public final void LLII(long j, NLETrack nLETrack, long j2, NLETrackSlot nLETrackSlot) {
        LJJI().LLII(j, nLETrack, j2, nLETrackSlot);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LLILII(NLETrackSlot nLETrackSlot, String str, EnumC356150Dxl enumC356150Dxl, EnumC356070Dxd enumC356070Dxd) {
        LJJIII().LLILII(nLETrackSlot, str, enumC356150Dxl, enumC356070Dxd);
    }

    @Override // X.InterfaceC353130Dst
    public final void LLJ(NLETrackSlot nLETrackSlot, long j, long j2, EnumC356070Dxd enumC356070Dxd) {
        LJJJIL().LLJ(nLETrackSlot, j, j2, enumC356070Dxd);
    }

    @Override // X.InterfaceC353130Dst
    public final void LJIILJJIL(NLETrackSlot nLETrackSlot, long j, long j2, long j3, EnumC356070Dxd enumC356070Dxd) {
        LJJJIL().LJIILJJIL(nLETrackSlot, j, j2, j3, enumC356070Dxd);
    }

    @Override // X.InterfaceC354940Dvo
    public final void LJJIZ(NLETrackSlot nLETrackSlot, String str, int i, boolean z, EnumC356070Dxd enumC356070Dxd) {
        ((InterfaceC354940Dvo) this.LJIIJJI.getValue()).LJJIZ(nLETrackSlot, str, i, z, enumC356070Dxd);
    }

    @Override // X.InterfaceC354910Dvl
    public final NLETrackSlot LJJJJJL(NLETrackSlot nLETrackSlot, C350340DoO c350340DoO, int i, boolean z, EnumC356070Dxd enumC356070Dxd) {
        return LJJI().LJJJJJL(nLETrackSlot, c350340DoO, i, z, enumC356070Dxd);
    }

    @Override // X.InterfaceC354920Dvm
    public final boolean LJJJLZIJ(boolean z, NLETrackSlot nLETrackSlot, float f, boolean z2, EnumC356070Dxd enumC356070Dxd) {
        return ((InterfaceC354920Dvm) this.LJIIIZ.getValue()).LJJJLZIJ(z, nLETrackSlot, f, z2, enumC356070Dxd);
    }

    @Override // X.InterfaceC354920Dvm
    public final NLETrackSlot LJZI(boolean z, C350540Doi c350540Doi, NLETrack nLETrack, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
        return ((InterfaceC354920Dvm) this.LJIIIZ.getValue()).LJZI(z, c350540Doi, nLETrack, enumC356070Dxd, nLEModel);
    }

    @Override // X.InterfaceC354920Dvm
    public final NLETrackSlot LL(NLETrackSlot nLETrackSlot, C350540Doi c350540Doi, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel, boolean z) {
        return ((InterfaceC354920Dvm) this.LJIIIZ.getValue()).LL(nLETrackSlot, c350540Doi, enumC356070Dxd, nLEModel, z);
    }

    @Override // X.InterfaceC353130Dst
    public final void LLFZ(NLETrackSlot nLETrackSlot, long j, long j2, int i, EnumC356070Dxd enumC356070Dxd) {
        LJJJIL().LLFZ(nLETrackSlot, j, j2, i, enumC356070Dxd);
    }

    @Override // X.InterfaceC353780Dtw
    public final void LLIIIZ(MaskParam maskParam, NLETrackSlot nLETrackSlot, C0E1X c0e1x, EnumC356070Dxd enumC356070Dxd, Function1<? super NLETrackSlot, SizeF> function1) {
        LJJIJL().LLIIIZ(maskParam, nLETrackSlot, c0e1x, enumC356070Dxd, function1);
    }

    @Override // X.InterfaceC354900Dvk
    public final EnumC356180Dxo LLILLJJLI(AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, Function2 function2, EnumC356070Dxd enumC356070Dxd, C351590DqP c351590DqP) {
        return LJJLIIIJJIZ().LLILLJJLI(awS549S0100000_5, awS549S0100000_52, function2, enumC356070Dxd, c351590DqP);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJIL(NLETrackSlot nLETrackSlot, File file, int i, boolean z, NLEResourceNode nLEResourceNode, StrokeParams strokeParams, EnumC356070Dxd enumC356070Dxd, Function1<? super NLEAIMatting, Unit> function1) {
        LJJIII().LJIL(nLETrackSlot, file, i, z, nLEResourceNode, strokeParams, enumC356070Dxd, function1);
    }

    @Override // X.InterfaceC354890Dvj
    public final void LJLLL(NLETrackSlot nLETrackSlot, long j, float f, float f2, String str, String str2, ColorPickerInfo colorPickerInfo, EnumC356070Dxd enumC356070Dxd) {
        LJJIII().LJLLL(nLETrackSlot, j, f, f2, str, str2, colorPickerInfo, enumC356070Dxd);
    }

    @Override // X.InterfaceC353130Dst
    public final void LLD(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z, EnumC356070Dxd enumC356070Dxd) {
        LJJJIL().LLD(i, i2, nLETrackSlot, j, j2, j3, z, enumC356070Dxd);
    }
}
