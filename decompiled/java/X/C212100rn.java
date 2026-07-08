package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C212100rn {
    public final Function0<ArrayList<GiftPage>> LIZ;
    public final Function1<ArrayList<GiftPage>, Unit> LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final Function0<Long> LIZLLL;
    public final Function1<String, Unit> LJ;
    public final Function1<ArrayList<GiftPage>, Unit> LJFF;
    public Long LJI;
    public boolean LJII;
    public final C212000rm LJIIIIZZ = new InterfaceC1147150fxR() { // from class: X.00rm
        @Override // X.InterfaceC1147150fxR
        public final void LIZ(C1142100fpI c1142100fpI) {
        }

        @Override // X.InterfaceC1147150fxR
        public final void LIZIZ(List<Long> list) {
            ArrayList<GiftPage> arrayListInvoke;
            GiftPage giftPageLIZ;
            List<Gift> listJj1;
            C212100rn c212100rn = this.LIZ;
            if (!c212100rn.LJII && (giftPageLIZ = C177800mG.LIZ((arrayListInvoke = c212100rn.LIZ.invoke()))) != null) {
                List list2 = giftPageLIZ.favouriteGifts;
                if (list2 == null) {
                    list2 = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(((Gift) it2.next()).id));
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List<Gift> list3 = giftPageLIZ.favouriteGifts;
                if (list3 == null) {
                    list3 = C13BV.INSTANCE;
                }
                for (Gift gift : list3) {
                    linkedHashMap.put(Long.valueOf(gift.id), gift);
                }
                List<Gift> list4 = giftPageLIZ.gifts;
                if (list4 == null) {
                    list4 = C13BV.INSTANCE;
                }
                for (Gift gift2 : list4) {
                    linkedHashMap.put(Long.valueOf(gift2.id), gift2);
                }
                IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
                if (iMusicGiftService == null || (listJj1 = iMusicGiftService.Jj1()) == null) {
                    listJj1 = C13BV.INSTANCE;
                }
                for (Gift gift3 : listJj1) {
                    linkedHashMap.put(Long.valueOf(gift3.id), gift3);
                }
                List<Gift> listLJJII = C09RB.LJJII(C09RB.LJIJI(C09RB.LJJI(C09RB.LJI(C09RB.LJIIIZ(new C1939607ik(list), AnonymousClass0207.get$arr$(85))), 4), new C5183020f(linkedHashMap, (LinkedHashMap<String, Integer>) 190)));
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJII, 10));
                Iterator<Gift> it3 = listLJJII.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf(it3.next().id));
                }
                if (!Intrinsics.LJFF(arrayList, arrayList2)) {
                    giftPageLIZ.favouriteGifts = listLJJII;
                    C177800mG.LIZLLL(arrayListInvoke);
                    if (this.LIZ.LIZJ.invoke().booleanValue()) {
                        this.LIZ.LJ.invoke("music_favorite_event");
                        this.LIZ.LIZ();
                        this.LIZ.LJFF.invoke(arrayListInvoke);
                    }
                }
            }
        }
    };

    public final void LIZ() {
        if (this.LIZJ.invoke().booleanValue()) {
            Long lInvoke = this.LIZLLL.invoke();
            if (lInvoke.longValue() <= 0) {
                lInvoke = null;
            }
            this.LJI = lInvoke;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LIZIZ(long r9, java.util.LinkedList r11) {
        /*
            r8 = this;
            java.lang.Long r7 = r8.LJI
            r6 = 0
            if (r7 == 0) goto L13
            long r4 = r7.longValue()
            boolean r0 = r11 instanceof java.util.Collection
            if (r0 == 0) goto L1d
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L1d
        L13:
            r7 = r6
        L14:
            r8.LJI = r6
            if (r7 == 0) goto L38
            long r0 = r7.longValue()
            return r0
        L1d:
            java.util.Iterator r3 = r11.iterator()
        L21:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L13
            java.lang.Object r0 = r3.next()
            X.0fQI r0 = (X.AbstractC1126600fQI) r0
            if (r0 == 0) goto L21
            long r1 = r0.LJI()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L21
            goto L14
        L38:
            long r0 = X.C01AV.LIZ(r9, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C212100rn.LIZIZ(long, java.util.LinkedList):long");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.00rm] */
    public C212100rn(C5182020e c5182020e, C5182020e c5182020e2, C5182020e c5182020e3, C5183020f c5183020f, AwS596S0100000_17 awS596S0100000_17, C5183020f c5183020f2) {
        this.LIZ = c5182020e;
        this.LIZIZ = c5183020f;
        this.LIZJ = c5182020e2;
        this.LIZLLL = c5182020e3;
        this.LJ = awS596S0100000_17;
        this.LJFF = c5183020f2;
    }
}
