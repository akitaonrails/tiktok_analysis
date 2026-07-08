package X;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.protocol.ICreateTabFillScreenAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS75S1000000_25;

/* JADX INFO: renamed from: X.0nWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437860nWK {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0nYI] */
    public static final C1439080nYI LIZ() {
        final Application application = C0CHQ.LIZ;
        return new InterfaceC1630220sWa(application) { // from class: X.0nYI
            public final C01GW LIZ;

            public final Keva LJI() {
                return (Keva) this.LIZ.getValue();
            }

            @Override // X.InterfaceC1630220sWa
            public final long LIZ() {
                return LJI().getLong("time_auto_apply_sticker", 0L);
            }

            @Override // X.InterfaceC1630220sWa
            public final void LIZJ() {
                LJI().storeBoolean("setting_bubble_guide_shown", true);
            }

            @Override // X.InterfaceC1630220sWa
            public final boolean LIZLLL() {
                return LJI().getBoolean("setting_bubble_guide_shown", false);
            }

            @Override // X.InterfaceC1630220sWa
            public final void LJ() {
                LJI().storeBoolean("setting_sticker_first", false);
            }

            @Override // X.InterfaceC1630220sWa
            public final boolean LJFF() {
                return LJI().getBoolean("setting_sticker_first", true);
            }

            {
                this.LIZ = C452501pT.LIZIZ(new AwS566S0100000_22(application, 809));
            }

            @Override // X.InterfaceC1630220sWa
            public final void LIZIZ(long j) {
                LJI().storeLong("time_auto_apply_sticker", j);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C1631210sYB LIZIZ(C1635820sfc c1635820sfc, final InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1625220sOW interfaceC1625220sOW, C1DRG c1drg) {
        CreativeModel creativeModel;
        InterfaceC1636820shE interfaceC1636820shE;
        CreativeInitialModel creativeInitialModel = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        Object[] objArr17 = 0;
        Object[] objArr18 = 0;
        Object[] objArr19 = 0;
        Object[] objArr20 = 0;
        Object[] objArr21 = 0;
        Object[] objArr22 = 0;
        Object[] objArr23 = 0;
        Object[] objArr24 = 0;
        Object[] objArr25 = 0;
        Object[] objArr26 = 0;
        Object[] objArr27 = 0;
        Object[] objArr28 = 0;
        Object[] objArr29 = 0;
        Object[] objArr30 = 0;
        Object[] objArr31 = 0;
        Object[] objArr32 = 0;
        Object[] objArr33 = 0;
        Object[] objArr34 = 0;
        Object[] objArr35 = 0;
        Object[] objArr36 = 0;
        Object[] objArr37 = 0;
        Object[] objArr38 = 0;
        Object[] objArr39 = 0;
        Object[] objArr40 = 0;
        Object[] objArr41 = 0;
        Object[] objArr42 = 0;
        Object[] objArr43 = 0;
        Object[] objArr44 = 0;
        Object[] objArr45 = 0;
        Object[] objArr46 = 0;
        Object[] objArr47 = 0;
        Object[] objArr48 = 0;
        Object[] objArr49 = 0;
        Object[] objArr50 = 0;
        Object[] objArr51 = 0;
        Object[] objArr52 = 0;
        Object[] objArr53 = 0;
        Object[] objArr54 = 0;
        Object[] objArr55 = 0;
        Object[] objArr56 = 0;
        Object[] objArr57 = 0;
        Object[] objArr58 = 0;
        Object[] objArr59 = 0;
        Object[] objArr60 = 0;
        Object[] objArr61 = 0;
        Object[] objArr62 = 0;
        Object[] objArr63 = 0;
        Object[] objArr64 = 0;
        Object[] objArr65 = 0;
        Object[] objArr66 = 0;
        Object[] objArr67 = 0;
        Object[] objArr68 = 0;
        Object[] objArr69 = 0;
        Object[] objArr70 = 0;
        Object[] objArr71 = 0;
        Object[] objArr72 = 0;
        Object[] objArr73 = 0;
        Object[] objArr74 = 0;
        Object[] objArr75 = 0;
        Object[] objArr76 = 0;
        Object[] objArr77 = 0;
        Object[] objArr78 = 0;
        Object[] objArr79 = 0;
        Object[] objArr80 = 0;
        Object[] objArr81 = 0;
        Object[] objArr82 = 0;
        Object[] objArr83 = 0;
        Object[] objArr84 = 0;
        Object[] objArr85 = 0;
        Object[] objArr86 = 0;
        Object[] objArr87 = 0;
        Object[] objArr88 = 0;
        Object[] objArr89 = 0;
        Object[] objArr90 = 0;
        Object[] objArr91 = 0;
        Object[] objArr92 = 0;
        Object[] objArr93 = 0;
        Object[] objArr94 = 0;
        Object[] objArr95 = 0;
        Object[] objArr96 = 0;
        Object[] objArr97 = 0;
        Object[] objArr98 = 0;
        Object[] objArr99 = 0;
        Object[] objArr100 = 0;
        Object[] objArr101 = 0;
        Object[] objArr102 = 0;
        Object[] objArr103 = 0;
        Object[] objArr104 = 0;
        Object[] objArr105 = 0;
        Object[] objArr106 = 0;
        Object[] objArr107 = 0;
        Object[] objArr108 = 0;
        Object[] objArr109 = 0;
        Object[] objArr110 = 0;
        Object[] objArr111 = 0;
        Object[] objArr112 = 0;
        Object[] objArr113 = 0;
        Object[] objArr114 = 0;
        Object[] objArr115 = 0;
        Object[] objArr116 = 0;
        Object[] objArr117 = 0;
        Object[] objArr118 = 0;
        Object[] objArr119 = 0;
        Object[] objArr120 = 0;
        Object[] objArr121 = 0;
        Object[] objArr122 = 0;
        Object[] objArr123 = 0;
        Object[] objArr124 = 0;
        Object[] objArr125 = 0;
        Object[] objArr126 = 0;
        Object[] objArr127 = 0;
        Object[] objArr128 = 0;
        Object[] objArr129 = 0;
        Object[] objArr130 = 0;
        Object[] objArr131 = 0;
        Object[] objArr132 = 0;
        Object[] objArr133 = 0;
        Object[] objArr134 = 0;
        Object[] objArr135 = 0;
        Object[] objArr136 = 0;
        Object[] objArr137 = 0;
        Object[] objArr138 = 0;
        Object[] objArr139 = 0;
        Object[] objArr140 = 0;
        Object[] objArr141 = 0;
        Object[] objArr142 = 0;
        Object[] objArr143 = 0;
        Object[] objArr144 = 0;
        Object[] objArr145 = 0;
        Object[] objArr146 = 0;
        Object[] objArr147 = 0;
        Object[] objArr148 = 0;
        Object[] objArr149 = 0;
        Object[] objArr150 = 0;
        Object[] objArr151 = 0;
        Object[] objArr152 = 0;
        Object[] objArr153 = 0;
        Object[] objArr154 = 0;
        Object[] objArr155 = 0;
        Object[] objArr156 = 0;
        Object[] objArr157 = 0;
        Object[] objArr158 = 0;
        Object[] objArr159 = 0;
        Object[] objArr160 = 0;
        Object[] objArr161 = 0;
        Object[] objArr162 = 0;
        Object[] objArr163 = 0;
        Object[] objArr164 = 0;
        Object[] objArr165 = 0;
        Object[] objArr166 = 0;
        Object[] objArr167 = 0;
        Object[] objArr168 = 0;
        Object[] objArr169 = 0;
        Object[] objArr170 = 0;
        Object[] objArr171 = 0;
        Object[] objArr172 = 0;
        Object[] objArr173 = 0;
        Object[] objArr174 = 0;
        Object[] objArr175 = 0;
        Object[] objArr176 = 0;
        Object[] objArr177 = 0;
        Object[] objArr178 = 0;
        Object[] objArr179 = 0;
        Object[] objArr180 = 0;
        Object[] objArr181 = 0;
        Object[] objArr182 = 0;
        Object[] objArr183 = 0;
        Object[] objArr184 = 0;
        Object[] objArr185 = 0;
        Object[] objArr186 = 0;
        Object[] objArr187 = 0;
        Object[] objArr188 = 0;
        Object[] objArr189 = 0;
        Object[] objArr190 = 0;
        Object[] objArr191 = 0;
        Object[] objArr192 = 0;
        Object[] objArr193 = 0;
        Object[] objArr194 = 0;
        Object[] objArr195 = 0;
        Object[] objArr196 = 0;
        Object[] objArr197 = 0;
        Object[] objArr198 = 0;
        Object[] objArr199 = 0;
        Object[] objArr200 = 0;
        Object[] objArr201 = 0;
        Object[] objArr202 = 0;
        Object[] objArr203 = 0;
        Object[] objArr204 = 0;
        Object[] objArr205 = 0;
        Object[] objArr206 = 0;
        Object[] objArr207 = 0;
        final InterfaceC1630220sWa interfaceC1630220sWaLIZ = (InterfaceC1630220sWa) c1drg.LJIIL(null, InterfaceC1630220sWa.class);
        if (interfaceC1630220sWaLIZ == null) {
            interfaceC1630220sWaLIZ = LIZ();
        }
        final ShortVideoContext shortVideoContext = (ShortVideoContext) c1drg.LJIIL(null, ShortVideoContext.class);
        if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null) {
            int i = -1;
            creativeModel = new CreativeModel(creativeInitialModel, objArr207 == true ? 1 : 0, objArr206 == true ? 1 : 0, objArr205 == true ? 1 : 0, objArr204 == true ? 1 : 0, objArr203 == true ? 1 : 0, objArr202 == true ? 1 : 0, objArr201 == true ? 1 : 0, objArr200 == true ? 1 : 0, objArr199 == true ? 1 : 0, objArr198 == true ? 1 : 0, objArr197 == true ? 1 : 0, objArr196 == true ? 1 : 0, objArr195 == true ? 1 : 0, objArr194 == true ? 1 : 0, objArr193 == true ? 1 : 0, objArr192 == true ? 1 : 0, objArr191 == true ? 1 : 0, objArr190 == true ? 1 : 0, objArr189 == true ? 1 : 0, objArr188 == true ? 1 : 0, objArr187 == true ? 1 : 0, objArr186 == true ? 1 : 0, objArr185 == true ? 1 : 0, objArr184 == true ? 1 : 0, objArr183 == true ? 1 : 0, objArr182 == true ? 1 : 0, objArr181 == true ? 1 : 0, objArr180 == true ? 1 : 0, objArr179 == true ? 1 : 0, objArr178 == true ? 1 : 0, objArr177 == true ? 1 : 0, objArr176 == true ? 1 : 0, objArr175 == true ? 1 : 0, objArr174 == true ? 1 : 0, objArr173 == true ? 1 : 0, objArr172 == true ? 1 : 0, objArr171 == true ? 1 : 0, objArr170 == true ? 1 : 0, objArr169 == true ? 1 : 0, 0, objArr168 == true ? 1 : 0, objArr167 == true ? 1 : 0, objArr166 == true ? 1 : 0, objArr165 == true ? 1 : 0, objArr164 == true ? 1 : 0, objArr163 == true ? 1 : 0, objArr162 == true ? 1 : 0, objArr161 == true ? 1 : 0, objArr160 == true ? 1 : 0, objArr159 == true ? 1 : 0, objArr158 == true ? 1 : 0, objArr157 == true ? 1 : 0, objArr156 == true ? 1 : 0, objArr155 == true ? 1 : 0, 0 == true ? 1 : 0, objArr154 == true ? 1 : 0, objArr153 == true ? 1 : 0, objArr152 == true ? 1 : 0, objArr151 == true ? 1 : 0, objArr150 == true ? 1 : 0, objArr149 == true ? 1 : 0, objArr148 == true ? 1 : 0, objArr147 == true ? 1 : 0, objArr146 == true ? 1 : 0, objArr145 == true ? 1 : 0, objArr144 == true ? 1 : 0, objArr143 == true ? 1 : 0, objArr142 == true ? 1 : 0, objArr141 == true ? 1 : 0, objArr140 == true ? 1 : 0, objArr139 == true ? 1 : 0, objArr138 == true ? 1 : 0, objArr137 == true ? 1 : 0, objArr136 == true ? 1 : 0, objArr135 == true ? 1 : 0, objArr134 == true ? 1 : 0, objArr133 == true ? 1 : 0, objArr132 == true ? 1 : 0, objArr131 == true ? 1 : 0, objArr130 == true ? 1 : 0, objArr129 == true ? 1 : 0, objArr128 == true ? 1 : 0, objArr127 == true ? 1 : 0, objArr126 == true ? 1 : 0, objArr125 == true ? 1 : 0, objArr124 == true ? 1 : 0, objArr123 == true ? 1 : 0, objArr122 == true ? 1 : 0, objArr121 == true ? 1 : 0, objArr120 == true ? 1 : 0, objArr119 == true ? 1 : 0, 0 == true ? 1 : 0, objArr118 == true ? 1 : 0, objArr117 == true ? 1 : 0, objArr116 == true ? 1 : 0, objArr115 == true ? 1 : 0, objArr114 == true ? 1 : 0, objArr113 == true ? 1 : 0, objArr112 == true ? 1 : 0, objArr111 == true ? 1 : 0, objArr110 == true ? 1 : 0, objArr109 == true ? 1 : 0, objArr108 == true ? 1 : 0, objArr107 == true ? 1 : 0, objArr106 == true ? 1 : 0, objArr105 == true ? 1 : 0, objArr104 == true ? 1 : 0, objArr103 == true ? 1 : 0, objArr102 == true ? 1 : 0, objArr101 == true ? 1 : 0, objArr100 == true ? 1 : 0, objArr99 == true ? 1 : 0, objArr98 == true ? 1 : 0, objArr97 == true ? 1 : 0, objArr96 == true ? 1 : 0, objArr95 == true ? 1 : 0, objArr94 == true ? 1 : 0, objArr93 == true ? 1 : 0, objArr92 == true ? 1 : 0, objArr91 == true ? 1 : 0, objArr90 == true ? 1 : 0, objArr89 == true ? 1 : 0, objArr88 == true ? 1 : 0, objArr87 == true ? 1 : 0, objArr86 == true ? 1 : 0, objArr85 == true ? 1 : 0, objArr84 == true ? 1 : 0, objArr83 == true ? 1 : 0, objArr82 == true ? 1 : 0, objArr81 == true ? 1 : 0, objArr80 == true ? 1 : 0, objArr79 == true ? 1 : 0, objArr78 == true ? 1 : 0, objArr77 == true ? 1 : 0, objArr76 == true ? 1 : 0, objArr75 == true ? 1 : 0, objArr74 == true ? 1 : 0, objArr73 == true ? 1 : 0, objArr72 == true ? 1 : 0, objArr71 == true ? 1 : 0, objArr70 == true ? 1 : 0, objArr69 == true ? 1 : 0, objArr68 == true ? 1 : 0, objArr67 == true ? 1 : 0, objArr66 == true ? 1 : 0, objArr65 == true ? 1 : 0, objArr64 == true ? 1 : 0, objArr63 == true ? 1 : 0, objArr62 == true ? 1 : 0, objArr61 == true ? 1 : 0, objArr60 == true ? 1 : 0, objArr59 == true ? 1 : 0, objArr58 == true ? 1 : 0, objArr57 == true ? 1 : 0, objArr56 == true ? 1 : 0, objArr55 == true ? 1 : 0, objArr54 == true ? 1 : 0, objArr53 == true ? 1 : 0, objArr52 == true ? 1 : 0, objArr51 == true ? 1 : 0, objArr50 == true ? 1 : 0, objArr49 == true ? 1 : 0, objArr48 == true ? 1 : 0, objArr47 == true ? 1 : 0, objArr46 == true ? 1 : 0, objArr45 == true ? 1 : 0, objArr44 == true ? 1 : 0, objArr43 == true ? 1 : 0, objArr42 == true ? 1 : 0, objArr41 == true ? 1 : 0, objArr40 == true ? 1 : 0, objArr39 == true ? 1 : 0, objArr38 == true ? 1 : 0, objArr37 == true ? 1 : 0, objArr36 == true ? 1 : 0, objArr35 == true ? 1 : 0, objArr34 == true ? 1 : 0, objArr33 == true ? 1 : 0, objArr32 == true ? 1 : 0, objArr31 == true ? 1 : 0, objArr30 == true ? 1 : 0, objArr29 == true ? 1 : 0, objArr28 == true ? 1 : 0, objArr27 == true ? 1 : 0, objArr26 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr25 == true ? 1 : 0, 0 == true ? 1 : 0, objArr24 == true ? 1 : 0, objArr23 == true ? 1 : 0, objArr22 == true ? 1 : 0, objArr21 == true ? 1 : 0, objArr20 == true ? 1 : 0, objArr19 == true ? 1 : 0, objArr18 == true ? 1 : 0, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, objArr14 == true ? 1 : 0, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i, i, i, i, i, i, 2097151, objArr == true ? 1 : 0);
        }
        C1631210sYB c1631210sYB = new C1631210sYB(c1635820sfc, interfaceC1624480sNK, interfaceC1625410sOp, c1drg, interfaceC1625220sOW, new C1439020nYC(), new C1635530sf9(interfaceC1635390sev));
        c1631210sYB.LLJ = C0FWM.LIZ;
        final AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(shortVideoContext, 389);
        final int i2 = 4;
        ((ArrayList) c1631210sYB.LLJJ).add(new InterfaceC1625960sPi(interfaceC1624480sNK, interfaceC1630220sWaLIZ, awS566S0100000_22, i2) { // from class: X.0sl9
            public final InterfaceC1624480sNK LL;
            public final InterfaceC1630220sWa LLILLJJLI;
            public final int LLILLL;
            public final Function0<Boolean> LLILZ;
            public final C20066713fN<Boolean> LLILZIL;
            public long LLILZLL;

            public final long LIZ() {
                if (this.LLILZLL == -1) {
                    this.LLILZLL = this.LLILLJJLI.LIZ();
                }
                return this.LLILZLL;
            }

            @Override // X.InterfaceC1625960sPi
            public final boolean LLIIIL(int i3, int i4, Effect effect) {
                boolean zIsToday;
                if (this.LL.LLILIL() != null) {
                    return false;
                }
                Boolean boolLJ = this.LLILZIL.LJ(LIZ());
                if (boolLJ != null) {
                    zIsToday = boolLJ.booleanValue();
                } else {
                    zIsToday = DateUtils.isToday(LIZ());
                    this.LLILZIL.LJIIIZ(LIZ(), Boolean.valueOf(zIsToday));
                }
                if (zIsToday || i3 != this.LLILLL || !this.LLILZ.invoke().booleanValue()) {
                    return false;
                }
                this.LLILZLL = System.currentTimeMillis();
                this.LLILLJJLI.LIZIZ(LIZ());
                return true;
            }

            {
                int iLIZLLL;
                if ((i2 & 4) != 0) {
                    iLIZLLL = C1625940sPg.LIZLLL(interfaceC1624480sNK);
                } else {
                    iLIZLLL = 0;
                }
                Function0<Boolean> function0 = (i2 & 8) != 0 ? AFwS214S0000000_25.get$arr$(578) : awS566S0100000_22;
                this.LL = interfaceC1624480sNK;
                this.LLILLJJLI = interfaceC1630220sWaLIZ;
                this.LLILLL = iLIZLLL;
                this.LLILZ = function0;
                this.LLILZIL = new C20066713fN<>((Object) null);
                this.LLILZLL = -1L;
            }
        });
        final C08D2 c08d2 = C08D2.LIZ;
        c1631210sYB.LLIZ = C1438390nXB.LIZ(new C1632680saY(interfaceC1624480sNK, interfaceC1625220sOW, creativeModel), new InterfaceC1446830nkn(c08d2) { // from class: X.08D0
            public final C08D1 LIZ;
            public final HashMap<String, Boolean> LIZIZ = new HashMap<>();
            public final ArrayList<String> LIZJ = new ArrayList<>();

            @Override // X.InterfaceC1446830nkn
            public final void LIZJ(List<? extends Effect> list, List<String> list2, List<Integer> list3) {
            }

            @Override // X.InterfaceC1446830nkn
            public final void LJ(int i3) {
            }

            {
                this.LIZ = c08d2;
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZ(String str) {
                Iterator<String> it2 = this.LIZIZ.keySet().iterator();
                while (it2.hasNext()) {
                    this.LIZIZ.put(it2.next(), Boolean.FALSE);
                }
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZIZ(int i3, String str, String str2, Bundle bundle, Function1<? super Integer, ? extends Effect> function1) {
                String adRawData;
                Effect effectInvoke = function1.invoke(Integer.valueOf(i3 + 1));
                if (effectInvoke != null && (adRawData = effectInvoke.getAdRawData()) != null && adRawData.length() != 0) {
                    String effectId = effectInvoke.getEffectId();
                    Boolean bool = this.LIZIZ.get(effectId);
                    if (bool == null || !bool.booleanValue()) {
                        this.LIZ.LIZ(effectInvoke);
                    }
                    this.LIZIZ.put(effectId, Boolean.TRUE);
                }
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZLLL(int i3, int i4, String str, String str2, Bundle bundle, AwS391S0200000_25 awS391S0200000_25) {
                String adRawData;
                this.LIZJ.clear();
                int i5 = i4 + 1;
                for (int i6 = i3 + 1; i6 < i5; i6++) {
                    Effect effect = (Effect) awS391S0200000_25.invoke(Integer.valueOf(i6));
                    if (effect != null && (adRawData = effect.getAdRawData()) != null && adRawData.length() != 0) {
                        String effectId = effect.getEffectId();
                        Boolean bool = this.LIZIZ.get(effectId);
                        if (bool == null || !bool.booleanValue()) {
                            this.LIZ.LIZ(effect);
                        }
                        this.LIZIZ.put(effectId, Boolean.TRUE);
                        this.LIZJ.add(effectId);
                    }
                }
                for (String str3 : this.LIZIZ.keySet()) {
                    if (!this.LIZJ.contains(str3)) {
                        this.LIZIZ.put(str3, Boolean.FALSE);
                    }
                }
            }
        }, new InterfaceC1446830nkn(shortVideoContext) { // from class: X.0shY
            public final ShortVideoContext LIZ;
            public final Set<C1637040sha> LIZIZ = new LinkedHashSet();

            @Override // X.InterfaceC1446830nkn
            public final void LIZJ(List<? extends Effect> list, List<String> list2, List<Integer> list3) {
            }

            @Override // X.InterfaceC1446830nkn
            public final void LJ(int i3) {
            }

            {
                this.LIZ = shortVideoContext;
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZ(String str) {
                C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clear(");
                sbLIZ.append(str);
                sbLIZ.append(')');
                C201955140j.LJIILL(c20012313Rx, "CreateTabFillScreenStickerViewMob", C2188811AlT.LIZIZ(sbLIZ));
                if (str != null && str.length() != 0) {
                    final AwS75S1000000_25 awS75S1000000_25 = new AwS75S1000000_25(str, 21);
                    if (Build.VERSION.SDK_INT >= 24) {
                        this.LIZIZ.removeIf(new Predicate() { // from class: X.0shZ
                            @Override // java.util.function.Predicate
                            public final /* synthetic */ boolean test(Object obj) {
                                return ((Boolean) awS75S1000000_25.invoke(obj)).booleanValue();
                            }
                        });
                        return;
                    }
                    Iterator<C1637040sha> it2 = this.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) awS75S1000000_25.invoke(it2.next())).booleanValue()) {
                            it2.remove();
                        }
                    }
                }
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZIZ(int i3, String str, String str2, Bundle bundle, Function1<? super Integer, ? extends Effect> function1) {
                String str3;
                Effect effectInvoke = function1.invoke(Integer.valueOf(i3));
                if (!(effectInvoke instanceof ICreateTabFillScreenAdapter.FakeEffect)) {
                    return;
                }
                for (C1636960shS c1636960shS : ((ICreateTabFillScreenAdapter.FakeEffect) effectInvoke).getShowParamsList()) {
                    C1637040sha c1637040sha = new C1637040sha(str, str2, c1636960shS.LIZIZ);
                    if (this.LIZIZ.contains(c1637040sha)) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mobPositionedShow success, position = ");
                    sbLIZ.append(i3);
                    sbLIZ.append(", ");
                    sbLIZ.append(c1636960shS);
                    C201955140j.LJIILL(C20012313Rx.LIZIZ, "CreateTabFillScreenStickerViewMob", C2188811AlT.LIZIZ(sbLIZ));
                    this.LIZIZ.add(c1637040sha);
                    Map mapLIZ = C318390Cdx.LIZ(this.LIZ, new LinkedHashMap());
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    mapLIZ.put("tab_key", str3);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(c1636960shS.LIZJ);
                    mapLIZ.putAll(linkedHashMap);
                    C1737910vKH.LIZ(c1636960shS.LIZ, mapLIZ);
                }
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZLLL(int i3, int i4, String str, String str2, Bundle bundle, AwS391S0200000_25 awS391S0200000_25) {
                int i5 = i3;
                if (i5 > i4) {
                    return;
                }
                while (true) {
                    LIZIZ(i5, str, str2, bundle, awS391S0200000_25);
                    if (i5 != i4) {
                        i5++;
                    } else {
                        return;
                    }
                }
            }
        }, new InterfaceC1446830nkn(shortVideoContext) { // from class: X.0nki
            public final ShortVideoContext LIZ;
            public final Set<String> LIZIZ = new LinkedHashSet();

            @Override // X.InterfaceC1446830nkn
            public final void LIZJ(List<? extends Effect> list, List<String> list2, List<Integer> list3) {
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZLLL(int i3, int i4, String str, String str2, Bundle bundle, AwS391S0200000_25 awS391S0200000_25) {
            }

            @Override // X.InterfaceC1446830nkn
            public final void LJ(int i3) {
            }

            {
                this.LIZ = shortVideoContext;
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZ(String str) {
                this.LIZIZ.clear();
            }

            @Override // X.InterfaceC1446830nkn
            public final void LIZIZ(int i3, String str, String str2, Bundle bundle, Function1<? super Integer, ? extends Effect> function1) {
                String resourceId;
                String resourceId2;
                String strLJIJJLI;
                String name;
                String resourceId3;
                String effectId;
                CreativeModel creativeModel2;
                C1443680nfi c1443680nfi;
                String str3;
                Effect effectInvoke = function1.invoke(Integer.valueOf(i3));
                if (!C1446840nko.LIZLLL(effectInvoke) && !C1446840nko.LIZJ(effectInvoke)) {
                    return;
                }
                Set<String> set = this.LIZIZ;
                if (effectInvoke != null) {
                    resourceId = effectInvoke.getResourceId();
                } else {
                    resourceId = null;
                }
                if (C13LP.LJJJJ(resourceId, set)) {
                    return;
                }
                Set<String> set2 = this.LIZIZ;
                String str4 = "";
                if (effectInvoke == null || (resourceId2 = effectInvoke.getResourceId()) == null) {
                    resourceId2 = "";
                }
                set2.add(resourceId2);
                Map mapLIZ = C318390Cdx.LIZ(this.LIZ, new LinkedHashMap());
                ShortVideoContext shortVideoContext2 = this.LIZ;
                if (shortVideoContext2 == null) {
                    strLJIJJLI = "";
                } else {
                    strLJIJJLI = shortVideoContext2.LJIJJLI();
                }
                mapLIZ.put("shoot_tab_name", strLJIJJLI);
                mapLIZ.put("is_aigc_template", C1636550sgn.LIZIZ(effectInvoke));
                if (str2 == null) {
                    str2 = "";
                }
                mapLIZ.put("tab_key", str2);
                if (effectInvoke == null || (name = effectInvoke.getName()) == null) {
                    name = "";
                }
                mapLIZ.put("template_name", name);
                if (effectInvoke == null || (resourceId3 = effectInvoke.getResourceId()) == null) {
                    resourceId3 = "";
                }
                mapLIZ.put("resource_id", resourceId3);
                if (effectInvoke == null || (effectId = effectInvoke.getEffectId()) == null) {
                    effectId = "";
                }
                mapLIZ.put("prop_id", effectId);
                ShortVideoContext shortVideoContext3 = this.LIZ;
                if (shortVideoContext3 != null && (creativeModel2 = shortVideoContext3.creativeModel) != null && (c1443680nfi = creativeModel2.mecReportModel) != null && (str3 = c1443680nfi.LIZ) != null) {
                    str4 = str3;
                }
                mapLIZ.put("user_entry_method", str4);
                C1737910vKH.LIZ("mobile_effect_template_show", mapLIZ);
            }
        });
        InterfaceC1636390sgX interfaceC1636390sgX = (InterfaceC1636390sgX) c1drg.LJIIL(null, InterfaceC1636390sgX.class);
        if (interfaceC1636390sgX != null) {
            c1631210sYB.LLIZLLLIL = interfaceC1636390sgX;
        }
        InterfaceC1635660sfM<C1642680sqg, Fragment> interfaceC1635660sfM = (InterfaceC1635660sfM) c1drg.LJIIL(null, InterfaceC1635660sfM.class);
        if (interfaceC1635660sfM != null) {
            c1631210sYB.LLJILJIL = interfaceC1635660sfM;
        }
        if (C1445590nin.LIZ() && (interfaceC1636820shE = (InterfaceC1636820shE) c1drg.LJIIL(null, InterfaceC1636820shE.class)) != null) {
            c1631210sYB.LLJILLL = interfaceC1636820shE;
        }
        c1631210sYB.LLJI = new AwS566S0100000_22(c1drg, 390);
        return c1631210sYB;
    }
}
