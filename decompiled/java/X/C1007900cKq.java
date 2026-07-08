package X;

import Y.ACListenerS151S0100000_16;
import Y.AComparatorS24S0000000_5;
import Y.ARunnableS27S0101000_16;
import Y.ARunnableS85S0200000_16;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.hardware.SensorManager;
import android.os.Looper;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.android.commercialize.track.dynamic.dsl.DslDynamicParamRule;
import com.bytedance.android.commercialize.track.dynamic.dsl.DslEventDynamicParamRule;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.component.ctacomponent.AnoleTopviewCTAData;
import com.ss.android.ugc.aweme.component.foregroundvideocomponent.model.AnoleForegroundVideoModel;
import com.ss.android.ugc.aweme.component.gestureupcomponent.AnoleGestureContextModel;
import com.ss.android.ugc.aweme.component.searchcomponent.SearchAdSingleCardNativeCTA;
import com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard.SearchAdAIProductCardModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS28S0102000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS452S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007900cKq implements IAnoleManager, InterfaceC1014270cV7 {
    public final Context LIZ;
    public final Set<String> LIZIZ;
    public final C1009340cNA LIZJ;
    public final AnoleModel LIZLLL;
    public final InterfaceC1007910cKr LJ;
    public final C1008160cLG LJFF;
    public final Map<String, List<InterfaceC1007930cKt>> LJI;
    public final Map<String, InterfaceC1007930cKt> LJII;
    public final C01GW LJIIIIZZ;
    public C1008510cLp LJIIIZ;
    public int LJIIJ;
    public final ConcurrentLinkedQueue<C1008420cLg> LJIIJJI;
    public final BPEAHandler LJIIL;

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LIZLLL() {
        LJIIL("prerender", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0045 A[SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.IAnoleManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1007900cKq.LIZJ():void");
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    @InterfaceC1294060jmO
    public final void LJ() {
        Iterator<T> it2 = this.LJII.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1007930cKt) it2.next()).LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJFF() {
        Iterator<T> it2 = this.LJII.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1007930cKt) it2.next()).LJFF();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final boolean LJIILL() {
        Collection<InterfaceC1007930cKt> collectionValues = this.LJII.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((InterfaceC1007930cKt) it2.next()).Ak().getRenderStrategy(), "idle_prerender")) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1014270cV7
    public final void LJIILLIIL() {
        if (this.LJIIIZ != null) {
            try {
                C1300690jx5.LJ((SensorManager) this.LJIIIIZZ.getValue(), this.LJIIIZ, CertProviderManagerKt.findCert("bpea-commerce_shake_egg_unregister_sensor", 1476415492));
                this.LJIIIZ = null;
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1014270cV7
    public final void LJJLIIJ() {
        this.LJ.LJJLIIJ();
    }

    @Override // X.InterfaceC1014270cV7
    public final long LJJLIL() {
        return this.LJ.LJJLIL();
    }

    @Override // X.InterfaceC1014270cV7
    public final int LLJILLL() {
        return this.LJ.LLJILLL();
    }

    @Override // X.InterfaceC1014270cV7
    public final C1014390cVJ LLJJIJIIJIL() {
        return this.LJ.LLJJIJIIJIL();
    }

    @Override // X.InterfaceC1014270cV7
    public final void P() {
        this.LJ.P();
    }

    @Override // X.InterfaceC1014270cV7
    public final void U2() {
        this.LJ.U2();
    }

    @Override // X.InterfaceC1014270cV7
    public final JSONObject V2() {
        return this.LJ.V2();
    }

    @Override // X.InterfaceC1014270cV7
    public final C1014390cVJ Y2() {
        return this.LJ.Y2();
    }

    @Override // X.InterfaceC1014270cV7
    public final HashMap<String, Object> Z2() {
        return this.LJ.Z2();
    }

    @Override // X.InterfaceC1014270cV7
    public final ViewGroup b3() {
        return this.LJ.b3();
    }

    @Override // X.InterfaceC1014270cV7
    public final C1008080cL8 c3() {
        return this.LJ.c3();
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void clear() {
        Iterator<T> it2 = this.LJII.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1007930cKt) it2.next()).clear();
        }
        if (((Boolean) C262600AQw.LIZ.getValue()).booleanValue()) {
            BPEAHandler bPEAHandler = C1008010cL1.LIZ;
            RunnableC1007920cKs runnableC1007920cKs = C1008010cL1.LIZLLL;
            bPEAHandler.removeCallbacks(runnableC1007920cKs);
            C786410Ut5.LJLIIL(2000L, bPEAHandler, runnableC1007920cKs);
        }
    }

    @Override // X.InterfaceC1014270cV7
    public final Integer getVideoDuration() {
        return this.LJ.i3();
    }

    @Override // X.InterfaceC1014270cV7
    public final void o0() {
        this.LJ.o0();
    }

    @Override // X.InterfaceC1014270cV7
    public final void pauseVideo() {
        this.LJ.pauseVideo();
    }

    @Override // X.InterfaceC1014270cV7
    public final long r1() {
        return this.LJ.r1();
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LIZ() {
        LJIILLIIL();
        this.LJIIL.removeCallbacksAndMessages(null);
        Iterator<T> it2 = this.LJII.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC1007930cKt) it2.next()).LIZ();
        }
        C0C3J c0c3j = C0C3J.LIZ;
        C1008240cLO c1008240cLO = new C1008240cLO(this);
        c0c3j.getClass();
        if (((Boolean) C0C3J.LIZIZ.getValue()).booleanValue()) {
            c1008240cLO.invoke();
        }
    }

    @Override // X.InterfaceC1014270cV7
    public final int LJIILJJIL() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1014270cV7
    public final void LIZIZ(C1008500cLo c1008500cLo) {
        C1008490cLn.LIZIZ(this, new C1008510cLp(c1008500cLo, new C1008030cL3(this)));
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJI(String str) {
        AnoleComponentRelationModel anoleComponentRelationModel;
        Map<String, AnoleComponentRelationModel> map = this.LIZLLL.componentRelations;
        if (map != null && (anoleComponentRelationModel = map.get(str)) != null) {
            C1007940cKu.LJ(this, str, new C1008270cLR(), anoleComponentRelationModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJIIIIZZ(String str) {
        List<InterfaceC1007930cKt> list = this.LJI.get(str);
        if (list != null) {
            Iterator<InterfaceC1007930cKt> it2 = list.iterator();
            while (it2.hasNext()) {
                LJI(it2.next().getType());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final List<InterfaceC1007930cKt> LJIIJ(String str) {
        return this.LJI.get(str);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJIIJJI(String str) {
        List list = (List) ((LinkedHashMap) this.LJI).get(str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1007930cKt) it2.next()).LJ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final View LJIILIIL(String str) {
        List list;
        Object next;
        if (str == null || (list = (List) ((LinkedHashMap) this.LJI).get(str)) == null) {
            return null;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((InterfaceC1007930cKt) next).getType(), "video_3d_foreground")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1007930cKt interfaceC1007930cKt = (InterfaceC1007930cKt) next;
        if (interfaceC1007930cKt == null) {
            return null;
        }
        return interfaceC1007930cKt.getContentView();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    @Override // com.ss.android.ugc.aweme.IAnoleManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.AbstractC1007980cKy r20) {
        /*
            Method dump skipped, instruction units count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1007900cKq.LJIIZILJ(X.0cKy):void");
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJIJI(String str) {
        AnoleComponentRelationModel anoleComponentRelationModel;
        List list = (List) ((LinkedHashMap) this.LJI).get(str);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String type = ((InterfaceC1007930cKt) it2.next()).getType();
                Map<String, AnoleComponentRelationModel> map = this.LIZLLL.componentRelations;
                if (map != null && (anoleComponentRelationModel = map.get(type)) != null) {
                    C1007940cKu.LJFF(this, type, new C1008270cLR(), anoleComponentRelationModel);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final boolean LJIJJ(String str) {
        if (LJIIJ(str) == null) {
            return false;
        }
        return !r0.isEmpty();
    }

    public final void LJIJJLI(boolean z) {
        if (!this.LJ.d3() || this.LJ.e3()) {
            return;
        }
        if (z && !C2179771ASp.LJIIJJI(this.LIZ) && C2179771ASp.LIZ.getRingerMode() > 0) {
            ((Vibrator) C786410Ut5.H2(this.LIZ, "vibrator")).vibrate(500L);
        }
        C1007940cKu.LIZJ(this, new AbstractC1008090cL9() { // from class: X.0cLP
            @Override // X.AbstractC1008090cL9
            public final String LIZ() {
                return EnumC1008360cLa.SHAKE.getType();
            }
        });
        C1008020cL2.LIZ(this, C1004040cEc.LIZ);
    }

    @Override // X.InterfaceC1014270cV7
    public final C1014410cVL LLJJIJI(String str) {
        return this.LJ.LLJJIJI(str);
    }

    @Override // X.InterfaceC1014270cV7
    public final C1009390cNF W2(String str) {
        return this.LJ.W2(str);
    }

    @Override // X.InterfaceC1014270cV7
    public final void LJII(int i, String str) {
        this.LJ.g3(i);
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final boolean LJIIIZ(String str, String str2) {
        List<InterfaceC1007930cKt> listLJIIJ = LJIIJ(str);
        InterfaceC1007930cKt interfaceC1007930cKt = null;
        if (listLJIIJ != null) {
            Iterator<InterfaceC1007930cKt> it2 = listLJIIJ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC1007930cKt next = it2.next();
                if (Intrinsics.LJFF(next.getType(), str2)) {
                    interfaceC1007930cKt = next;
                    break;
                }
            }
            interfaceC1007930cKt = interfaceC1007930cKt;
        }
        if (interfaceC1007930cKt == null || !interfaceC1007930cKt.Jk()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAnoleManager
    public final void LJIIL(String str, Function1<? super Boolean, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rendering, strategy: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean z = false;
        for (InterfaceC1007930cKt interfaceC1007930cKt : this.LJII.values()) {
            String renderStrategy = interfaceC1007930cKt.Ak().getRenderStrategy();
            if (!Intrinsics.LJFF(renderStrategy, str)) {
                if (renderStrategy == null || renderStrategy.length() == 0) {
                    if (Intrinsics.LJFF(str, "prerender")) {
                    }
                }
            }
            if (C1056540dbI.LIZIZ()) {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS85S0200000_16(interfaceC1007930cKt, function1, 49));
                z = true;
            } else {
                interfaceC1007930cKt.Ck(function1);
            }
        }
        if (z && C1056540dbI.LIZIZ()) {
            C584640MwQ c584640MwQ = C1056540dbI.LJIIIZ;
            if (c584640MwQ == null) {
                c584640MwQ = new C584640MwQ("commerce_anole_manager_prerender", 2000L);
                C1056540dbI.LJIIIZ = c584640MwQ;
            }
            c584640MwQ.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1014270cV7
    public final void LJIJ(AbstractC991610buZ abstractC991610buZ, InterfaceC1007930cKt interfaceC1007930cKt) throws JSONException {
        AnoleComponentRelationModel anoleComponentRelationModel;
        final String str = interfaceC1007930cKt.Ak().type;
        if (abstractC991610buZ instanceof C989780brc) {
            String str2 = ((C989780brc) abstractC991610buZ).LIZ;
            Map<String, AnoleComponentRelationModel> map = this.LIZLLL.componentRelations;
            if (map != null && (anoleComponentRelationModel = map.get(str2)) != null) {
                C1007940cKu.LJFF(this, str2, new C1008270cLR(), anoleComponentRelationModel);
                return;
            }
            return;
        }
        if (abstractC991610buZ instanceof C991660bue) {
            LJI(((C991660bue) abstractC991610buZ).LIZ);
            return;
        }
        if (abstractC991610buZ instanceof C991690buh) {
            C1007940cKu.LIZJ(this, new AbstractC1008090cL9(str) { // from class: X.0cLI
                public final String LIZ;

                @Override // X.AbstractC1008090cL9
                public final String LIZ() {
                    return EnumC1008360cLa.OTHER_SHOW.getType();
                }

                {
                    this.LIZ = str;
                }

                @Override // X.AbstractC1008090cL9
                public final boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
                    if (!super.LIZJ(anoleComponentAppearModel)) {
                        return false;
                    }
                    return AbstractC1008090cL9.LIZIZ(this.LIZ, anoleComponentAppearModel.getSourceComponents());
                }
            });
            this.LJ.LIZIZ(C991870buz.LIZ, interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C991620bua) {
            C1007940cKu.LIZJ(this, new AbstractC1008090cL9(str) { // from class: X.0cLH
                public final String LIZ;

                @Override // X.AbstractC1008090cL9
                public final String LIZ() {
                    return EnumC1008360cLa.OTHER_HIDE.getType();
                }

                {
                    this.LIZ = str;
                }

                @Override // X.AbstractC1008090cL9
                public final boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
                    if (!super.LIZJ(anoleComponentAppearModel)) {
                        return false;
                    }
                    return AbstractC1008090cL9.LIZIZ(this.LIZ, anoleComponentAppearModel.getSourceComponents());
                }
            });
            this.LJ.LIZIZ(C991860buy.LIZ, interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C991300bu4) {
            C1007940cKu.LIZJ(this, new AbstractC1008090cL9(str) { // from class: X.0cLJ
                public final String LIZ;

                @Override // X.AbstractC1008090cL9
                public final String LIZ() {
                    return EnumC1008360cLa.OTHER_SHOW_FAILURE.getType();
                }

                {
                    this.LIZ = str;
                }

                @Override // X.AbstractC1008090cL9
                public final boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
                    if (!super.LIZJ(anoleComponentAppearModel)) {
                        return false;
                    }
                    return AbstractC1008090cL9.LIZIZ(this.LIZ, anoleComponentAppearModel.getSourceComponents());
                }
            });
            this.LJ.LIZIZ(new C991310bu5(((C991300bu4) abstractC991610buZ).LIZ), interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C989370bqx) {
            abstractC991610buZ.getClass();
            C1007940cKu.LIZJ(this, new AbstractC1008090cL9(str) { // from class: X.0cL5
                public final String LIZ;
                public final EnumC992070bvJ LIZIZ = null;

                @Override // X.AbstractC1008090cL9
                public final String LIZ() {
                    return EnumC1008360cLa.SLIDE.getType();
                }

                {
                    this.LIZ = str;
                }

                @Override // X.AbstractC1008090cL9
                public final boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
                    Object obj;
                    if (!super.LIZJ(anoleComponentAppearModel)) {
                        return false;
                    }
                    Map<String, Object> map2 = anoleComponentAppearModel.params;
                    Integer num = null;
                    if (map2 != null) {
                        obj = map2.get("direction");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    int value = this.LIZIZ.getValue();
                    if (num == null || num.intValue() != value) {
                        return false;
                    }
                    return AbstractC1008090cL9.LIZIZ(this.LIZ, anoleComponentAppearModel.getSourceComponents());
                }
            });
            this.LJ.LIZIZ(new AbstractC991850bux() { // from class: X.0bub
                public final EnumC992070bvJ LIZ = null;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C991630bub) && this.LIZ == ((C991630bub) obj).LIZ;
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Slide(direction=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            }, interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C991670buf) {
            C991670buf c991670buf = (C991670buf) abstractC991610buZ;
            final int i = c991670buf.LIZ;
            C1007940cKu.LIZJ(this, new AbstractC1008090cL9(str, i) { // from class: X.0cL7
                public final String LIZ;
                public final int LIZIZ;
                public final String LIZJ;

                @Override // X.AbstractC1008090cL9
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.AbstractC1008090cL9
                public final boolean LIZJ(AnoleComponentAppearModel anoleComponentAppearModel) {
                    Object obj;
                    if (!super.LIZJ(anoleComponentAppearModel)) {
                        return false;
                    }
                    Map<String, Object> map2 = anoleComponentAppearModel.params;
                    Integer num = null;
                    if (map2 != null) {
                        obj = map2.get("touchnumber");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    int i2 = this.LIZIZ;
                    if (num == null || num.intValue() != i2) {
                        return false;
                    }
                    return AbstractC1008090cL9.LIZIZ(this.LIZ, anoleComponentAppearModel.getSourceComponents());
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = i == 0 ? 1 : i;
                    this.LIZJ = EnumC1008360cLa.TAP.getType();
                }
            });
            this.LJ.LIZIZ(new C1005320cGg(c991670buf.LIZ, c991670buf.LIZIZ), interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C989590brJ) {
            this.LJ.LIZIZ(new C989600brK(((C989590brJ) abstractC991610buZ).LIZ, ((LinkedHashMap) this.LJI).keySet()), interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C991650bud) {
            InterfaceC1007910cKr interfaceC1007910cKr = this.LJ;
            abstractC991610buZ.getClass();
            interfaceC1007910cKr.LIZIZ(new AbstractC991850bux() { // from class: X.0buc
                public final boolean LIZ = false;
                public final EnumC992070bvJ LIZIZ = null;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C991640buc)) {
                        return false;
                    }
                    C991640buc c991640buc = (C991640buc) obj;
                    return this.LIZ == c991640buc.LIZ && this.LIZIZ == c991640buc.LIZIZ;
                }

                public final int hashCode() {
                    return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("SwipeUp(needRemove=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", direction=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            }, interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C991600buY) {
            C991600buY c991600buY = (C991600buY) abstractC991610buZ;
            this.LJ.LIZIZ(new C991590buX(c991600buY.LIZ, c991600buY.LIZIZ, c991600buY.LIZJ), interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C991710buj) {
            this.LJ.LIZIZ(C1008440cLi.LIZ, interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C991720buk) {
            this.LJ.LIZIZ(C1008450cLj.LIZ, interfaceC1007930cKt);
            return;
        }
        if (abstractC991610buZ instanceof C989550brF) {
            C989550brF c989550brF = (C989550brF) abstractC991610buZ;
            this.LJ.LIZIZ(new C989580brI(c989550brF.LIZ), interfaceC1007930cKt);
            T t = c989550brF.LIZ;
            if (t instanceof C1002950cCr) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event", ((C1002950cCr) t).LIZ);
                C1008020cL2.LIZ(this, new C991240bty(jSONObject));
                return;
            } else {
                if (!(t instanceof C1008130cLD)) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                C1008130cLD c1008130cLD = (C1008130cLD) t;
                jSONObject2.put("event", c1008130cLD.LIZ);
                jSONObject2.put("sell_points", c1008130cLD.LIZIZ);
                C1008020cL2.LIZ(this, new C991240bty(jSONObject2));
                return;
            }
        }
        if (abstractC991610buZ instanceof C989560brG) {
            C989560brG c989560brG = (C989560brG) abstractC991610buZ;
            InterfaceC1007930cKt interfaceC1007930cKt2 = this.LJII.get(c989560brG.LIZ);
            if (interfaceC1007930cKt2 == null) {
                return;
            }
            interfaceC1007930cKt2.Mk(new C991250btz(c989560brG.LIZIZ));
            return;
        }
        if (abstractC991610buZ instanceof C989540brE) {
            this.LJ.LIZIZ(new C989570brH(((C989540brE) abstractC991610buZ).LIZ), interfaceC1007930cKt);
        } else {
            if (abstractC991610buZ instanceof C991200btu) {
                C991200btu c991200btu = (C991200btu) abstractC991610buZ;
                C1008020cL2.LIZ(this, new C991210btv(c991200btu.LIZ, c991200btu.LIZIZ));
                return;
            }
            throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1014270cV7
    public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.LJ.LLJJIII(str, onLayoutChangeListener);
    }

    @Override // X.InterfaceC1014270cV7
    public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
        this.LJ.X2(str, viewOnLayoutChangeListenerC1014330cVD);
    }

    @Override // X.InterfaceC1014270cV7
    public final boolean a3(String str, Runnable runnable, int i) {
        return this.LJ.a3(str, runnable, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    @Override // com.ss.android.ugc.aweme.IAnoleManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mount(android.view.ViewGroup r14, java.lang.String r15, X.InterfaceC1014340cVE r16) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1007900cKq.mount(android.view.ViewGroup, java.lang.String, X.0cVE):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0cKq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43 */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    public C1007900cKq(Context context, Set<String> set, C1009340cNA c1009340cNA, AnoleModel anoleModel, InterfaceC1007910cKr interfaceC1007910cKr, C1008160cLG c1008160cLG) {
        Object obj;
        Map<String, C1023230cjZ> map;
        List listLJJLIIIJILLIZJL;
        String json;
        DslDynamicParamRule dslDynamicParamRule;
        Object c1014730cVr;
        InterfaceC1003440cDe interfaceC1003440cDe;
        InterfaceC1003440cDe interfaceC1003440cDe2;
        InterfaceC1009820cNw interfaceC1009820cNw;
        InterfaceC1014090cUp interfaceC1014090cUp;
        InterfaceC430190Gtt interfaceC430190Gtt;
        final InterfaceC1008890cMR interfaceC1008890cMR;
        InterfaceC1003440cDe interfaceC1003440cDe3;
        InterfaceC1003440cDe interfaceC1003440cDe4;
        InterfaceC1003440cDe interfaceC1003440cDe5;
        InterfaceC1003440cDe interfaceC1003440cDe6;
        final InterfaceC1003440cDe interfaceC1003440cDe7;
        InterfaceC1003440cDe interfaceC1003440cDe8;
        final InterfaceC1003440cDe interfaceC1003440cDe9;
        InterfaceC1003440cDe interfaceC1003440cDe10;
        InterfaceC1003440cDe interfaceC1003440cDe11;
        InterfaceC1014090cUp interfaceC1014090cUp2;
        final C1007900cKq obj2 = new Object();
        obj2.LIZ = context;
        obj2.LIZIZ = set;
        obj2.LIZJ = c1009340cNA;
        obj2.LIZLLL = anoleModel;
        obj2.LJ = interfaceC1007910cKr;
        obj2.LJFF = c1008160cLG;
        obj2.LJI = new LinkedHashMap();
        obj2.LJII = new LinkedHashMap();
        obj2.LJIIIIZZ = C452501pT.LIZIZ(new AwS560S0100000_16((C1007900cKq) obj2, 800));
        obj2.LJIIJJI = new ConcurrentLinkedQueue<>();
        obj2.LJIIL = new BPEAHandler(Looper.getMainLooper());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, AnoleComponentModel> map2 = anoleModel.components;
        C1007900cKq c1007900cKq = obj2;
        if (map2 != null) {
            Set<Map.Entry<String, AnoleComponentModel>> setEntrySet = map2.entrySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : setEntrySet) {
                if (obj2.LIZIZ.contains(((AnoleComponentModel) ((Map.Entry) obj3).getValue()).requireScene())) {
                    arrayList.add(obj3);
                }
            }
            List<Map.Entry> listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(91), arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : listLJLLLL) {
                Object key = entry.getKey();
                final AnoleComponentModel anoleComponentModel = (AnoleComponentModel) entry.getValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initComponent, type:");
                sbLIZ.append(anoleComponentModel.type);
                sbLIZ.append(",containerType:");
                sbLIZ.append(anoleComponentModel.containerType);
                C2188811AlT.LIZIZ(sbLIZ);
                String str = anoleComponentModel.containerType;
                if (Intrinsics.LJFF(str, "hybrid")) {
                    c1014730cVr = new C1014730cVr(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_cta")) {
                    C1009340cNA c1009340cNA2 = obj2.LIZJ;
                    Context context2 = obj2.LIZ;
                    C1008160cLG c1008160cLG2 = obj2.LJFF;
                    if (c1008160cLG2 != null) {
                        interfaceC1003440cDe = c1008160cLG2.LIZ;
                    } else {
                        interfaceC1003440cDe = null;
                    }
                    c1014730cVr = new C1003420cDc(anoleComponentModel, c1009340cNA2, obj2, context2, interfaceC1003440cDe);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_product_anchor")) {
                    C1009340cNA c1009340cNA3 = obj2.LIZJ;
                    Context context3 = obj2.LIZ;
                    C1008160cLG c1008160cLG3 = obj2.LJFF;
                    if (c1008160cLG3 != null) {
                        interfaceC1003440cDe2 = c1008160cLG3.LIZ;
                    } else {
                        interfaceC1003440cDe2 = null;
                    }
                    c1014730cVr = new C1003410cDb(anoleComponentModel, c1009340cNA3, obj2, context3, interfaceC1003440cDe2);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "profile_card")) {
                    C1009340cNA c1009340cNA4 = obj2.LIZJ;
                    Context context4 = obj2.LIZ;
                    C1008160cLG c1008160cLG4 = obj2.LJFF;
                    if (c1008160cLG4 != null) {
                        interfaceC1009820cNw = c1008160cLG4.LJ;
                    } else {
                        interfaceC1009820cNw = null;
                    }
                    c1014730cVr = new C1009800cNu(anoleComponentModel, c1009340cNA4, obj2, context4, interfaceC1009820cNw);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "feed_cta")) {
                    c1014730cVr = new C1004960cG6(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "topview_cta")) {
                    c1014730cVr = new AbstractC1014240cV4(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ) { // from class: X.0cDf
                        public final C01GW LLJLIL;
                        public View LLJLILLLLZIIL;

                        @Override // X.AbstractC1014240cV4
                        public final boolean LJIILIIL() {
                            return false;
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final C1014500cVU isReady() {
                            return new C1014500cVU(true, null);
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
                            String str2;
                            View viewFindViewById;
                            int iIntValue;
                            super.Fk(viewGroup, interfaceC1014340cVE);
                            AnoleTopviewCTAData anoleTopviewCTAData = (AnoleTopviewCTAData) this.LLJLIL.getValue();
                            if (anoleTopviewCTAData != null && (str2 = anoleTopviewCTAData.buttonText) != null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("initButtonLayout: ");
                                sbLIZ2.append(anoleTopviewCTAData);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.qn, this.LLJJIII, false);
                                this.LLJJIJIL = viewTd;
                                TextView textView = null;
                                if (viewTd != null) {
                                    viewFindViewById = viewTd.findViewById(R.id.b65);
                                } else {
                                    viewFindViewById = null;
                                }
                                this.LLJLILLLLZIIL = viewFindViewById;
                                View view = this.LLJJIJIL;
                                if (view != null) {
                                    textView = (TextView) view.findViewById(R.id.b64);
                                }
                                View view2 = this.LLJLILLLLZIIL;
                                if (view2 != null) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(anoleTopviewCTAData.getButtonHeight())));
                                    C786410Ut5.W5(view2, layoutParams);
                                    C1003890cEN c1003890cEN = AbstractViewOnClickListenerC1003880cEM.LLILLL;
                                    AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16(this, 385);
                                    c1003890cEN.getClass();
                                    C786410Ut5.I7(new C1003560cDq(awS595S0100000_16), view2);
                                    GradientDrawable gradientDrawable = new GradientDrawable();
                                    gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(6));
                                    gradientDrawable.setShape(0);
                                    view2.setBackground(gradientDrawable);
                                    view2.setBackgroundColor(anoleTopviewCTAData.getBackgroundColor());
                                    view2.setClipToOutline(true);
                                    view2.setOutlineProvider(new C1077150e8X(anoleTopviewCTAData, 0));
                                    C427690Gpr.LJ(view2, 0.0f);
                                }
                                if (textView != null) {
                                    textView.setText(str2);
                                    Integer num = anoleTopviewCTAData.textFontSize;
                                    if (num != null && (iIntValue = num.intValue()) > 0) {
                                        textView.setTextSize(iIntValue);
                                    }
                                    textView.setTextColor(anoleTopviewCTAData.getTextColor());
                                }
                            }
                        }

                        {
                            super(anoleComponentModel, c1009340cNA, obj2, context);
                            this.LLJLIL = C452501pT.LIZIZ(new AwS417S0200000_16(this, anoleComponentModel, 107));
                        }
                    };
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "native_display_card")) {
                    c1014730cVr = new ViewOnClickListenerC1003470cDh(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "ugen")) {
                    c1014730cVr = new C1015550cXB(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "vsa_full_screen_card")) {
                    c1014730cVr = new ViewOnClickListenerC1007560cKI(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "multi_video_card")) {
                    c1014730cVr = new C1013180cTM(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, EnumC1008920cMU.MULTI_CONTENT.getType())) {
                    C1022620cia.LIZ("AnoleManager", "return AnoleVideoPagerCardComponent");
                    c1014730cVr = new C1013310cTZ(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "native_end_layer")) {
                    c1014730cVr = new ViewOnClickListenerC1003740cE8(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "iab_native_loading_format")) {
                    C1009340cNA c1009340cNA5 = obj2.LIZJ;
                    Context context5 = obj2.LIZ;
                    C1008160cLG c1008160cLG5 = obj2.LJFF;
                    if (c1008160cLG5 != null) {
                        interfaceC1014090cUp = c1008160cLG5.LIZJ;
                    } else {
                        interfaceC1014090cUp = null;
                    }
                    c1014730cVr = new C1014050cUl(anoleComponentModel, c1009340cNA5, obj2, context5, interfaceC1014090cUp);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "tt_iab_bottom_bar_component")) {
                    C1009340cNA c1009340cNA6 = obj2.LIZJ;
                    Context context6 = obj2.LIZ;
                    C1008160cLG c1008160cLG6 = obj2.LJFF;
                    if (c1008160cLG6 != null) {
                        interfaceC430190Gtt = c1008160cLG6.LIZLLL;
                    } else {
                        interfaceC430190Gtt = null;
                    }
                    c1014730cVr = new C1009350cNB(anoleComponentModel, c1009340cNA6, obj2, context6, interfaceC430190Gtt);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "coin_widget")) {
                    final C1009340cNA c1009340cNA7 = obj2.LIZJ;
                    final Context context7 = obj2.LIZ;
                    C1008160cLG c1008160cLG7 = obj2.LJFF;
                    if (c1008160cLG7 != null) {
                        interfaceC1008890cMR = c1008160cLG7.LIZIZ;
                    } else {
                        interfaceC1008890cMR = null;
                    }
                    c1014730cVr = new AbstractC1014240cV4(anoleComponentModel, c1009340cNA7, obj2, context7, interfaceC1008890cMR) { // from class: X.0cMQ
                        public final InterfaceC1008890cMR LLJLIL;
                        public boolean LLJLILLLLZIIL;
                        public final C01GW LLJLL;
                        public final C01GW LLJLLIL;

                        @Override // X.AbstractC1014240cV4
                        public final boolean LJIILIIL() {
                            return false;
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final C1014500cVU isReady() {
                            return new C1014500cVU(true, null);
                        }

                        @Override // X.AbstractC1014240cV4
                        public final void LJIILL() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("AnoleCoinCounterComponent,type:");
                            sbLIZ2.append(this.LL.type);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        @Override // X.AbstractC1014240cV4
                        public final void LJIJI() {
                            super.LJIJI();
                            if (this.LLJLILLLLZIIL) {
                                LJIILL();
                                InterfaceC1008890cMR interfaceC1008890cMR2 = this.LLJLIL;
                                if (interfaceC1008890cMR2 != null) {
                                    interfaceC1008890cMR2.LIZ(this.LL.getCoinRewardData());
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
                        @Override // X.AbstractC1014240cV4
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LJII(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel r12) {
                            /*
                                Method dump skipped, instruction units count: 209
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1008880cMQ.LJII(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel):void");
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
                            String str2;
                            Boolean bool;
                            Map<String, String> mapLIZLLL;
                            InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq;
                            Object obj4;
                            if (abstractC1003980cEW instanceof C991730bul) {
                                LJIILL();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("HostVisibilityChanged visibility = ");
                                C991730bul c991730bul = (C991730bul) abstractC1003980cEW;
                                sbLIZ2.append(c991730bul.LIZ);
                                C2188811AlT.LIZIZ(sbLIZ2);
                                if (!this.LLJLILLLLZIIL) {
                                    return;
                                }
                                if (c991730bul.LIZ) {
                                    LJIILL();
                                    InterfaceC1008890cMR interfaceC1008890cMR2 = this.LLJLIL;
                                    if (interfaceC1008890cMR2 != null) {
                                        interfaceC1008890cMR2.LIZJ(this.LL.getCoinRewardData());
                                        return;
                                    }
                                    return;
                                }
                                LJIILL();
                                InterfaceC1008890cMR interfaceC1008890cMR3 = this.LLJLIL;
                                if (interfaceC1008890cMR3 == null) {
                                    return;
                                }
                                interfaceC1008890cMR3.LIZ(this.LL.getCoinRewardData());
                                return;
                            }
                            if (abstractC1003980cEW instanceof C991240bty) {
                                Map<String, String> mapLIZLLL2 = null;
                                try {
                                    Object obj5 = ((C991240bty) abstractC1003980cEW).LIZ.get("coin_task_event_type");
                                    if (obj5 instanceof String) {
                                        str2 = (String) obj5;
                                    } else {
                                        str2 = null;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    str2 = null;
                                }
                                try {
                                    obj4 = ((C991240bty) abstractC1003980cEW).LIZ.get("isSuccess");
                                } catch (Exception e2) {
                                    e = e2;
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                if (obj4 instanceof Boolean) {
                                    bool = (Boolean) obj4;
                                } else {
                                    bool = null;
                                }
                                LJIILL();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("BusinessCustomized taskEventType = ");
                                sbLIZ3.append(str2);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                LJIILL();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("BusinessCustomized params = ");
                                InterfaceC1008890cMR interfaceC1008890cMR4 = this.LLJLIL;
                                if (interfaceC1008890cMR4 != null) {
                                    mapLIZLLL = interfaceC1008890cMR4.LIZLLL(this.LL.getCoinRewardData());
                                } else {
                                    mapLIZLLL = null;
                                }
                                sbLIZ4.append(mapLIZLLL);
                                C2188811AlT.LIZIZ(sbLIZ4);
                                if (str2 != null) {
                                    LJIILL();
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("BusinessCustomized taskId = ");
                                    sbLIZ5.append(((Number) this.LLJLL.getValue()).intValue());
                                    C2188811AlT.LIZIZ(sbLIZ5);
                                    if (Intrinsics.LJFF(str2, "taskCompleted")) {
                                        C1013750cUH c1013750cUH = (C1013750cUH) this.LLJLLIL.getValue();
                                        InterfaceC1008890cMR interfaceC1008890cMR5 = this.LLJLIL;
                                        if (interfaceC1008890cMR5 != null) {
                                            mapLIZLLL2 = interfaceC1008890cMR5.LIZLLL(this.LL.getCoinRewardData());
                                        }
                                        int iIntValue = ((Number) this.LLJLL.getValue()).intValue();
                                        if (mapLIZLLL2 != null) {
                                            c1013750cUH.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) c1013750cUH.LIZJ.getValue(), new AwS28S0102000_16(mapLIZLLL2, iIntValue, 5));
                                            return;
                                        } else {
                                            c1013750cUH.getClass();
                                            return;
                                        }
                                    }
                                    if (Intrinsics.LJFF(str2, "rewardCompleted")) {
                                        C1013750cUH c1013750cUH2 = (C1013750cUH) this.LLJLLIL.getValue();
                                        InterfaceC1008890cMR interfaceC1008890cMR6 = this.LLJLIL;
                                        if (interfaceC1008890cMR6 != null) {
                                            mapLIZLLL2 = interfaceC1008890cMR6.LIZLLL(this.LL.getCoinRewardData());
                                        }
                                        int iIntValue2 = ((Number) this.LLJLL.getValue()).intValue();
                                        boolean zLJFF = Intrinsics.LJFF(bool, Boolean.TRUE);
                                        if (mapLIZLLL2 != null) {
                                            if (!zLJFF) {
                                                interfaceC1023400cjq = (InterfaceC1023400cjq) c1013750cUH2.LJ.getValue();
                                            } else {
                                                interfaceC1023400cjq = (InterfaceC1023400cjq) c1013750cUH2.LIZLLL.getValue();
                                            }
                                            c1013750cUH2.logAd(interfaceC1023400cjq, new AwS124S0101000_16(iIntValue2, mapLIZLLL2, 15));
                                            return;
                                        }
                                        c1013750cUH2.getClass();
                                    }
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void Fk(android.view.ViewGroup r4, X.InterfaceC1014340cVE r5) {
                            /*
                                r3 = this;
                                super.Fk(r4, r5)
                                r3.LJIILL()
                                android.widget.FrameLayout r2 = new android.widget.FrameLayout
                                android.content.Context r0 = r3.LLILZ
                                r2.<init>(r0)
                                android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
                                r0 = -2
                                r1.<init>(r0, r0)
                                X.C786410Ut5.a6(r2, r1)
                                r3.LLJJIJIL = r2
                                X.0cMR r1 = r3.LLJLIL
                                if (r1 == 0) goto L40
                                com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r3.LL
                                com.ss.android.ugc.aweme.commercialize.model.CoinRewardData r0 = r0.getCoinRewardData()
                                boolean r1 = r1.LIZIZ(r0)
                                r0 = 1
                                if (r1 != r0) goto L40
                            L29:
                                r3.LLJLILLLLZIIL = r0
                                r3.LJIILL()
                                java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                                java.lang.String r0 = "initCoinWidget shouldShowTimerPendantView = "
                                r1.append(r0)
                                boolean r0 = r3.LLJLILLLLZIIL
                                r1.append(r0)
                                X.C2188811AlT.LIZIZ(r1)
                                return
                            L40:
                                r0 = 0
                                goto L29
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1008880cMQ.Fk(android.view.ViewGroup, X.0cVE):void");
                        }

                        {
                            super(anoleComponentModel, c1009340cNA7, obj2, context7);
                            this.LLJLIL = interfaceC1008890cMR;
                            this.LLJLL = C452501pT.LIZIZ(new AwS560S0100000_16(c1009340cNA7, 781));
                            this.LLJLLIL = C452501pT.LIZIZ(new AwS417S0200000_16(c1009340cNA7, anoleComponentModel, 79));
                        }
                    };
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "up_slide")) {
                    c1014730cVr = new C1003650cDz(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "full_screen_gesture")) {
                    final C1009340cNA c1009340cNA8 = obj2.LIZJ;
                    final Context context8 = obj2.LIZ;
                    c1014730cVr = new AbstractC1014240cV4(anoleComponentModel, c1009340cNA8, obj2, context8) { // from class: X.0cDr
                        public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 222));
                        public View LLJLILLLLZIIL;

                        @Override // X.AbstractC1014240cV4
                        public final boolean LJIILIIL() {
                            return false;
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final C1014500cVU isReady() {
                            return new C1014500cVU(true, null);
                        }

                        @Override // X.AbstractC1014240cV4
                        public final void LJIILL() {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("AnoleGestureComponent,type:");
                            sbLIZ2.append(this.LL.type);
                            C2188811AlT.LIZIZ(sbLIZ2);
                        }

                        @Override // X.AbstractC1014240cV4
                        public final void LJIJI() {
                            ViewGroup viewGroup;
                            super.LJIJI();
                            View view = this.LLJLILLLLZIIL;
                            if (view != null) {
                                view.setOnTouchListener(null);
                                ViewParent parent = view.getParent();
                                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                                }
                            }
                            this.LLJLILLLLZIIL = null;
                            this.LLJJIJIL = null;
                        }

                        @Override // X.AbstractC1014240cV4
                        public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
                            AnoleGestureContextModel anoleGestureContextModel;
                            String str2;
                            AnoleGestureContextModel.SlideContext slideContext;
                            AnoleLogInfo logInfo;
                            AnoleGestureContextModel.TapContext tapContext;
                            AnoleLogInfo logInfo2;
                            super.LJII(anoleComponentAppearModel);
                            AnoleGestureContextModel anoleGestureContextModel2 = (AnoleGestureContextModel) this.LLJLIL.getValue();
                            Long lValueOf = null;
                            if ((anoleGestureContextModel2 == null || (tapContext = anoleGestureContextModel2.getTapContext()) == null || (logInfo2 = tapContext.getLogInfo()) == null || (str2 = logInfo2.tag) == null) && ((anoleGestureContextModel = (AnoleGestureContextModel) this.LLJLIL.getValue()) == null || (slideContext = anoleGestureContextModel.getSlideContext()) == null || (logInfo = slideContext.getLogInfo()) == null || (str2 = logInfo.tag) == null)) {
                                str2 = "draw_ad";
                            }
                            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str2, "othershow", this.LLILLJJLI.LIZLLL);
                            c1022820ciuLIZLLL.LIZJ("full_screen_gesture", "refer");
                            c1022820ciuLIZLLL.LIZIZ(Long.valueOf(this.LL.getID()), "component_id");
                            AnoleModel anoleModel2 = this.LLILLJJLI.LIZLLL.getAnoleModel();
                            if (anoleModel2 != null) {
                                lValueOf = Long.valueOf(anoleModel2.templateID);
                            }
                            c1022820ciuLIZLLL.LIZIZ(lValueOf, "template_id");
                            c1022820ciuLIZLLL.LIZIZ(this.LL.type, "component_type");
                            c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
                            c1022820ciuLIZLLL.LJII();
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
                            super.Fk(viewGroup, interfaceC1014340cVE);
                            AnoleGestureContextModel anoleGestureContextModel = (AnoleGestureContextModel) this.LLJLIL.getValue();
                            if (anoleGestureContextModel == null) {
                                return;
                            }
                            if (anoleGestureContextModel.getTapContext() == null && anoleGestureContextModel.getSlideContext() == null) {
                                return;
                            }
                            C1003610cDv c1003610cDv = new C1003610cDv(this.LLILZ, anoleGestureContextModel, new AwS452S0200000_16(anoleGestureContextModel, this, 0), new C1003580cDs(anoleGestureContextModel, this));
                            View view = new View(this.LLILZ);
                            view.setBackgroundColor(0);
                            C786410Ut5.W5(view, new ViewGroup.LayoutParams(-1, -1));
                            view.setOnTouchListener(c1003610cDv.LJII);
                            this.LLJLILLLLZIIL = view;
                            this.LLJJIJIL = view;
                            viewGroup.addView(view);
                        }
                    };
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "feed_comment_top_bar")) {
                    c1014730cVr = new ViewOnClickListenerC1012390cS5(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "feed_comment_bottom_banner")) {
                    c1014730cVr = new C1012510cSH(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "feed_product_tiles")) {
                    c1014730cVr = new C1021680ch4(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "labeled_count_down")) {
                    c1014730cVr = new C1003040cD0(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "policy_label_container")) {
                    c1014730cVr = new C1008580cLw(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "live_redirect_banner")) {
                    c1014730cVr = new C1003130cD9(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_shop_ad_product_card")) {
                    C1009340cNA c1009340cNA9 = obj2.LIZJ;
                    Context context9 = obj2.LIZ;
                    C1008160cLG c1008160cLG8 = obj2.LJFF;
                    if (c1008160cLG8 != null) {
                        interfaceC1003440cDe3 = c1008160cLG8.LIZ;
                    } else {
                        interfaceC1003440cDe3 = null;
                    }
                    c1014730cVr = new C1007610cKN(anoleComponentModel, c1009340cNA9, obj2, context9, interfaceC1003440cDe3);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_shop_ad_card_header")) {
                    C1009340cNA c1009340cNA10 = obj2.LIZJ;
                    Context context10 = obj2.LIZ;
                    C1008160cLG c1008160cLG9 = obj2.LJFF;
                    if (c1008160cLG9 != null) {
                        interfaceC1003440cDe4 = c1008160cLG9.LIZ;
                    } else {
                        interfaceC1003440cDe4 = null;
                    }
                    c1014730cVr = new C1012630cST(anoleComponentModel, c1009340cNA10, obj2, context10, interfaceC1003440cDe4);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_enhanced_style_anchor")) {
                    C1009340cNA c1009340cNA11 = obj2.LIZJ;
                    Context context11 = obj2.LIZ;
                    C1008160cLG c1008160cLG10 = obj2.LJFF;
                    if (c1008160cLG10 != null) {
                        interfaceC1003440cDe5 = c1008160cLG10.LIZ;
                    } else {
                        interfaceC1003440cDe5 = null;
                    }
                    c1014730cVr = new C1007670cKT(anoleComponentModel, c1009340cNA11, obj2, context11, interfaceC1003440cDe5);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_ad_app_card")) {
                    C1009340cNA c1009340cNA12 = obj2.LIZJ;
                    Context context12 = obj2.LIZ;
                    C1008160cLG c1008160cLG11 = obj2.LJFF;
                    if (c1008160cLG11 != null) {
                        interfaceC1003440cDe6 = c1008160cLG11.LIZ;
                    } else {
                        interfaceC1003440cDe6 = null;
                    }
                    c1014730cVr = new C1005370cGl(anoleComponentModel, c1009340cNA12, obj2, context12, interfaceC1003440cDe6);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_ad_card_list")) {
                    final C1009340cNA c1009340cNA13 = obj2.LIZJ;
                    final Context context13 = obj2.LIZ;
                    C1008160cLG c1008160cLG12 = obj2.LJFF;
                    if (c1008160cLG12 != null) {
                        interfaceC1003440cDe7 = c1008160cLG12.LIZ;
                    } else {
                        interfaceC1003440cDe7 = null;
                    }
                    c1014730cVr = new AbstractC1014240cV4(anoleComponentModel, c1009340cNA13, obj2, context13, interfaceC1003440cDe7) { // from class: X.0cGe
                        public final InterfaceC1003440cDe LLJLIL;
                        public final C01GW LLJLILLLLZIIL;
                        public SearchAdAIProductCardModel LLJLL;
                        public final C01GW LLJLLIL;

                        @Override // X.AbstractC1014240cV4
                        public final boolean LJIILIIL() {
                            return false;
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final C1014500cVU isReady() {
                            return new C1014500cVU(true, null);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
                        /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
                        /* JADX WARN: Removed duplicated region for block: B:47:0x00c7  */
                        /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
                        /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void Fk(android.view.ViewGroup r15, X.InterfaceC1014340cVE r16) {
                            /*
                                Method dump skipped, instruction units count: 245
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1005300cGe.Fk(android.view.ViewGroup, X.0cVE):void");
                        }

                        {
                            Object c098200Yq;
                            super(anoleComponentModel, c1009340cNA13, obj2, context13);
                            this.LLJLIL = interfaceC1003440cDe7;
                            this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 970));
                            C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(523));
                            this.LLJLLIL = c01gwLIZIZ;
                            try {
                                C1227904rF c1227904rF = (C1227904rF) c01gwLIZIZ.getValue();
                                C1227904rF c1227904rF2 = (C1227904rF) c01gwLIZIZ.getValue();
                                Map<String, ? extends Object> map3 = anoleComponentModel.data;
                                c1227904rF2.getClass();
                                String strLJI = C1227904rF.LJI(map3);
                                c1227904rF.getClass();
                                c098200Yq = (SearchAdAIProductCardModel) C1227904rF.LIZIZ(strLJI, SearchAdAIProductCardModel.class);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            this.LLJLL = (SearchAdAIProductCardModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                        }
                    };
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_open_loop_anchor")) {
                    C1009340cNA c1009340cNA14 = obj2.LIZJ;
                    Context context14 = obj2.LIZ;
                    C1008160cLG c1008160cLG13 = obj2.LJFF;
                    if (c1008160cLG13 != null) {
                        interfaceC1003440cDe8 = c1008160cLG13.LIZ;
                    } else {
                        interfaceC1003440cDe8 = null;
                    }
                    c1014730cVr = new C1005260cGa(anoleComponentModel, c1009340cNA14, obj2, context14, interfaceC1003440cDe8);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_single_card_native_cta")) {
                    final C1009340cNA c1009340cNA15 = obj2.LIZJ;
                    final Context context15 = obj2.LIZ;
                    C1008160cLG c1008160cLG14 = obj2.LJFF;
                    if (c1008160cLG14 != null) {
                        interfaceC1003440cDe9 = c1008160cLG14.LIZ;
                    } else {
                        interfaceC1003440cDe9 = null;
                    }
                    c1014730cVr = new AbstractC1014240cV4(anoleComponentModel, c1009340cNA15, obj2, context15, interfaceC1003440cDe9) { // from class: X.0cDC
                        public final SearchAdSingleCardNativeCTA LLJLIL;
                        public final EnumC994810bzj LLJLILLLLZIIL;
                        public C427870Gq9 LLJLL;
                        public TuxTextView LLJLLIL;

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final C1014500cVU isReady() {
                            return new C1014500cVU(true, null);
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
                            View viewLIZIZ;
                            TuxTextView tuxTextView;
                            String defaultText;
                            String icon;
                            String title;
                            super.Fk(viewGroup, interfaceC1014340cVE);
                            EnumC994810bzj enumC994810bzj = this.LLJLILLLLZIIL;
                            EnumC994810bzj enumC994810bzj2 = EnumC994810bzj.DEFAULT;
                            if (enumC994810bzj == enumC994810bzj2) {
                                viewLIZIZ = C21146717pB.LIZIZ(this.LLILZ, R.layout.qj, this.LLJJIII, false);
                            } else {
                                viewLIZIZ = C21146717pB.LIZIZ(this.LLILZ, R.layout.qk, this.LLJJIII, false);
                            }
                            this.LLJJIJIL = viewLIZIZ;
                            this.LLJLL = (C427870Gq9) viewLIZIZ.findViewById(R.id.bh2);
                            View view = this.LLJJIJIL;
                            String icon2 = null;
                            if (view != null) {
                                tuxTextView = (TuxTextView) view.findViewById(R.id.ewp);
                            } else {
                                tuxTextView = null;
                            }
                            this.LLJLLIL = tuxTextView;
                            View view2 = this.LLJJIJIL;
                            if (view2 != null) {
                                view2.findViewById(R.id.b8y);
                            }
                            int i = C994820bzk.LIZ[this.LLJLILLLLZIIL.ordinal()];
                            if (i != 1) {
                                if (i == 2) {
                                    TuxTextView tuxTextView2 = this.LLJLLIL;
                                    if (tuxTextView2 != null) {
                                        SearchAdSingleCardNativeCTA searchAdSingleCardNativeCTA = this.LLJLIL;
                                        if (searchAdSingleCardNativeCTA != null) {
                                            title = searchAdSingleCardNativeCTA.getTitle();
                                        } else {
                                            title = null;
                                        }
                                        tuxTextView2.setText(title);
                                    }
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                TuxTextView tuxTextView3 = this.LLJLLIL;
                                if (tuxTextView3 != null) {
                                    SearchAdSingleCardNativeCTA searchAdSingleCardNativeCTA2 = this.LLJLIL;
                                    if (searchAdSingleCardNativeCTA2 != null) {
                                        defaultText = searchAdSingleCardNativeCTA2.getDefaultText();
                                    } else {
                                        defaultText = null;
                                    }
                                    tuxTextView3.setText(defaultText);
                                }
                            }
                            View view3 = this.LLJJIJIL;
                            if (view3 != null) {
                                view3.setClipToOutline(true);
                                view3.setOutlineProvider(new C0ID9(30));
                                C427690Gpr.LJ(view3, 0.0f);
                            }
                            if (this.LLJLILLLLZIIL != enumC994810bzj2) {
                                SearchAdSingleCardNativeCTA searchAdSingleCardNativeCTA3 = this.LLJLIL;
                                if (searchAdSingleCardNativeCTA3 != null && (icon = searchAdSingleCardNativeCTA3.getIcon()) != null && icon.length() != 0) {
                                    SearchAdSingleCardNativeCTA searchAdSingleCardNativeCTA4 = this.LLJLIL;
                                    if (searchAdSingleCardNativeCTA4 != null) {
                                        icon2 = searchAdSingleCardNativeCTA4.getIcon();
                                    }
                                    C03IT c03it = new C03IT(Collections.singletonList(icon2));
                                    C427870Gq9 c427870Gq9 = this.LLJLL;
                                    if (c427870Gq9 != null) {
                                        C786410Ut5.LLLLJI(c427870Gq9, 0);
                                    }
                                    C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(c03it);
                                    c1331670kl3LJIIJ.LJJ(this.LLJLL);
                                    C786410Ut5.h3(c1331670kl3LJIIJ);
                                } else {
                                    C427870Gq9 c427870Gq92 = this.LLJLL;
                                    if (c427870Gq92 != null) {
                                        C786410Ut5.LLLLJI(c427870Gq92, 8);
                                    }
                                }
                            }
                            View view4 = this.LLJJIJIL;
                            if (view4 != null) {
                                C786410Ut5.I7(new ACListenerS151S0100000_16(this, 139), view4);
                            }
                        }

                        {
                            Object c098200Yq;
                            String title;
                            super(anoleComponentModel, c1009340cNA15, obj2, context15);
                            this.LLJLILLLLZIIL = EnumC994810bzj.DEFAULT;
                            try {
                                C1227904rF c1227904rF = C1227904rF.LIZ;
                                Map<String, ? extends Object> map3 = anoleComponentModel.data;
                                c1227904rF.getClass();
                                c098200Yq = (SearchAdSingleCardNativeCTA) C1227904rF.LIZIZ(C1227904rF.LJI(map3), SearchAdSingleCardNativeCTA.class);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            SearchAdSingleCardNativeCTA searchAdSingleCardNativeCTA = (SearchAdSingleCardNativeCTA) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
                            this.LLJLIL = searchAdSingleCardNativeCTA;
                            if (searchAdSingleCardNativeCTA != null && (title = searchAdSingleCardNativeCTA.getTitle()) != null && title.length() != 0) {
                                this.LLJLILLLLZIIL = EnumC994810bzj.NORMAL;
                            }
                        }
                    };
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_ai_agent_hints")) {
                    C1009340cNA c1009340cNA16 = obj2.LIZJ;
                    Context context16 = obj2.LIZ;
                    C1008160cLG c1008160cLG15 = obj2.LJFF;
                    if (c1008160cLG15 != null) {
                        interfaceC1003440cDe10 = c1008160cLG15.LIZ;
                    } else {
                        interfaceC1003440cDe10 = null;
                    }
                    c1014730cVr = new C1012050cRX(anoleComponentModel, c1009340cNA16, obj2, context16, interfaceC1003440cDe10);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "search_ai_agent_summary")) {
                    C1009340cNA c1009340cNA17 = obj2.LIZJ;
                    Context context17 = obj2.LIZ;
                    C1008160cLG c1008160cLG16 = obj2.LJFF;
                    if (c1008160cLG16 != null) {
                        interfaceC1003440cDe11 = c1008160cLG16.LIZ;
                    } else {
                        interfaceC1003440cDe11 = null;
                    }
                    c1014730cVr = new C1012150cRh(anoleComponentModel, c1009340cNA17, obj2, context17, interfaceC1003440cDe11);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "supplemental_info")) {
                    c1014730cVr = new C1003370cDX(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                    obj2 = obj2;
                } else if (Intrinsics.LJFF(str, "video_3d_foreground")) {
                    c1014730cVr = new AbstractC1014240cV4(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ) { // from class: X.0cHN
                        public final C01GW LLJLIL;

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final boolean Hk() {
                            return true;
                        }

                        @Override // X.AbstractC1014240cV4
                        public final boolean LJIILIIL() {
                            return false;
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final C1014500cVU isReady() {
                            return new C1014500cVU(true, null);
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final View getContentView() {
                            return this.LLJJIJIL;
                        }

                        @Override // X.AbstractC1014240cV4
                        public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
                            super.LJII(anoleComponentAppearModel);
                            LJIIJ().logAd(C1005760cHO.LIZ, new AwS595S0100000_16(this, 241));
                        }

                        @Override // X.AbstractC1014240cV4
                        public final void LJIIIIZZ(String str2) {
                            super.LJIIIIZZ(str2);
                            LJIIJ().logAd(C1005800cHS.LIZ, new AwS595S0100000_16(this, 242));
                        }

                        @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                        public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
                            AnoleForegroundVideoModel anoleForegroundVideoModel;
                            super.Fk(viewGroup, interfaceC1014340cVE);
                            if (Ek() && (anoleForegroundVideoModel = (AnoleForegroundVideoModel) this.LLJLIL.getValue()) != null) {
                                List<Integer> list = anoleForegroundVideoModel.blockList;
                                if (list != null) {
                                    Iterator<Integer> it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        int iIntValue = it2.next().intValue();
                                        this.LLILLL.a3(String.valueOf(iIntValue), new ARunnableS27S0101000_16(iIntValue, this, 8), iIntValue);
                                    }
                                }
                                List<Integer> list2 = anoleForegroundVideoModel.resumeList;
                                if (list2 != null) {
                                    Iterator<Integer> it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        int iIntValue2 = it3.next().intValue();
                                        this.LLILLL.a3(String.valueOf(iIntValue2), new ARunnableS27S0101000_16(iIntValue2, this, 9), iIntValue2);
                                    }
                                }
                            }
                        }

                        {
                            this.LLJJIJIL = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.pj, this.LLJJIII, false);
                            this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 716));
                        }
                    };
                    obj2 = obj2;
                } else if (!Intrinsics.LJFF(str, EnumC1008920cMU.PROGRESS_BAR.getType()) && !Intrinsics.LJFF(str, EnumC1008920cMU.MULTI_PROGRESS_BAR.getType())) {
                    if (Intrinsics.LJFF(str, EnumC1008920cMU.PLAYER.getType())) {
                        c1014730cVr = new C1018320cbe(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "infeed_playable")) {
                        c1014730cVr = new C1013880cUU(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "native_playable_convert_format")) {
                        c1014730cVr = new C1003830cEH(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "dual_buttons")) {
                        c1014730cVr = new C1008780cMG(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "iab_top_bar")) {
                        C1009340cNA c1009340cNA18 = obj2.LIZJ;
                        Context context18 = obj2.LIZ;
                        C1008160cLG c1008160cLG17 = obj2.LJFF;
                        if (c1008160cLG17 != null) {
                            interfaceC1014090cUp2 = c1008160cLG17.LIZJ;
                        } else {
                            interfaceC1014090cUp2 = null;
                        }
                        c1014730cVr = new C1007080cJW(anoleComponentModel, c1009340cNA18, obj2, context18, interfaceC1014090cUp2);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "iab_native_playable_convert")) {
                        c1014730cVr = new C1003840cEI(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "native_playable_loading_format")) {
                        c1014730cVr = new C1008860cMO(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, EnumC1008920cMU.UNDER_WATER_BANNER.getType())) {
                        c1014730cVr = new C1008830cML(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "repetitive_video_banner")) {
                        final C1009340cNA c1009340cNA19 = obj2.LIZJ;
                        final Context context19 = obj2.LIZ;
                        c1014730cVr = new AbstractC1014240cV4(anoleComponentModel, c1009340cNA19, obj2, context19) { // from class: X.0cJJ
                            public final C1006970cJL LLJLIL;

                            @Override // X.AbstractC1014240cV4
                            public final boolean LJIILJJIL() {
                                return true;
                            }

                            @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                            public final C1014500cVU isReady() {
                                return new C1014500cVU(true, null);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[PHI: r11
                              0x00ba: PHI (r11v1 double) = (r11v0 double), (r11v6 double) binds: [B:31:0x00ab, B:35:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
                            @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void Fk(final android.view.ViewGroup r19, X.InterfaceC1014340cVE r20) {
                                /*
                                    Method dump skipped, instruction units count: 607
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1006950cJJ.Fk(android.view.ViewGroup, X.0cVE):void");
                            }

                            {
                                Object c098200Yq;
                                super(anoleComponentModel, c1009340cNA19, obj2, context19);
                                try {
                                    C1227904rF c1227904rF = C1227904rF.LIZ;
                                    Map<String, ? extends Object> map3 = anoleComponentModel.data;
                                    c1227904rF.getClass();
                                    c098200Yq = (C1006970cJL) C1227904rF.LIZIZ(C1227904rF.LJI(map3), C1006970cJL.class);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                                    this.LLJLIL = (C1006970cJL) c098200Yq;
                                }
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                    this.LLJLIL = null;
                                }
                            }
                        };
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "interest_feedback_button_group")) {
                        c1014730cVr = new C1006980cJM(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "aiagent_bottom_bar")) {
                        c1014730cVr = new C1021130cgB(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "aiagent_card")) {
                        c1014730cVr = new C1021120cgA(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "title_panel_ai_agent")) {
                        c1014730cVr = new C1005350cGj(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "live_pin_card")) {
                        c1014730cVr = new C1012320cRy(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, "danmaku")) {
                        c1014730cVr = new C1044470dHp(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    } else if (Intrinsics.LJFF(str, C1003000cCw.LLJLLL)) {
                        c1014730cVr = new C1003000cCw(anoleComponentModel, obj2.LIZJ, obj2, obj2.LIZ);
                        obj2 = obj2;
                    }
                } else {
                    C1009340cNA c1009340cNA20 = obj2.LIZJ;
                    Context context20 = obj2.LIZ;
                    C1007900cKq c1007900cKq2 = obj2;
                    c1014730cVr = new C1003080cD4(anoleComponentModel, c1009340cNA20, c1007900cKq2, context20, c1007900cKq2);
                    obj2 = c1007900cKq2;
                }
                arrayList2.add(new Pair(key, c1014730cVr));
            }
            linkedHashMap = new LinkedHashMap(C2097608Jq.LJIILLIIL(arrayList2));
            c1007900cKq = obj2;
        }
        c1007900cKq.LJII = linkedHashMap;
        Collection<InterfaceC1007930cKt> collectionValues = linkedHashMap.values();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (InterfaceC1007930cKt interfaceC1007930cKt : collectionValues) {
            String str2 = interfaceC1007930cKt.Ak().slotID;
            if (linkedHashMap2.get(str2) == null) {
                linkedHashMap2.put(str2, C1697810uHb.LJIILJJIL(interfaceC1007930cKt));
            } else {
                List list = (List) linkedHashMap2.get(str2);
                if (list != null) {
                    list.add(interfaceC1007930cKt);
                }
            }
        }
        c1007900cKq.LJI = linkedHashMap2;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("init success list ");
        sbLIZ2.append(c1007900cKq.LJII.keySet());
        C2188811AlT.LIZIZ(sbLIZ2);
        if (((Boolean) C262600AQw.LIZ.getValue()).booleanValue()) {
            BPEAHandler bPEAHandler = C1008010cL1.LIZ;
            String creativeIdStr = c1007900cKq.LIZJ.LIZLLL.getCreativeIdStr();
            if (creativeIdStr != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it2 = c1007900cKq.LJII.values().iterator();
                while (it2.hasNext()) {
                    JSONArray eventDynamicParamRule = ((InterfaceC1007930cKt) it2.next()).Ak().getEventDynamicParamRule();
                    if (eventDynamicParamRule != null) {
                        arrayList3.add(eventDynamicParamRule);
                        C1008210cLL c1008210cLL = C1023060cjI.LIZJ;
                        c1008210cLL.getClass();
                        try {
                            C1227904rF.LIZ.getClass();
                            Gson gsonLIZLLL = C1227904rF.LIZLLL();
                            ArrayList arrayList4 = new ArrayList();
                            for (int i = 0; i < eventDynamicParamRule.length(); i++) {
                                JSONObject jSONObjectOptJSONObject = eventDynamicParamRule.optJSONObject(i);
                                if (jSONObjectOptJSONObject != null && (dslDynamicParamRule = (DslDynamicParamRule) gsonLIZLLL.LJII(C786410Ut5.J3(jSONObjectOptJSONObject), DslDynamicParamRule.class)) != null) {
                                    arrayList4.add(dslDynamicParamRule);
                                }
                            }
                            C189200o6.m2constructorimpl(arrayList4);
                            obj = arrayList4;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C098200Yq c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                            obj = c098200Yq;
                        }
                        List<DslDynamicParamRule> list2 = (List) (C189200o6.m5exceptionOrNullimpl(obj) != null ? C13BV.INSTANCE : obj);
                        if (list2.isEmpty()) {
                            continue;
                        } else {
                            synchronized (c1008210cLL.LIZ) {
                                try {
                                    Map<String, Map<String, C1023230cjZ>> map3 = c1008210cLL.LIZ;
                                    Map<String, C1023230cjZ> mapSynchronizedMap = map3.get(creativeIdStr);
                                    if (mapSynchronizedMap == null) {
                                        mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
                                        map3.put(creativeIdStr, mapSynchronizedMap);
                                    }
                                    map = mapSynchronizedMap;
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                            for (DslDynamicParamRule dslDynamicParamRule2 : list2) {
                                String str3 = dslDynamicParamRule2.matchRule;
                                if (str3 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{"-"}, 0, 6)) != null && listLJJLIIIJILLIZJL.size() == 3) {
                                    String str4 = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
                                    Locale locale = Locale.ROOT;
                                    String strLIZ = C1022550ciT.LIZ(str4.toLowerCase(locale));
                                    String lowerCase = ((String) ListProtector.get(listLJJLIIIJILLIZJL, 1)).toLowerCase(locale);
                                    String lowerCase2 = ((String) ListProtector.get(listLJJLIIIJILLIZJL, 2)).toLowerCase(locale);
                                    String str5 = dslDynamicParamRule2.matchRule;
                                    Map<String, Object> map4 = dslDynamicParamRule2.addRule;
                                    C1008520cLq c1008520cLq = new C1008520cLq(strLIZ, lowerCase, lowerCase2, str5, map4);
                                    List<DslEventDynamicParamRule> list3 = dslDynamicParamRule2.dynamicParams;
                                    if (list3 != null && !list3.isEmpty()) {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append(creativeIdStr);
                                        sbLIZ3.append('-');
                                        sbLIZ3.append(str5);
                                        sbLIZ3.append('-');
                                        if (map4 != null && !map4.isEmpty()) {
                                            C1227904rF.LIZ.getClass();
                                            json = GsonProtectorUtils.toJson(C1227904rF.LIZLLL(), map4);
                                        } else {
                                            json = "{}";
                                        }
                                        sbLIZ3.append(json);
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                                        synchronized (map) {
                                            try {
                                                C1023230cjZ c1023230cjZ = map.get(strLIZIZ);
                                                if (c1023230cjZ != null) {
                                                    c1023230cjZ.LIZ(list3);
                                                } else {
                                                    C1023230cjZ c1023230cjZ2 = new C1023230cjZ(c1008520cLq);
                                                    c1023230cjZ2.LIZ(list3);
                                                    map.put(strLIZIZ, c1023230cjZ2);
                                                }
                                            } catch (Throwable th3) {
                                                TryCatchGuardChecker.doCheck(th3);
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C1008010cL1.LIZIZ.add(new C1008140cLE(creativeIdStr, c1007900cKq, C1008010cL1.LIZJ));
                }
                BPEAHandler bPEAHandler2 = C1008010cL1.LIZ;
                RunnableC1007920cKs runnableC1007920cKs = C1008010cL1.LIZLLL;
                bPEAHandler2.removeCallbacks(runnableC1007920cKs);
                C786410Ut5.LJLIIL(2000L, bPEAHandler2, runnableC1007920cKs);
            }
        }
    }
}
