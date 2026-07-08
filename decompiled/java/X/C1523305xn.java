package X;

import Y.AComparatorS21S0000000_2;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.fragment.ImportDeviceSoundsFragment$onViewCreated$3$1$1", f = "ImportDeviceSoundsFragment.kt", l = {}, m = "invokeSuspend")
public final class C1523305xn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ImportDeviceSoundsFragment LL;
    public final /* synthetic */ List<AIGCInfo> LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523305xn(ImportDeviceSoundsFragment importDeviceSoundsFragment, List<AIGCInfo> list, View view, InterfaceC1364105Vn<? super C1523305xn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = importDeviceSoundsFragment;
        this.LLILLJJLI = list;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1523305xn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIGCInfo aIGCInfo;
        C1C7U.LIZ("ImportDeviceSoundsFragment@5e82.onViewCreated$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList<MusicModel> arrayList = this.LL.LLJJJIL;
        List<AIGCInfo> list = this.LLILLJJLI;
        View view = this.LLILLL;
        Iterator<MusicModel> it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            C128Y parentFragment = null;
            if (it2.hasNext()) {
                MusicModel next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    MusicModel musicModel = next;
                    if (list != null && (aIGCInfo = (AIGCInfo) C13LP.LJJJLZIJ(i, list)) != null) {
                        musicModel.setAigcInfo(aIGCInfo);
                    }
                    if (!C15KM.LIZJ(view.getContext(), UriProtector.parse(musicModel.getLocalPath()))) {
                        C1389890mGx c1389890mGx = new C1389890mGx(view);
                        c1389890mGx.LJIIIZ(2131825018);
                        c1389890mGx.LJIIJJI();
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.onViewCreated$3$1$1");
                        return unit;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                ArrayList<MusicModel> arrayList2 = this.LL.LLJJJIL;
                if (arrayList2.size() > 1) {
                    C08XD.LJJ(arrayList2, new AComparatorS21S0000000_2(2));
                }
                Fragment parentFragment2 = this.LL.getParentFragment();
                if (parentFragment2 != null) {
                    parentFragment = parentFragment2.getParentFragment();
                }
                ((InterfaceC1523405xo) parentFragment).UA(this.LL.LLJJJIL);
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this.LL, C343970De7.LIZ);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ImportDeviceSoundsFragment@5e82.onViewCreated$3$1$1");
                return unit2;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
