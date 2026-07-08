package X;

import com.ss.android.ugc.aweme.im.common.setting.IMTemplateConfigurationSetting;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.HighlightStoryComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS57S0001000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Zqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912330Zqh implements C0Z83 {
    public final String LIZ;
    public final long LIZIZ;
    public final InterfaceC874680YTa LIZJ;
    public final C11RO LIZLLL;
    public final Function0<Integer> LJ;
    public final C912350Zqj LJFF;
    public final C912350Zqj LJI;
    public final C01GW LJII;
    public final C11RK<Integer> LJIIIIZZ;
    public final AtomicBoolean LJIIIZ;
    public final AtomicBoolean LJIIJ;
    public C11JF LJIIJJI;
    public volatile C11JF LJIIL;

    @Override // X.C0Z83
    public final void LIZ() {
        C11JF c11jf = this.LJIIJJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LJIIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LJFF.LIZ();
        LJI().LIZ();
    }

    public final C912350Zqj LJI() {
        return (C912350Zqj) this.LJII.getValue();
    }

    public final void LJIIIIZZ() {
        C11JF c11jf = this.LJIIJJI;
        if (c11jf == null || c11jf.isDisposed()) {
            this.LJIIJJI = C1239300iM4.LJ(this.LJIIIIZZ.LJJLIIIJLLLLLLLZ(this.LIZIZ, TimeUnit.MILLISECONDS).LJJJLZIJ(this.LIZLLL), new AwS593S0100000_14(this, 236), C1239300iM4.LIZJ, new C912340Zqi(this));
        }
    }

    public C912330Zqh(String str) {
        IMTemplateConfigurationSetting.TemplateConfigurationModel templateConfigurationModel = IMTemplateConfigurationSetting.LIZ;
        int i = templateConfigurationModel.refreshPageSize;
        long j = templateConfigurationModel.refreshInterval;
        InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
        C19502311Rt c19502311Rt = new C19502311Rt();
        AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(403);
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = interfaceC874680YTaLIZ;
        this.LIZLLL = c19502311Rt;
        this.LJ = aFwS201S0000000_14;
        this.LJFF = new C912350Zqj(i);
        this.LJI = new C912350Zqj(i);
        this.LJII = C452501pT.LIZIZ(new AwS57S0001000_14(i, 0));
        this.LJIIIIZZ = new C11RK<>();
        this.LJIIIZ = new AtomicBoolean();
        this.LJIIJ = new AtomicBoolean();
        LJIIIIZZ();
    }

    @Override // X.C0Z83
    public final void LIZIZ(List<? extends C869590Y9l> list) {
        String uid;
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            if (c869590Y9l.getMsgType() == 25) {
                arrayList.add(c869590Y9l);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ShareUserContent shareUserContent = (ShareUserContent) BaseContentParserKt.getOrParseJsonContent((C869590Y9l) it2.next(), ShareUserContent.class);
            if (shareUserContent == null || (uid = shareUserContent.getUid()) == null) {
                uid = "";
            }
            arrayList2.add(uid);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            String str = (String) obj;
            if (str != null && str.length() != 0) {
                IMContactApi.LIZ.getClass();
                if (!C069P.LIZ().LJ().LJIJJLI(str)) {
                    arrayList3.add(obj);
                }
            }
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList3);
        if (setLLIIJI.isEmpty()) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 12))), null, null, new C05LA(setLLIIJI, null), 3);
    }

    @Override // X.C0Z83
    public final void LIZJ(List<? extends C869590Y9l> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            if (C0ZDX.LJJIIJ(c869590Y9l)) {
                arrayList.add(c869590Y9l);
            } else {
                arrayList2.add(c869590Y9l);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List<? extends C869590Y9l> list2 = (List) pair.getFirst();
        List<? extends C869590Y9l> list3 = (List) pair.getSecond();
        LJI().LJ(list2);
        this.LJFF.LJ(list3);
        LJIIIIZZ();
        this.LJIIIIZZ.onNext(1);
    }

    @Override // X.C0Z83
    public final void LIZLLL(List<? extends C869590Y9l> list) {
        Integer numLJIIJJI;
        int iIntValue = this.LJ.invoke().intValue();
        C08QU c08quLJIIIZ = C09RB.LJIIIZ(C09RB.LJIIIZ(new C1939607ik(list), AFwS240S0000000_9.get$arr$(824)), AFwS240S0000000_9.get$arr$(825));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C08QT c08qt = new C08QT(c08quLJIIIZ);
        while (c08qt.hasNext()) {
            Object next = c08qt.next();
            if (C0ZDX.LJJIIJ((C869590Y9l) next)) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.getFirst();
        Object second = pair.getSecond();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list2) {
            C869590Y9l c869590Y9l = (C869590Y9l) obj;
            if (c869590Y9l.getTtl() > 0) {
                if (c869590Y9l.getTtl() < iIntValue) {
                    arrayList3.add(obj);
                }
            } else {
                String str = c869590Y9l.getLocalExt().get("a:refreshed_res_ttl");
                if (str != null) {
                    numLJIIJJI = C2095008Iq.LJIIJJI(str);
                } else {
                    numLJIIJJI = null;
                }
                if (c869590Y9l.getMsgType() == 1805 || c869590Y9l.getMsgType() == 1809) {
                    if (numLJIIJJI == null || numLJIIJJI.intValue() < iIntValue) {
                        arrayList3.add(obj);
                    }
                }
            }
        }
        Pair pair2 = new Pair(arrayList3, second);
        List<? extends C869590Y9l> list3 = (List) pair2.getFirst();
        List<? extends C869590Y9l> list4 = (List) pair2.getSecond();
        LJI().LJ(list3);
        this.LJI.LJ(list4);
        LJIIIIZZ();
        this.LJIIIIZZ.onNext(1);
    }

    @Override // X.C0Z83
    public final void LJ(C869590Y9l c869590Y9l) {
        if (C0ZDX.LJJIIJ(c869590Y9l)) {
            LJI().LIZLLL(c869590Y9l);
        } else {
            this.LJFF.LIZLLL(c869590Y9l);
        }
        LJIIIIZZ();
        this.LJIIIIZZ.onNext(1);
    }

    public static final Long LJFF(C869590Y9l c869590Y9l, AwemeCardTemplate awemeCardTemplate) {
        HighlightStoryComponent highlightStoryComponent;
        String str;
        Long lLJIILIIL;
        if (Intrinsics.LJFF(c869590Y9l.getScene(), EnumC896390ZEn.HIGHLIGHT_STORY_COLLECTION.getScene()) && (highlightStoryComponent = awemeCardTemplate.highlightStoryComponent) != null && (str = highlightStoryComponent.highlightStoryCollectionId) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            return Long.valueOf(lLJIILIIL.longValue());
        }
        return C2095008Iq.LJIILIIL(awemeCardTemplate.baseVideoComponent.id);
    }

    public static final void LJII(List<? extends C869590Y9l> list, boolean z) {
        Iterator<? extends C869590Y9l> it2 = list.iterator();
        while (it2.hasNext()) {
            C901060ZWm.LIZLLL(it2.next(), false);
        }
        if (!z) {
            C875230YVd.LIZJ(new C0Y3I("refresh message resource complete"), list);
        }
    }
}
