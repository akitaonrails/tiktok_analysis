package X;

import Y.ACallableS9S1101000_29;
import Y.AComparatorS24S0000000_5;
import Y.AObjectS247S0100000_29;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import zoo.b;

/* JADX INFO: renamed from: X.122w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196924122w extends AbstractC2255721DQs<C122Q> implements C122Q, InterfaceC1444160ngU, InterfaceC379610EuV {
    public static final C1462400o9u LLZLL = new C1462400o9u();
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC196906122e LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;
    public final Function0<C0FVR> LLIZ;
    public final AnonymousClass1240 LLIZLLLIL;
    public final TTSVoiceModel LLJ;
    public final Function0<Unit> LLJI;
    public final int LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 23));
    public final C385670FAf<Boolean> LLJILJILJ;
    public final LiveEvent<C196925122x> LLJILLL;
    public final LiveEvent<Unit> LLJJ;
    public final LiveEvent<Pair<TextStickerData, Boolean>> LLJJI;
    public final LiveEvent<View.OnClickListener> LLJJIII;
    public final LiveEvent<InfoStickerModel> LLJJIJI;
    public final C560530Lyd<Boolean> LLJJIJIIJIL;
    public final LiveEvent<InterfaceC196915122n> LLJJIJIL;
    public final LiveEvent<InterfaceC196929123b> LLJJJ;
    public InterfaceC196929123b LLJJJIL;
    public AnonymousClass1243 LLJJJJ;
    public final LiveEvent<Function2<C196925122x, C196925122x, Unit>> LLJJJJJIL;
    public final LiveEvent<InterfaceC196910122i> LLJJJJLIIL;
    public final LiveEvent<Function1<C196925122x, Unit>> LLJJL;
    public final LiveEvent<Function1<C196925122x, Unit>> LLJJLIIIJLLLLLLLZ;
    public final LiveEvent<InterfaceC196928123a> LLJL;
    public final LiveEvent<Unit> LLJLIL;
    public final LiveEvent<Pair<Integer, Integer>> LLJLILLLLZIIL;
    public final LiveEvent<C196925122x> LLJLL;
    public final LiveEvent<Pair<C196925122x, Integer>> LLJLLIL;
    public final LiveEvent<C196925122x> LLJLLL;
    public final LiveEvent<Unit> LLJZ;
    public final LiveEvent<Unit> LLJZIJLIL;
    public final LiveEvent<Boolean> LLL;
    public final LiveEvent<Unit> LLLF;
    public final LiveEvent<Boolean> LLLFF;
    public final LiveEvent<C196925122x> LLLFFI;
    public final LiveEvent<C196925122x> LLLFZ;
    public final LiveEvent<Unit> LLLI;
    public final LiveEvent<TextStickerData> LLLII;
    public final LiveEvent<String> LLLIIII;
    public final LiveEvent<Boolean> LLLIIIIL;
    public final LiveEvent<Boolean> LLLIIIL;
    public final LiveEvent<Pair<TextStickerData, String>> LLLIIL;
    public final LiveEvent<TextStickerData> LLLIILIL;
    public final LiveEvent<Boolean> LLLIL;
    public final LiveEvent<Boolean> LLLILZ;
    public final LiveEvent<TextWatcher> LLLILZJ;
    public final LiveEvent<List<TextStickerTextWrap>> LLLILZLLLI;
    public final LiveEvent<C196925122x> LLLIZZ;
    public final LiveEvent<Integer> LLLJ;
    public final LiveEvent<Unit> LLLJIL;
    public final LiveEvent<Unit> LLLJL;
    public final C560530Lyd<C196925122x> LLLL;
    public final LiveEvent<C196925122x> LLLLII;
    public final LiveEvent<Unit> LLLLIIIILLL;
    public final LiveEvent<Unit> LLLLIIL;
    public final LiveEvent<Unit> LLLLIILL;
    public final LiveEvent<Unit> LLLLIILLL;
    public final LiveEvent<Integer> LLLLIL;
    public final LiveEvent<Integer> LLLLILI;
    public final LiveEvent<Integer> LLLLJ;
    public final LiveEvent<Pair<String, Integer>> LLLLJI;
    public final LiveEvent<Boolean> LLLLL;
    public final LiveEvent<TextStickerData> LLLLLIL;
    public final LiveEvent<String> LLLLLILLIL;
    public final C560530Lyd<Unit> LLLLLJIL;
    public final LiveEvent<Unit> LLLLLJLJLL;
    public boolean LLLLLL;
    public boolean LLLLLLIL;
    public boolean LLLLLLJ;
    public boolean LLLLLLL;
    public final MutableLiveData<TextStickerData> LLLLLLLLL;
    public final MutableLiveData<Pair<String, String>> LLLLLLLLLL;
    public InterfaceC196933123f LLLLLLLZIL;
    public boolean LLLLLLZ;
    public TextStickerData LLLLLLZZ;
    public MutableLiveData<Boolean> LLLLLZ;
    public boolean LLLLLZIL;
    public final C01GW LLLLLZL;
    public final List<TextStickerData> LLLLZ;
    public final List<C196925122x> LLLLZI;
    public final List<C196925122x> LLLLZIL;
    public boolean LLLLZLL;
    public boolean LLLLZLLIL;
    public boolean LLLLZLLLI;
    public final C560530Lyd<Boolean> LLLZ;
    public final C560530Lyd<Unit> LLLZI;
    public C560530Lyd<Unit> LLLZIIL;
    public boolean LLLZIL;
    public Pair<Integer, Integer> LLLZL;
    public final C01GW LLLZLL;
    public final C01GW LLLZLZ;
    public final C560530Lyd<Unit> LLLZZ;
    public final C560530Lyd<Pair<Boolean, Boolean>> LLLZZIL;
    public final C560530Lyd<Boolean> LLZ;
    public final C560530Lyd<Unit> LLZIL;
    public final h0<Boolean> LLZILL;
    public final h0<C196925122x> LLZL;
    public TextWatcher LLZLI;

    @Override // X.C122Q
    public InterfaceC1444160ngU LJJIFFI() {
        return this;
    }

    public C122Q Z1() {
        return this;
    }

    private final void B3() {
        InterfaceC196929123b interfaceC196929123b = this.LLJJJIL;
        if (interfaceC196929123b != null) {
            interfaceC196929123b.LJ();
        }
    }

    private final boolean T2() {
        return this.LLLLZ.isEmpty();
    }

    private final C19659311vr i3() {
        return (C19659311vr) this.LLJILJIL.getValue();
    }

    private final C123D o2() {
        return (C123D) this.LLLZLZ.getValue();
    }

    private final C123J w2() {
        return (C123J) this.LLLZLL.getValue();
    }

    private final List<C196925122x> z4() {
        return C13LP.LJLLLL(new Comparator() { // from class: X.123L
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C196925122x) obj).LLJLL - ((C196925122x) obj2).LLJLL;
            }
        }, this.LLLLZIL);
    }

    @Override // X.C122Q
    public void DU0() {
        AnonymousClass1243 anonymousClass1243 = this.LLJJJJ;
        if (anonymousClass1243 != null) {
            anonymousClass1243.LIZIZ();
        }
    }

    @Override // X.C122Q
    public int Ir0() {
        List<C196925122x> list = this.LLLLZIL;
        ArrayList arrayList = new ArrayList();
        for (C196925122x c196925122x : list) {
            if (C0FVW.LIZIZ(c196925122x)) {
                arrayList.add(c196925122x);
            }
        }
        return arrayList.size();
    }

    @Override // X.C122Q
    public boolean LLLLZLLIL() {
        Boolean value;
        MutableLiveData<Boolean> mutableLiveData = this.LLLLLZ;
        if (mutableLiveData == null || (value = mutableLiveData.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.C122Q
    public void Mj0() {
        StringBuilder sb = new StringBuilder("EditTextStickerComponent -> addAllCaptionView -> _captionDataList.size = ");
        List<TextStickerData> list = this.LLLLZ;
        ArrayList arrayList = new ArrayList();
        for (TextStickerData textStickerData : list) {
            if (!textStickerData.getAddToLayout()) {
                arrayList.add(textStickerData);
            }
        }
        sb.append(arrayList.size());
        C201955140j.LIZ(sb.toString());
        this.LLLLZI.clear();
        List<TextStickerData> list2 = this.LLLLZ;
        ArrayList arrayList2 = new ArrayList();
        for (TextStickerData textStickerData2 : list2) {
            if (!textStickerData2.getAddToLayout()) {
                arrayList2.add(textStickerData2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            bP((TextStickerData) it2.next());
        }
    }

    @Override // X.C122Q
    public C196925122x Mw0() {
        C196925122x next;
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LLJILJIL) {
                break;
            }
        }
        return next;
    }

    @Override // X.C122Q
    public void NZ() {
        AnonymousClass1243 anonymousClass1243 = this.LLJJJJ;
        if (anonymousClass1243 != null) {
            anonymousClass1243.LIZ();
        }
    }

    @Override // X.C122Q
    public Iterator<C196925122x> OV1() {
        return this.LLLLZIL.listIterator();
    }

    @Override // X.C122Q
    public void R02() {
        this.LLLLZIL.clear();
    }

    @Override // X.C122Q
    public int T10() {
        if (this.LLLLZIL.isEmpty()) {
            return 0;
        }
        int size = this.LLLLZIL.size();
        int size2 = 0;
        for (int i = 0; i < size; i++) {
            for (TextStickerTextWrap textStickerTextWrap : ((C196925122x) ListProtector.get(this.LLLLZIL, i)).getTextWrapList()) {
                if (textStickerTextWrap != null) {
                    size2 += textStickerTextWrap.safeStrPair().second.size();
                }
            }
        }
        return size2;
    }

    @Override // X.C122Q
    public LiveData<Pair<Float, Boolean>> WZ() {
        return (LiveData) this.LLLLLZL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C122Q
    public ArrayList<TextStickerData> Yn2() {
        ArrayList<TextStickerData> arrayList = new ArrayList<>();
        List<C196925122x> listHt = ht();
        ArrayList arrayList2 = new ArrayList();
        for (C196925122x c196925122x : listHt) {
            if (C0FVW.LIZ(c196925122x)) {
                arrayList2.add(c196925122x);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C196925122x) it2.next()).LJIIJ());
        }
        List<TextStickerData> listPs2 = ps2();
        ArrayList arrayList3 = new ArrayList();
        for (TextStickerData textStickerData : listPs2) {
            if (true ^ textStickerData.getAddToLayout()) {
                arrayList3.add(textStickerData);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList.add(it3.next());
        }
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS24S0000000_5(1));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // X.C122Q
    public C196925122x Zn0() {
        if (this.LLLLZIL.isEmpty()) {
            return null;
        }
        return (C196925122x) ListProtector.get(this.LLLLZIL, 0);
    }

    @Override // X.C122Q
    public void Zs1() {
        this.LLLLZ.clear();
    }

    @Override // X.C122Q
    public boolean ab1() {
        return this.LLLLZIL.isEmpty();
    }

    @Override // X.C122Q
    public void ag2() {
        this.LLLLZIL.clear();
        B3();
    }

    @Override // X.C122Q
    public boolean c0() {
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            C196925122x next = it2.next();
            TextStickerData data = next.getData();
            if (data != null && data.getHasReadTextAudio()) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public String getTextContent() {
        StringBuilder sb = new StringBuilder();
        int size = ht().size();
        for (int i = 0; i < size; i++) {
            ((C196925122x) ListProtector.get(ht(), i)).LJIIJ();
            TextStickerData data = ((C196925122x) ListProtector.get(ht(), i)).getData();
            if (data != null) {
                sb.append(C123P.LJIIIIZZ(data.getTextWrapList()));
            }
            if (i != ht().size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    @Override // X.C122Q
    public void hide() {
        C19A3 c19a3 = this.LLILLJJLI;
        if (c19a3 != null && c19a3.isAdded(i3())) {
            c19a3.hide(i3());
        }
    }

    @Override // X.C122Q
    public List<TextStickerData> on() {
        ArrayList arrayList = new ArrayList();
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJIIJ());
        }
        Iterator<C196925122x> it3 = this.LLLLZI.iterator();
        while (it3.hasNext()) {
            TextStickerData data = it3.next().getData();
            if (data != null) {
                arrayList.add(data);
            }
        }
        return arrayList;
    }

    @Override // X.C122Q
    public void show() {
        C19A3 c19a3 = this.LLILLJJLI;
        if (c19a3 == null) {
            return;
        }
        if (!c19a3.isAdded(i3())) {
            c19a3.add(this.LLILLL, i3(), "EditTextStickerScene");
        }
        c19a3.show(i3());
    }

    @Override // X.C122Q
    public void Fo() {
        ((C560530Lyd) AC1()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public boolean LJJJLZIJ() {
        ((C560530Lyd) ou2()).LJIIIZ(Unit.LIZ);
        boolean z = false;
        for (C196925122x c196925122x : this.LLLLZIL) {
            C123K c123k = c196925122x.LLILZ;
            boolean z2 = c196925122x.LLJJIJIIJIL.LJIIIIZZ;
            c123k.LJI = z2;
            if (z2) {
                c196925122x.setShowHelpBox(false);
                z = true;
            }
        }
        return z;
    }

    @Override // X.C122Q
    public boolean LJLL() {
        return (ab1() && T2()) ? false : true;
    }

    @Override // X.C122Q
    public Point LLFZ() {
        C124T c124t = i3().LLJJIJIIJIL;
        if (c124t == null) {
            c124t = null;
        }
        return c124t.getEditInputScreenCenterPoint();
    }

    @Override // X.C122Q
    public void LLJJIJIL() {
        ((C560530Lyd) Aa()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public void LLLLJ() {
        ((C560530Lyd) nx0()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public List<C196925122x> LLLLLLZZ() {
        return ht();
    }

    @Override // X.C122Q
    public void T1() {
        ((C560530Lyd) aX0()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public void U4() {
        ((C560530Lyd) Vo()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public void Wf() {
        ((C560530Lyd) gb1()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public void Yr() {
        ((C560530Lyd) N62()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public void bf() {
        ((C560530Lyd) yP2()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public void d3() {
        ((C560530Lyd) QA2()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public void i() {
        ((C560530Lyd) JO0()).LJIIJ(Unit.LIZ);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLLLLJIL.LIZ(this, new AObjectS247S0100000_29(this, 29));
    }

    @Override // X.C122Q
    public void t01() {
        ((C560530Lyd) wy0()).LJIIJ(Unit.LIZ);
    }

    @Override // X.C122Q
    public LiveEvent<Unit> AC1() {
        return this.LLLLIIIILLL;
    }

    @Override // X.C122Q
    public C560530Lyd<Boolean> AZ() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> Aa() {
        return this.LLLJIL;
    }

    @Override // X.C122Q
    public InterfaceC196933123f Aa0() {
        return this.LLLLLLLZIL;
    }

    @Override // X.C122Q
    public LiveEvent<TextWatcher> Br1() {
        return this.LLLILZJ;
    }

    @Override // X.C122Q
    public LiveData<Pair<String, String>> Bz() {
        return this.LLLLLLLLLL;
    }

    @Override // X.C122Q
    public LiveData<TextStickerData> D9() {
        return this.LLLLLLLLL;
    }

    @Override // X.C122Q
    public LiveEvent<C196925122x> DT() {
        return this.LLJILLL;
    }

    @Override // X.C122Q
    public C385670FAf<C196925122x> Dj0() {
        return this.LLZL;
    }

    @Override // X.C122Q
    public LiveEvent<TextStickerData> Dp1() {
        return this.LLLII;
    }

    @Override // X.C122Q
    public LiveEvent<Boolean> Dz2() {
        return this.LLLIIIL;
    }

    @Override // X.C122Q
    public LiveEvent<C196925122x> Es1() {
        return this.LLJLLL;
    }

    public final boolean G2() {
        return this.LLLZIL;
    }

    @Override // X.C122Q
    public LiveEvent<Function1<C196925122x, Unit>> GV1() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.C122Q
    public boolean Gb() {
        return this.LLLLLZIL;
    }

    @Override // X.C122Q
    public LiveEvent<InterfaceC196910122i> Gh2() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C122Q
    public C560530Lyd<Unit> H1() {
        return this.LLLZZ;
    }

    public final C560530Lyd<Unit> H2() {
        return this.LLLZI;
    }

    @Override // X.C122Q
    public LiveEvent<InterfaceC196928123a> Hf1() {
        return this.LLJL;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> JO0() {
        return this.LLJZ;
    }

    @Override // X.C122Q
    public LiveEvent<String> Li0() {
        return this.LLLIIII;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> N62() {
        return this.LLLLIILLL;
    }

    @Override // X.C122Q
    public LiveEvent<Boolean> N80() {
        return this.LLLLL;
    }

    @Override // X.C122Q
    public TextStickerData Nw2() {
        return this.LLLLLLZZ;
    }

    @Override // X.C122Q
    public LiveEvent<View.OnClickListener> Ob0() {
        return this.LLJJIII;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> QA2() {
        return this.LLLF;
    }

    @Override // X.C122Q
    public LiveEvent<Integer> Tv0() {
        return this.LLLLIL;
    }

    @Override // X.C122Q
    public LiveEvent<Boolean> Uf2() {
        return this.LLL;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> Vo() {
        return this.LLLJL;
    }

    public final boolean W2() {
        return this.LLLLZLL;
    }

    @Override // X.C122Q
    public LiveEvent<TextStickerData> W41() {
        return this.LLLIILIL;
    }

    @Override // X.C122Q
    public LiveEvent<InterfaceC196915122n> X40() {
        return this.LLJJIJIL;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> XG0() {
        return this.LLLLLJLJLL;
    }

    @Override // X.C122Q
    public LiveEvent<Boolean> XI() {
        return this.LLLILZ;
    }

    @Override // X.C122Q
    public TextWatcher XI1() {
        return this.LLZLI;
    }

    @Override // X.C122Q
    public LiveEvent<C196925122x> Xs0() {
        return this.LLLFZ;
    }

    @Override // X.C122Q
    public LiveEvent<InfoStickerModel> ZV0() {
        return this.LLJJIJI;
    }

    @Override // X.C122Q
    public LiveEvent<Boolean> Zp2() {
        return this.LLLIL;
    }

    @Override // X.C122Q
    public LiveEvent<InterfaceC196929123b> Zy2() {
        return this.LLJJJ;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> aX0() {
        return this.LLJLIL;
    }

    @Override // X.C122Q
    public LiveEvent<Integer> aY0() {
        return this.LLLLILI;
    }

    @Override // X.C122Q
    public boolean b8() {
        return this.LLLLLLJ;
    }

    @Override // X.C122Q
    public C560530Lyd<Boolean> c2() {
        return this.LLZ;
    }

    public final boolean c3() {
        return this.LLLLZLLLI;
    }

    @Override // X.C122Q
    public LiveEvent<Integer> c6() {
        return this.LLLJ;
    }

    @Override // X.C122Q
    public boolean fl2() {
        return this.LLLLLLIL;
    }

    @Override // X.C122Q
    public LiveEvent<Integer> ft1() {
        return this.LLLLJ;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> gb1() {
        return this.LLLLIILL;
    }

    @Override // X.C122Q
    public LiveEvent<C196925122x> gc1() {
        return this.LLJLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C122Q
    public boolean ha2() {
        return this.LLLLLL;
    }

    @Override // X.C122Q
    public LiveEvent<Pair<TextStickerData, Boolean>> hq2() {
        return this.LLJJI;
    }

    @Override // X.C122Q
    public List<C196925122x> ht() {
        return this.LLLLZIL;
    }

    @Override // X.C122Q
    public LiveEvent<Pair<C196925122x, Integer>> i92() {
        return this.LLJLLIL;
    }

    @Override // X.C122Q
    public LiveEvent<Function2<C196925122x, C196925122x, Unit>> iy2() {
        return this.LLJJJJJIL;
    }

    @Override // X.C122Q
    public C560530Lyd<Unit> kP2() {
        return this.LLLZIIL;
    }

    @Override // X.C122Q
    public LiveEvent<Boolean> lm2() {
        return this.LLLFF;
    }

    @Override // X.C122Q
    public LiveEvent<Pair<TextStickerData, String>> m41() {
        return this.LLLIIL;
    }

    @Override // X.C122Q
    public C385670FAf<Boolean> mo() {
        return this.LLZILL;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> nx0() {
        return this.LLJZIJLIL;
    }

    @Override // X.C122Q
    public C560530Lyd<Boolean> o00() {
        return this.LLLZ;
    }

    @Override // X.C122Q
    public LiveEvent<C196925122x> o61() {
        return this.LLLFFI;
    }

    @Override // X.C122Q
    public List<C196925122x> ol1() {
        return this.LLLLZIL;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> ou2() {
        return this.LLJJ;
    }

    @Override // X.C122Q
    public LiveEvent<List<TextStickerTextWrap>> pA() {
        return this.LLLILZLLLI;
    }

    @Override // X.C122Q
    public LiveEvent<Function1<C196925122x, Unit>> pM1() {
        return this.LLJJL;
    }

    @Override // X.C122Q
    public List<TextStickerData> ps2() {
        return this.LLLLZ;
    }

    @Override // X.C122Q
    public C560530Lyd<Unit> qz1() {
        return this.LLZIL;
    }

    @Override // X.C122Q
    public LiveEvent<Pair<Integer, Integer>> rW1() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.C122Q
    public C385670FAf<Boolean> rb() {
        return this.LLJILJILJ;
    }

    @Override // X.C122Q
    public LiveEvent<C196925122x> sC0() {
        return this.LLLLII;
    }

    @Override // X.C122Q
    public C560530Lyd<Pair<Boolean, Boolean>> u2() {
        return this.LLLZZIL;
    }

    @Override // X.C122Q
    public LiveEvent<TextStickerData> vC2() {
        return this.LLLLLIL;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> wy0() {
        return this.LLLI;
    }

    @Override // X.C122Q
    public LiveEvent<Pair<String, Integer>> xL() {
        return this.LLLLJI;
    }

    @Override // X.C122Q
    public LiveEvent<String> yE2() {
        return this.LLLLLILLIL;
    }

    @Override // X.C122Q
    public LiveEvent<Unit> yP2() {
        return this.LLLLIIL;
    }

    @Override // X.C122Q
    public boolean ym1() {
        return this.LLLLLLL;
    }

    @Override // X.C122Q
    public LiveEvent<C196925122x> yx() {
        return this.LLLIZZ;
    }

    @Override // X.C122Q
    public LiveEvent<Boolean> ze0() {
        return this.LLLIIIIL;
    }

    private final void E3(C196925122x c196925122x) {
        InterfaceC196929123b interfaceC196929123b = this.LLJJJIL;
        if (interfaceC196929123b != null) {
            interfaceC196929123b.LIZJ(c196925122x);
        }
    }

    private final void F4(C196925122x c196925122x) {
        List<C196925122x> list = this.LLLLZIL;
        ArrayList<C196925122x> arrayList = new ArrayList();
        for (C196925122x c196925122x2 : list) {
            C196925122x c196925122x3 = c196925122x2;
            if (C0FVW.LIZ(c196925122x3) && !Intrinsics.LJFF(c196925122x3, c196925122x)) {
                arrayList.add(c196925122x2);
            }
        }
        for (C196925122x c196925122x4 : arrayList) {
            c196925122x4.setCenterX(c196925122x.getCenterX());
            c196925122x4.setCenterY(c196925122x.getCenterY());
            C123K c123k = c196925122x4.LLILZ;
            C123K c123k2 = c196925122x.LLILZ;
            c123k.LIZ = c123k2.LIZ;
            c123k.LIZIZ = c123k2.LIZIZ;
            c123k.LIZJ = c123k2.LIZJ;
        }
        for (TextStickerData textStickerData : this.LLLLZ) {
            textStickerData.setX(c196925122x.getCenterX());
            textStickerData.setY(c196925122x.getCenterY());
            textStickerData.setScale(c196925122x.LLILZ.LIZ);
            textStickerData.setRotation(c196925122x.LLILZ.LIZIZ);
            PointF pointF = c196925122x.LLILZ.LIZJ;
            textStickerData.setEditCenterPoint(new Point((int) pointF.x, (int) pointF.y));
        }
        o00().LJIIJ(Boolean.FALSE);
        AnonymousClass1243 anonymousClass1243 = this.LLJJJJ;
        if (anonymousClass1243 != null) {
            anonymousClass1243.LIZJ();
        }
    }

    private final void H3(C196925122x c196925122x) {
        InterfaceC196929123b interfaceC196929123b = this.LLJJJIL;
        if (interfaceC196929123b != null) {
            interfaceC196929123b.LIZIZ(c196925122x);
        }
    }

    private final void o4(boolean z) {
        C201955140j.LIZ("EditStickerScene -> set enableEditTextSticker");
        this.LLLLZLLIL = z;
        List<C196925122x> list = this.LLLLZIL;
        ArrayList<C196925122x> arrayList = new ArrayList();
        for (C196925122x c196925122x : list) {
            if (C0FVW.LIZIZ(c196925122x)) {
                arrayList.add(c196925122x);
            }
        }
        for (C196925122x c196925122x2 : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditStickerScene -> is Text Sticker, setEnableEdit = ");
            sbLIZ.append(this.LLLLZLLIL);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            c196925122x2.setEnableEdit(this.LLLLZLLIL);
        }
    }

    private final void q3(C196925122x c196925122x) {
        InterfaceC196929123b interfaceC196929123b = this.LLJJJIL;
        if (interfaceC196929123b != null) {
            interfaceC196929123b.LIZ(c196925122x);
        }
    }

    private final void v3(C196925122x c196925122x) {
        InterfaceC196929123b interfaceC196929123b = this.LLJJJIL;
        if (interfaceC196929123b != null) {
            interfaceC196929123b.LIZLLL(c196925122x);
        }
    }

    @Override // X.C122Q
    public void BG1(String str) {
        ((C560530Lyd) yE2()).LJIIJ(str);
    }

    @Override // X.C122Q
    public Pair<Float, Float> Cc(Context context) {
        float screenWidth;
        float screenHeight;
        Pair<Integer, Integer> pair = this.LLLZL;
        if (pair != null) {
            screenWidth = pair.getFirst().intValue();
            screenHeight = pair.getSecond().intValue();
        } else if (context != null) {
            screenWidth = ScreenUtils.getScreenWidth(context);
            screenHeight = ScreenUtils.getScreenHeight(context);
        } else {
            screenWidth = 0.0f;
            screenHeight = 0.0f;
        }
        return new Pair<>(Float.valueOf(screenWidth), Float.valueOf(screenHeight));
    }

    @Override // X.C122Q
    public void DJ2(long j) {
        List<TextStickerData> list = this.LLLLZ;
        ArrayList<TextStickerData> arrayList = new ArrayList();
        for (TextStickerData textStickerData : list) {
            TextStickerData textStickerData2 = textStickerData;
            int startTime = textStickerData2.getStartTime();
            if (j <= textStickerData2.getEndTime() && startTime <= j && !textStickerData2.getAddToLayout()) {
                arrayList.add(textStickerData);
            }
        }
        for (TextStickerData textStickerData3 : arrayList) {
            textStickerData3.setAddToLayout(true);
            Ct(textStickerData3, true);
        }
        for (C196925122x c196925122x : this.LLLLZIL) {
            c196925122x.setPlayPosition(j);
            c196925122x.LJJII();
        }
    }

    @Override // X.C122Q
    public void Dg(boolean z) {
        o4(z);
    }

    @Override // X.C122Q
    public boolean E2(C21645419nQ c21645419nQ) {
        if (!this.LLLLZLL) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIJJLI(c21645419nQ)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public void Eu(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        List<C196925122x> list = this.LLLLZIL;
        ArrayList arrayList = new ArrayList();
        for (C196925122x c196925122x : list) {
            if (C0FVW.LIZIZ(c196925122x)) {
                arrayList.add(c196925122x);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C196925122x) it2.next()).LJJIII(f, z);
        }
    }

    @Override // X.C122Q
    public void Fb2(boolean z) {
        ((C560530Lyd) Dz2()).LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.C122Q
    public void Fw0(C196925122x c196925122x) {
        this.LLLL.LJIIJ(c196925122x);
    }

    @Override // X.C122Q
    public void IH1(C196925122x c196925122x) {
        this.LLLLZIL.remove(c196925122x);
        ListProtector.add(this.LLLLZIL, 0, c196925122x);
        q3(c196925122x);
    }

    @Override // X.C122Q
    public void IQ1(C196925122x c196925122x) {
        ListProtector.add(this.LLLLZIL, 0, c196925122x);
        v3(c196925122x);
    }

    @Override // X.C122Q
    public void JR1(boolean z) {
        ((C560530Lyd) N80()).LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.C122Q
    public void Jl(InterfaceC196910122i interfaceC196910122i) {
        ((C560530Lyd) Gh2()).LJIIJ(interfaceC196910122i);
    }

    @Override // X.C122Q
    public void LJJJJJ(int i) {
        ((C560530Lyd) c6()).LJIIJ(Integer.valueOf(i));
    }

    @Override // X.C122Q
    public boolean LJJLIIIJLJLI(float f) {
        if (!this.LLLLZLL) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIJJ(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public boolean LLLLJI(float f) {
        if (!this.LLLLZLL) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJJI()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public boolean LLLZLZ(b bVar) {
        if (!this.LLLLZLL) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIJI(bVar)) {
                ((C560530Lyd) ou2()).LJIIJ(Unit.LIZ);
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public void NB0(C196925122x c196925122x) {
        ((C560530Lyd) o61()).LJIIJ(c196925122x);
    }

    @Override // X.C122Q
    public void Nr1(boolean z) {
        this.LLLLLLZ = z;
    }

    public final void O3(boolean z) {
        this.LLLZIL = z;
    }

    @Override // X.C122Q
    public void PJ1(C196925122x c196925122x) {
        ((C560530Lyd) Xs0()).LJIIJ(c196925122x);
    }

    @Override // X.C122Q
    public void Pb(boolean z) {
        ((C560530Lyd) ze0()).LJIIJ(Boolean.valueOf(z));
    }

    public final void Q3(boolean z) {
        this.LLLLZLL = z;
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            it2.next().setEnableEdit(this.LLLLZLL);
        }
    }

    @Override // X.C122Q
    public void R3(boolean z) {
        ((C560530Lyd) Zp2()).LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.C122Q
    public void Ss(InterfaceC196915122n interfaceC196915122n) {
        ((C560530Lyd) X40()).LJIIJ(interfaceC196915122n);
    }

    @Override // X.C122Q
    public void Sy1(int i) {
        ((C560530Lyd) Tv0()).LJIIJ(Integer.valueOf(i));
    }

    @Override // X.C122Q
    public void T3(Function1<? super C196925122x, Unit> function1) {
        ((C560530Lyd) pM1()).LJIIJ(function1);
    }

    @Override // X.C122Q
    public void V1(Function2<? super C196925122x, ? super C196925122x, Unit> function2) {
        ((C560530Lyd) iy2()).LJIIJ(function2);
    }

    @Override // X.C122Q
    public void WY(List<TextStickerTextWrap> list) {
        ((C560530Lyd) pA()).LJIIJ(list);
    }

    @Override // X.C122Q
    public void X3(TextWatcher textWatcher) {
        this.LLZLI = textWatcher;
    }

    @Override // X.C122Q
    public void X61(TextStickerData textStickerData) {
        ((C560530Lyd) W41()).LJIIJ(textStickerData);
    }

    @Override // X.C122Q
    public void XD(InterfaceC196929123b interfaceC196929123b) {
        this.LLJJJIL = interfaceC196929123b;
    }

    @Override // X.C122Q
    public void Yo(C196925122x c196925122x) {
        this.LLLLZIL.remove(c196925122x);
        E3(c196925122x);
    }

    @Override // X.C122Q
    public void Z3(MutableLiveData<Boolean> mutableLiveData) {
        this.LLLLLZ = mutableLiveData;
    }

    @Override // X.C122Q
    public void Ze(C196925122x c196925122x) {
        ((C560530Lyd) gc1()).LJIIJ(c196925122x);
    }

    @Override // X.C122Q
    public void Zn1(C196925122x c196925122x) {
        ((C560530Lyd) Es1()).LJIIJ(c196925122x);
    }

    @Override // X.C122Q
    public void a2(boolean z) {
        ((C540930LJj) rb()).LJII(Boolean.valueOf(z));
        MutableLiveData<Boolean> mutableLiveData = this.LLLLLZ;
        if (mutableLiveData != null && !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.valueOf(z))) {
            mutableLiveData.setValue(Boolean.valueOf(z));
        }
    }

    @Override // X.C122Q
    public void aa(boolean z) {
        ((C560530Lyd) XI()).LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.C122Q
    public void at(TextStickerData textStickerData) {
        ((C560530Lyd) Dp1()).LJIIJ(textStickerData);
    }

    @Override // X.C122Q
    public void b(Pair<Integer, Integer> pair) {
        if (this.LLLZL == null) {
            this.LLLZL = pair;
        }
        ((C560530Lyd) rW1()).LJIIJ(pair);
    }

    @Override // X.C122Q
    public void bP(TextStickerData textStickerData) {
        ((C560530Lyd) vC2()).LJIIJ(textStickerData);
    }

    @Override // X.C122Q
    public void cK1(TextStickerData textStickerData) {
        this.LLLLLLZZ = textStickerData;
    }

    @Override // X.C122Q
    public void cO(C196925122x c196925122x) {
        ((C560530Lyd) yx()).LJIIJ(c196925122x);
    }

    @Override // X.C122Q
    public void dQ2(boolean z) {
        this.LLLLLLL = z;
    }

    public final void e4(boolean z) {
        this.LLLLZLLLI = z;
        List<C196925122x> list = this.LLLLZIL;
        ArrayList arrayList = new ArrayList();
        for (C196925122x c196925122x : list) {
            if (C0FVW.LIZ(c196925122x)) {
                arrayList.add(c196925122x);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C196925122x) it2.next()).setEnableEdit(this.LLLLZLLLI);
        }
    }

    @Override // X.C122Q
    public void eC1(AnonymousClass1243 anonymousClass1243) {
        this.LLJJJJ = anonymousClass1243;
    }

    @Override // X.C122Q
    public void eY0(Pair<String, Integer> pair) {
        ((C560530Lyd) xL()).LJIIJ(pair);
    }

    @Override // X.C122Q
    public void f8(Function1<? super C196925122x, Unit> function1) {
        ((C560530Lyd) GV1()).LJIIJ(function1);
    }

    @Override // X.C122Q
    public void fv0(boolean z) {
        this.LLLLLLIL = z;
    }

    @Override // X.C122Q
    public void gp2(String str) {
        ((C560530Lyd) Li0()).LJIIJ(str);
    }

    @Override // X.C122Q
    public void hL2(int i) {
        ((C560530Lyd) aY0()).LJIIJ(Integer.valueOf(i));
    }

    @Override // X.C122Q
    public void ha1(EnumC390580FTc enumC390580FTc) {
        TextStickerData.Pair<Float, Boolean> alpha;
        for (C196925122x c196925122x : this.LLLLZIL) {
            int i = C390600FTe.LIZ[enumC390580FTc.ordinal()];
            float fFloatValue = 1.0f;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        fFloatValue = 0.3137255f;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    TextStickerData data = c196925122x.getData();
                    if (data != null && (alpha = data.getAlpha()) != null) {
                        fFloatValue = alpha.first.floatValue();
                    }
                }
            }
            c196925122x.LJJIII(fFloatValue, true);
        }
        Iterator<TextStickerData> it2 = this.LLLLZ.iterator();
        while (it2.hasNext()) {
            it2.next().setHighlightState(enumC390580FTc);
        }
    }

    @Override // X.C122Q
    public void i7(InfoStickerModel infoStickerModel) {
        ((C560530Lyd) ZV0()).LJIIJ(infoStickerModel);
    }

    @Override // X.C122Q
    public void ja(boolean z) {
        this.LLLLLLJ = z;
    }

    @Override // X.C122Q
    public void kN1(C560530Lyd<Unit> c560530Lyd) {
        this.LLLZIIL = c560530Lyd;
    }

    public final void m3(TextStickerData textStickerData) {
        this.LLLLLLLLL.setValue(textStickerData);
    }

    @Override // X.C122Q
    public void oF2(C196925122x c196925122x) {
        this.LLLLZI.add(c196925122x);
    }

    @Override // X.C122Q
    public boolean onDown(MotionEvent motionEvent) {
        this.LLLZIL = false;
        if (!this.LLLLZLL) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLJJIJIIJIL.LJIIIZ = 2;
        }
        Iterator<C196925122x> it3 = this.LLLLZIL.iterator();
        while (it3.hasNext()) {
            if (it3.next().LJIJ(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LLLLZLL) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LJIL(scaleGestureDetector)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (!this.LLLLZLL) {
            return false;
        }
        for (C196925122x c196925122x : this.LLLLZIL) {
            if (c196925122x.LJJ(scaleGestureDetector)) {
                ((C560530Lyd) DT()).LJIIJ(c196925122x);
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        InterfaceC1455860nzM interfaceC1455860nzM = (InterfaceC1455860nzM) getDiContainer().LJIIL(null, InterfaceC1455860nzM.class);
        if (interfaceC1455860nzM != null && interfaceC1455860nzM.aN1()) {
            return false;
        }
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJIJIIJIL.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public boolean onUp(MotionEvent motionEvent) {
        if (!this.LLLLZLL) {
            return false;
        }
        for (C196925122x c196925122x : this.LLLLZIL) {
            if (c196925122x.LJJIFFI(motionEvent)) {
                if (C0FVW.LIZ(c196925122x)) {
                    F4(c196925122x);
                }
                ((C560530Lyd) ou2()).LJIIJ(Unit.LIZ);
                m3(c196925122x.LJIIJ());
                H3(c196925122x);
                return true;
            }
        }
        return false;
    }

    @Override // X.C122Q
    public void ov(TextWatcher textWatcher) {
        ((C560530Lyd) Br1()).LJIIJ(textWatcher);
    }

    @Override // X.C122Q
    public void pM(boolean z) {
        this.LLLLLL = z;
    }

    @Override // X.C122Q
    public void qs(View.OnClickListener onClickListener) {
        ((C560530Lyd) Ob0()).LJIIJ(onClickListener);
    }

    @Override // X.C122Q
    public void qw0(TextStickerData textStickerData) {
        if (this.LLLLLLZ) {
            textStickerData.setX(textStickerData.getX() * Cc(C1664590tQ1.LJIIIZ(this)).getFirst().floatValue());
            textStickerData.setY(textStickerData.getY() * Cc(C1664590tQ1.LJIIIZ(this)).getSecond().floatValue());
        }
    }

    @Override // X.C122Q
    public void sE1(boolean z) {
        e4(z);
    }

    @Override // X.C122Q
    public void setEnable(boolean z) {
        Q3(z);
    }

    @Override // X.C122Q
    public void t80(int i) {
        ((C560530Lyd) ft1()).LJIIJ(Integer.valueOf(i));
    }

    @Override // X.C122Q
    public void tm(boolean z) {
        ((C560530Lyd) Uf2()).LJIIJ(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1444160ngU
    public boolean ve1(RectF rectF) {
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            PointF[] anglePointList = it2.next().getAnglePointList();
            if (anglePointList != null && anglePointList.length != 0) {
                RectF rectFLIZIZ = C0GTU.LIZIZ(anglePointList);
                if (rectFLIZIZ.top < rectF.top || rectFLIZIZ.bottom > rectF.bottom || (C301490Brn.LIZ() && (rectFLIZIZ.left < rectF.left || rectFLIZIZ.right > rectF.right))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C122Q
    public void xg0(InterfaceC196933123f interfaceC196933123f) {
        this.LLLLLLLZIL = interfaceC196933123f;
    }

    @Override // X.C122Q
    public void y92(TextStickerData textStickerData) {
        this.LLLLZ.add(textStickerData);
    }

    @Override // X.C122Q
    public void yr(boolean z) {
        ((C560530Lyd) lm2()).LJIIJ(Boolean.valueOf(z));
        this.LLLLLZIL = z;
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLJLILLLLZIIL = this.LLLLLZIL;
        }
    }

    @Override // X.C122Q
    public void zl(InterfaceC196928123a interfaceC196928123a) {
        ((C560530Lyd) Hf1()).LJIIJ(interfaceC196928123a);
    }

    private final PointF K4(PointF pointF, Context context) {
        int screenWidth;
        int screenHeight;
        PointF pointF2 = new PointF();
        Pair<Integer, Integer> pair = this.LLLZL;
        if (pair != null) {
            screenWidth = pair.getFirst().intValue();
            screenHeight = pair.getSecond().intValue();
        } else if (context != null) {
            screenWidth = ScreenUtils.getScreenWidth(context);
            screenHeight = ScreenUtils.getScreenHeight(context);
        } else {
            screenWidth = 0;
            screenHeight = 0;
        }
        if (screenHeight == 0 || screenWidth == 0) {
            C2216191BoX.LIZ.getClass();
            screenWidth = ScreenUtils.getScreenWidth(C2216191BoX.LIZ());
            screenHeight = ScreenUtils.getScreenHeight(C2216191BoX.LIZ());
        }
        try {
            C1462400o9u c1462400o9u = LLZLL;
            float f = (pointF.x * 1.0f) / screenWidth;
            c1462400o9u.getClass();
            pointF2.set(C1462400o9u.LIZ(f), C1462400o9u.LIZ((pointF.y * 1.0f) / screenHeight));
            return pointF2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("EditTextStickerComponent: " + ("x: " + pointF.x + ", y: " + pointF.y + ", videoW: " + screenWidth + ", videoH: " + screenHeight));
            return pointF2;
        }
    }

    private final C15O7<List<TextStickerCompileResult>> X1(C196932123e c196932123e, final ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        String str = c196932123e.LIZ;
        if (str != null && str.length() != 0) {
            final C118300cf c118300cf = new C118300cf();
            for (C196925122x c196925122x : this.LLLLZIL) {
                int iIndexOfChild = viewGroup.indexOfChild(c196925122x);
                arrayList.add(C15O7.LIZIZ(new ACallableS9S1101000_29(iIndexOfChild, c196925122x, w2().LIZIZ(iIndexOfChild, c196932123e.LIZ), 0), C15O7.LJIIIIZZ, null));
                c118300cf.element = Math.max(c118300cf.element, iIndexOfChild);
            }
            final Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewGroup.getWidth(), viewGroup.getHeight(), Bitmap.Config.ARGB_8888);
            Application application = C123O.LIZ;
            if (application == null) {
                application = null;
            }
            bitmapCreateBitmap.setDensity(application.getResources().getDisplayMetrics().densityDpi);
            for (final C196925122x c196925122x2 : this.LLLLZI) {
                c118300cf.element++;
                final String strLIZIZ = o2().LIZIZ(c118300cf.element, c196932123e.LIZ);
                arrayList.add(C15O7.LIZIZ(new Callable() { // from class: X.1237
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("EditTextStickerComponent@10da.compileWithoutPNG$task$2");
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        c196925122x2.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 1073741824));
                        c196925122x2.layout(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
                        C842150X1x.LIZIZ(canvas, c196925122x2);
                        TextStickerCompileResult textStickerCompileResult = new TextStickerCompileResult(c196925122x2.LJIIJ(), new C384910F7h(strLIZIZ, c118300cf.element, c196925122x2.hashCode()));
                        C1C7U.LIZIZ("EditTextStickerComponent@10da.compileWithoutPNG$task$2");
                        return textStickerCompileResult;
                    }
                }, C15O7.LJIIIIZZ, null));
            }
            return C15O7.LJJI(arrayList);
        }
        return C15O7.LJJI(arrayList);
    }

    @Override // X.C122Q
    public void CU1(float f, boolean z) {
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIII(f, z);
        }
        Iterator<TextStickerData> it3 = this.LLLLZ.iterator();
        while (it3.hasNext()) {
            it3.next().setAlpha(new TextStickerData.Pair<>(Float.valueOf(f), Boolean.valueOf(z)));
        }
    }

    @Override // X.C122Q
    public void Cf2(boolean z, C196925122x c196925122x) {
        this.LLZILL.LJII(Boolean.valueOf(z));
        this.LLZL.LJII(c196925122x);
    }

    @Override // X.C122Q
    public void Ct(TextStickerData textStickerData, boolean z) {
        ((C560530Lyd) hq2()).LJIIJ(new Pair(textStickerData, Boolean.valueOf(z)));
    }

    @Override // X.C122Q
    public void Qg0(String str, String str2) {
        AnonymousClass0880.LIZ(this.LLLLLLLLLL, new Pair(str, str2));
    }

    @Override // X.C122Q
    public C15O7<List<TextStickerCompileResult>> Vz2(C196932123e c196932123e, ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditTextStickerComponent -> compile -> _stickerList.size = ");
        sbLIZ.append(this.LLLLZIL.size());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        int iIndexOfChild = -1;
        for (C196925122x c196925122x : this.LLLLZIL) {
            if (viewGroup.indexOfChild(c196925122x) > iIndexOfChild) {
                iIndexOfChild = viewGroup.indexOfChild(c196925122x);
            }
            arrayList.add(w2().LIZ(c196925122x, viewGroup, c196932123e.LIZ, c196932123e.LIZIZ, c196932123e.LIZJ, c196932123e.LIZLLL, c196932123e.LJ).LJIILLIIL(new C19774512Yl(c196925122x, 1)));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("EditTextStickerComponent -> _captionViewList.size = ");
        sbLIZ2.append(this.LLLLZI.size());
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        o2().LIZIZ = iIndexOfChild;
        for (C196925122x c196925122x2 : this.LLLLZI) {
            arrayList.add(o2().LIZ(c196925122x2, viewGroup, c196932123e.LIZ, c196932123e.LIZIZ, c196932123e.LIZJ, c196932123e.LIZLLL, c196932123e.LJ).LJIILLIIL(new C19774512Yl(c196925122x2, 2)));
        }
        return C15O7.LJJI(arrayList);
    }

    public final C15O7<List<TextStickerCompileResult>> W1(String str, ViewGroup viewGroup) {
        LJJJLZIJ();
        ArrayList arrayList = new ArrayList();
        for (C196925122x c196925122x : this.LLLLZIL) {
            arrayList.add(w2().LIZ(c196925122x, viewGroup, str, 0, 0, 0, 0).LJIILLIIL(new C0FXC(c196925122x, 1)));
        }
        return C15O7.LJJI(arrayList);
    }

    @Override // X.C122Q
    public void YH(TextStickerData textStickerData, String str) {
        ((C560530Lyd) m41()).LJIIJ(new Pair(textStickerData, str));
    }

    @Override // X.C122Q
    public void co2(C196925122x c196925122x, Integer num) {
        ((C560530Lyd) i92()).LJIIJ(new Pair(c196925122x, num));
    }

    @Override // X.C122Q
    public void iJ2(float f, boolean z) {
        WZ().setValue(new Pair<>(Float.valueOf(f), Boolean.valueOf(z)));
    }

    @Override // X.C122Q
    public void lT(C196925122x c196925122x, Context context) {
        TextStickerData textStickerDataLJIIJ;
        if (c196925122x != null && (textStickerDataLJIIJ = c196925122x.LJIIJ()) != null) {
            List<C196925122x> list = this.LLLLZIL;
            ArrayList<C196925122x> arrayList = new ArrayList();
            for (C196925122x c196925122x2 : list) {
                C196925122x c196925122x3 = c196925122x2;
                if (C0FVW.LIZ(c196925122x3) && !Intrinsics.LJFF(c196925122x3, c196925122x)) {
                    arrayList.add(c196925122x2);
                }
            }
            for (C196925122x c196925122x4 : arrayList) {
                TextStickerData data = c196925122x4.getData();
                if (data != null) {
                    data.setFontSize(textStickerDataLJIIJ.getFontSize());
                }
                c196925122x4.setFontSize(textStickerDataLJIIJ.getFontSize());
                c196925122x4.LJJIIJ(textStickerDataLJIIJ.getBgMode(), textStickerDataLJIIJ.getColor(), textStickerDataLJIIJ.getAlign(), textStickerDataLJIIJ.getFontType());
                TextStickerData textStickerDataLJIIJ2 = c196925122x4.LJIIJ();
                c196925122x4.LJJIIZI(textStickerDataLJIIJ2.getEffectTextLayoutConfig(), C1697810uHb.LJ(C123P.LIZJ(C123P.LJIILJJIL(textStickerDataLJIIJ2, context))));
            }
            List<TextStickerData> list2 = this.LLLLZ;
            ArrayList<TextStickerData> arrayList2 = new ArrayList();
            for (TextStickerData textStickerData : list2) {
                if (!textStickerData.getAddToLayout()) {
                    arrayList2.add(textStickerData);
                }
            }
            for (TextStickerData textStickerData2 : arrayList2) {
                textStickerData2.setBgMode(textStickerDataLJIIJ.getBgMode());
                textStickerData2.setColor(textStickerDataLJIIJ.getColor());
                textStickerData2.setAlign(textStickerDataLJIIJ.getAlign());
                textStickerData2.setFontSize(textStickerDataLJIIJ.getFontSize());
                textStickerData2.setFontType(textStickerDataLJIIJ.getFontType());
                textStickerData2.setTextWrapList(C1697810uHb.LJ(C123P.LIZJ(C123P.LJIILJJIL(textStickerData2, context))));
            }
        }
    }

    private final Utterance H4(Context context, InteractStickerStruct interactStickerStruct, C196925122x c196925122x) {
        List<TextStickerTextWrap> textWrapList = c196925122x.getTextWrapList();
        try {
            interactStickerStruct.setTextStruct(textWrapList.get(0).getText());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C123O.LIZIZ().LIZIZ(e);
        }
        StringBuilder sb = new StringBuilder("#");
        int i = 1;
        sb.append(C786410Ut5.j4("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(c196925122x.LLJJJJLIIL)}, 1)));
        String string = sb.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('#');
        sbLIZ.append(C786410Ut5.j4("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(c196925122x.LLJJJJJIL)}, 1)));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i2 = c196925122x.LLILZ.LIZLLL;
        if (i2 != 1) {
            i = 2;
            if (i2 == 2 || i2 != 3) {
                i = 0;
            }
        }
        PointF pointFK4 = K4(new PointF(c196925122x.getOriginWidth(), c196925122x.getOriginHeight()), context);
        return new Utterance(c196925122x.LIZLLL(-1), c196925122x.LIZIZ(-1), ((TextStickerTextWrap) ListProtector.get(textWrapList, 0)).getText(), strLIZIZ, string, pointFK4.x, pointFK4.y, 22, i, "", false);
    }

    @Override // X.C122Q
    public boolean LLLLLLLLL(b bVar, float f, float f2) {
        if (!this.LLLLZLL) {
            return false;
        }
        for (C196925122x c196925122x : this.LLLLZIL) {
            if (c196925122x.LJJIJIIJIL()) {
                c196925122x.LLJZ = c196925122x.LJIILJJIL(f, f2);
                c196925122x.LLJJIJIIJIL.LIZJ(f, f2);
                if (c196925122x.LLJZIJLIL || c196925122x.LLL || c196925122x.LLJZ || c196925122x.LLJJIJIIJIL.LJIIIZ == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C122Q
    public InteractStickerStruct hN1(Context context, List<? extends StickerItemModel> list, Gson gson) {
        C196925122x next;
        float stickerScale;
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(20);
        ArrayList arrayList = new ArrayList();
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!C0FVW.LIZ(next));
        C196925122x c196925122x = next;
        if (c196925122x != null || (this.LLLLZI.size() > 0 && (c196925122x = (C196925122x) ListProtector.get(this.LLLLZI, 0)) != null)) {
            LinkedList linkedList = new LinkedList();
            NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
            C1462400o9u c1462400o9u = LLZLL;
            float stickerRotate = c196925122x.getStickerRotate();
            c1462400o9u.getClass();
            normalTrackTimeStamp.setRotation(C1462400o9u.LIZ(stickerRotate));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditTextStickerComponent -> getInlineCaptionStructList -> textStickerView.stickerScale = ");
            sbLIZ.append(c196925122x.getStickerScale());
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            if (c196925122x.getStickerScale() == 0.0f) {
                TextStickerData data = c196925122x.getData();
                if (data != null) {
                    stickerScale = data.getScale();
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                stickerScale = c196925122x.getStickerScale();
            }
            normalTrackTimeStamp.setScale(Float.valueOf(stickerScale));
            PointF pointFK4 = K4(new PointF(c196925122x.getCenterX(), c196925122x.getTextMiddleLineCenterY()), context);
            normalTrackTimeStamp.setX(pointFK4.x);
            normalTrackTimeStamp.setY(pointFK4.y);
            PointF pointFK42 = K4(new PointF(c196925122x.getContentViewWidth(), c196925122x.getContentViewHeight()), context);
            normalTrackTimeStamp.setWidth(pointFK42.x);
            normalTrackTimeStamp.setHeight(pointFK42.y);
            linkedList.add(normalTrackTimeStamp);
            C1462390o9t.LIZIZ(interactStickerStruct, linkedList);
        }
        List<C196925122x> list2 = this.LLLLZIL;
        ArrayList arrayList2 = new ArrayList();
        for (C196925122x c196925122x2 : list2) {
            if (C0FVW.LIZ(c196925122x2)) {
                arrayList2.add(c196925122x2);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList.add(H4(context, interactStickerStruct, (C196925122x) it3.next()));
        }
        Iterator<C196925122x> it4 = this.LLLLZI.iterator();
        while (it4.hasNext()) {
            arrayList.add(H4(context, interactStickerStruct, it4.next()));
        }
        C201955140j.LIZ("EditTextStickerComponent -> getInlineCaptionStructList = captionList.size = " + arrayList.size());
        interactStickerStruct.setCaptionStruct(new CaptionStruct(null, arrayList, EnumC389920FQo.LEFT_BOTTOM.getValue(), null, null, 0L, null, null, null));
        return interactStickerStruct;
    }

    @Override // X.C122Q
    public C15O7<List<TextStickerCompileResult>> jI0(C196932123e c196932123e, ViewGroup viewGroup, boolean z) {
        LJJJLZIJ();
        if (C1440480naY.LIZ() && !z) {
            return X1(c196932123e, viewGroup);
        }
        return Vz2(c196932123e, viewGroup);
    }

    @Override // X.C122Q
    public List<InteractStickerStruct> nt(Context context, List<? extends StickerItemModel> list, Gson gson) {
        boolean z;
        float stickerScale;
        int i;
        ArrayList arrayList = new ArrayList(Ir0());
        List<C196925122x> list2 = this.LLLLZIL;
        ArrayList<C196925122x> arrayList2 = new ArrayList();
        for (C196925122x c196925122x : list2) {
            if (C0FVW.LIZIZ(c196925122x)) {
                arrayList2.add(c196925122x);
            }
        }
        for (C196925122x c196925122x2 : arrayList2) {
            if (!c196925122x2.LLJILJIL) {
                List<TextStickerTextWrap> textWrapList = c196925122x2.getTextWrapList();
                InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
                interactStickerStruct.setType(18);
                LinkedList linkedList = new LinkedList();
                NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
                C1462400o9u c1462400o9u = LLZLL;
                float stickerRotate = c196925122x2.getStickerRotate();
                c1462400o9u.getClass();
                normalTrackTimeStamp.setRotation(C1462400o9u.LIZ(stickerRotate));
                if (c196925122x2.getStickerScale() == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    TextStickerData data = c196925122x2.getData();
                    if (data != null) {
                        stickerScale = data.getScale();
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    stickerScale = c196925122x2.getStickerScale();
                }
                normalTrackTimeStamp.setScale(Float.valueOf(stickerScale));
                PointF pointFK4 = K4(new PointF(c196925122x2.getCenterX(), c196925122x2.getTextMiddleLineCenterY()), context);
                normalTrackTimeStamp.setX(pointFK4.x);
                normalTrackTimeStamp.setY(pointFK4.y);
                PointF pointFK42 = K4(new PointF(c196925122x2.getContentViewWidth(), c196925122x2.getContentViewHeight()), context);
                normalTrackTimeStamp.setWidth(pointFK42.x);
                normalTrackTimeStamp.setHeight(pointFK42.y);
                int i2 = -1;
                normalTrackTimeStamp.setStartTime(c196925122x2.LIZLLL(-1));
                normalTrackTimeStamp.setEndTime(c196925122x2.LIZIZ(-1));
                linkedList.add(normalTrackTimeStamp);
                C1462390o9t.LIZIZ(interactStickerStruct, linkedList);
                try {
                    interactStickerStruct.setTextStruct(textWrapList.get(0).getText());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C123O.LIZIZ().LIZIZ(e);
                }
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    if (((StickerItemModel) ListProtector.get(list, i3)).viewHash == c196925122x2.hashCode()) {
                        interactStickerStruct.setIndex(((StickerItemModel) ListProtector.get(list, i3)).layerWeight);
                        HashMap map = new HashMap();
                        map.put("text_sticker_id", ((StickerItemModel) ListProtector.get(list, i3)).stickerId);
                        interactStickerStruct.setAttr(GsonProtectorUtils.toJson(C123O.LIZ(), map));
                        break;
                    }
                    i3++;
                }
                int i4 = c196925122x2.LLJJJJLIIL;
                int i5 = c196925122x2.LLJJJJJIL;
                if (i4 == i5) {
                    i4 = -16777216;
                } else {
                    i2 = i5;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(C786410Ut5.j4("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('#');
                sbLIZ2.append(C786410Ut5.j4("%08x", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                int i6 = c196925122x2.LLILZ.LIZLLL;
                if (i6 != 1) {
                    if (i6 != 2 && i6 == 3) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                } else {
                    i = 1;
                }
                PointF pointFK43 = K4(new PointF(c196925122x2.getOriginWidth(), c196925122x2.getOriginHeight()), context);
                interactStickerStruct.setTextInfo(new TextStickerInfo(strLIZIZ2, strLIZIZ, "", pointFK43.x, pointFK43.y, 28, i));
                arrayList.add(interactStickerStruct);
            }
        }
        return arrayList;
    }

    @Override // X.C122Q
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJIJIIJIL.LJIIIZ != 2) {
                return true;
            }
        }
        if (!this.LLLZIL) {
            return false;
        }
        this.LLLZIL = false;
        return true;
    }

    @Override // X.C122Q
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        Iterator<C196925122x> it2 = this.LLLLZIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().LLJJIJIIJIL.LJIIIZ != 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C196924122w(C1DRG c1drg, C19A3 c19a3, int i, InterfaceC196906122e interfaceC196906122e, int i2, boolean z, Function0<? extends C0FVR> function0, AnonymousClass1240 anonymousClass1240, TTSVoiceModel tTSVoiceModel, Function0<Unit> function02, int i3) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        this.LLILZ = interfaceC196906122e;
        this.LLILZIL = i2;
        this.LLILZLL = z;
        this.LLIZ = function0;
        this.LLIZLLLIL = anonymousClass1240;
        this.LLJ = tTSVoiceModel;
        this.LLJI = function02;
        this.LLJIJIL = i3;
        Boolean bool = Boolean.FALSE;
        this.LLJILJILJ = new h0(bool);
        this.LLJILLL = new C560530Lyd();
        this.LLJJ = new C560530Lyd();
        this.LLJJI = new C560530Lyd();
        this.LLJJIII = new C560530Lyd();
        this.LLJJIJI = new C560530Lyd();
        this.LLJJIJIIJIL = new C560530Lyd<>();
        this.LLJJIJIL = new C560530Lyd();
        this.LLJJJ = new C560530Lyd();
        this.LLJJJJJIL = new C560530Lyd();
        this.LLJJJJLIIL = new C560530Lyd();
        this.LLJJL = new C560530Lyd();
        this.LLJJLIIIJLLLLLLLZ = new C560530Lyd();
        this.LLJL = new C560530Lyd();
        this.LLJLIL = new C560530Lyd();
        this.LLJLILLLLZIIL = new C560530Lyd();
        this.LLJLL = new C560530Lyd();
        this.LLJLLIL = new C560530Lyd();
        this.LLJLLL = new C560530Lyd();
        this.LLJZ = new C560530Lyd();
        this.LLJZIJLIL = new C560530Lyd();
        this.LLL = new C560530Lyd();
        this.LLLF = new C560530Lyd();
        this.LLLFF = new C560530Lyd();
        this.LLLFFI = new C560530Lyd();
        this.LLLFZ = new C560530Lyd();
        this.LLLI = new C560530Lyd();
        this.LLLII = new C560530Lyd();
        this.LLLIIII = new C560530Lyd();
        this.LLLIIIIL = new C560530Lyd();
        this.LLLIIIL = new C560530Lyd();
        this.LLLIIL = new C560530Lyd();
        this.LLLIILIL = new C560530Lyd();
        this.LLLIL = new C560530Lyd();
        this.LLLILZ = new C560530Lyd();
        this.LLLILZJ = new C560530Lyd();
        this.LLLILZLLLI = new C560530Lyd();
        this.LLLIZZ = new C560530Lyd();
        this.LLLJ = new C560530Lyd();
        this.LLLJIL = new C560530Lyd();
        this.LLLJL = new C560530Lyd();
        C560530Lyd<C196925122x> c560530Lyd = new C560530Lyd<>();
        this.LLLL = c560530Lyd;
        this.LLLLII = c560530Lyd;
        this.LLLLIIIILLL = new C560530Lyd();
        this.LLLLIIL = new C560530Lyd();
        this.LLLLIILL = new C560530Lyd();
        this.LLLLIILLL = new C560530Lyd();
        this.LLLLIL = new C560530Lyd();
        this.LLLLILI = new C560530Lyd();
        this.LLLLJ = new C560530Lyd();
        this.LLLLJI = new C560530Lyd();
        this.LLLLL = new C560530Lyd();
        this.LLLLLIL = new C560530Lyd();
        this.LLLLLILLIL = new C560530Lyd();
        C560530Lyd<Unit> c560530Lyd2 = new C560530Lyd<>();
        this.LLLLLJIL = c560530Lyd2;
        this.LLLLLJLJLL = c560530Lyd2;
        this.LLLLLLLLL = new MutableLiveData<>();
        this.LLLLLLLLLL = new MutableLiveData<>();
        this.LLLLLZL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(15));
        this.LLLLZ = new ArrayList();
        this.LLLLZI = new ArrayList();
        this.LLLLZIL = new CopyOnWriteArrayList();
        this.LLLLZLL = true;
        this.LLLLZLLIL = true;
        this.LLLLZLLLI = true;
        this.LLLZ = new C560530Lyd<>();
        this.LLLZI = new C560530Lyd<>();
        this.LLLZIIL = new C560530Lyd<>();
        this.LLLZLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(17));
        this.LLLZLZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(16));
        this.LLLZZ = new C560530Lyd<>();
        this.LLLZZIL = new C560530Lyd<>();
        this.LLZ = new C560530Lyd<>();
        this.LLZIL = new C560530Lyd<>();
        this.LLZILL = new h0<>(bool);
        this.LLZL = new h0<>(null);
    }
}
