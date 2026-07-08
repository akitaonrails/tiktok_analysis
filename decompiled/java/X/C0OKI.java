package X;

import Y.AComparatorS28S0000000_9;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinVoiceItem;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OKI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinPublishManager$onPublishFailed$1", f = "BulletinPublishManager.kt", l = {}, m = "invokeSuspend")
public final class C0OKI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ BulletinBaseItem LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OKI(String str, BulletinBaseItem bulletinBaseItem, int i, InterfaceC1364105Vn<? super C0OKI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = bulletinBaseItem;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OKI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BulletinVoiceItem bulletinVoiceItemLLIIIL;
        BulletinVoiceItem bulletinVoiceItem;
        char c;
        C0OOV c0oovLLIIIL;
        C0OOV c0oov;
        C0OOO c0ooo;
        BulletinPhotoItem bulletinPhotoItemLLIIIL;
        BulletinPhotoItem bulletinPhotoItem;
        C0OOP c0oopLLIIIL;
        C0OOP c0oop;
        C1C7U.LIZ("BulletinPublishManager@9c10.onPublishFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0OOY c0ooy = C0OOY.LIZ;
        String str = this.LL;
        BulletinBaseItem bulletinBaseItem = this.LLILLJJLI;
        int i = this.LLILLL;
        c0ooy.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("storeNotSendItem() start - bulletinId=");
        sbLIZ.append(str);
        sbLIZ.append(", type=");
        sbLIZ.append(bulletinBaseItem.LIZLLL());
        sbLIZ.append(", creatorTime=");
        sbLIZ.append(bulletinBaseItem.LJIIZILJ());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        try {
            ArrayList arrayList = new ArrayList(JsonParseUtils.LIZJ(C0OJT.class, C0OOY.LIZIZ().getString(C786410Ut5.j4("bulletin_list_not_send_list%s", Arrays.copyOf(new Object[]{str}, 1)), JsonParseUtils.LJ(C13BV.INSTANCE))));
            if (arrayList.size() >= 20) {
                arrayList.remove(arrayList.size() - 1);
            }
            Integer numValueOf = null;
            numValueOf = null;
            c0oooLLIIIL = null;
            C0OOO c0oooLLIIIL = null;
            switch (C618600OOc.LIZIZ[bulletinBaseItem.LIZLLL().ordinal()]) {
                case 1:
                case 2:
                    c = 0;
                    EnumC618810OOx enumC618810OOxLIZLLL = bulletinBaseItem.LIZLLL();
                    long jLJIIZILJ = bulletinBaseItem.LJIIZILJ();
                    if ((bulletinBaseItem instanceof C0OOP) && (c0oop = (C0OOP) bulletinBaseItem) != null) {
                        c0oopLLIIIL = C0OOP.LLIIIL(c0oop, false, false, false, false, 0, 0, null, null, null, 268435451);
                        numValueOf = null;
                        c0oopLLIIIL.LLJLLIL = null;
                    } else {
                        numValueOf = null;
                        c0oopLLIIIL = null;
                    }
                    arrayList.add(0, new C0OJT(enumC618810OOxLIZLLL, jLJIIZILJ, c0oopLLIIIL, numValueOf, numValueOf, numValueOf, numValueOf, 120));
                    break;
                case 3:
                    c = 0;
                    EnumC618810OOx enumC618810OOxLIZLLL2 = bulletinBaseItem.LIZLLL();
                    long jLJIIZILJ2 = bulletinBaseItem.LJIIZILJ();
                    if ((bulletinBaseItem instanceof BulletinPhotoItem) && (bulletinPhotoItem = (BulletinPhotoItem) bulletinBaseItem) != null) {
                        bulletinPhotoItemLLIIIL = BulletinPhotoItem.LLIIIL(bulletinPhotoItem, false, false, false, false, 0, 0, null, null, null, 33554429);
                        bulletinPhotoItemLLIIIL.LLJLIL = null;
                    } else {
                        bulletinPhotoItemLLIIIL = null;
                    }
                    arrayList.add(0, new C0OJT(enumC618810OOxLIZLLL2, jLJIIZILJ2, null, bulletinPhotoItemLLIIIL, null, null, null, 116));
                    numValueOf = null;
                    break;
                case 4:
                    EnumC618810OOx enumC618810OOxLIZLLL3 = bulletinBaseItem.LIZLLL();
                    long jLJIIZILJ3 = bulletinBaseItem.LJIIZILJ();
                    if ((bulletinBaseItem instanceof C0OOO) && (c0ooo = (C0OOO) bulletinBaseItem) != null) {
                        c0oooLLIIIL = C0OOO.LLIIIL(c0ooo, false, false, false, false, 0, 0, null, null, i, 7864317);
                        c0oooLLIIIL.LJZ(null);
                    }
                    c = 0;
                    arrayList.add(0, new C0OJT(enumC618810OOxLIZLLL3, jLJIIZILJ3, null, null, c0oooLLIIIL, null, null, 108));
                    numValueOf = null;
                    break;
                case 5:
                    EnumC618810OOx enumC618810OOxLIZLLL4 = bulletinBaseItem.LIZLLL();
                    long jLJIIZILJ4 = bulletinBaseItem.LJIIZILJ();
                    if ((bulletinBaseItem instanceof C0OOV) && (c0oov = (C0OOV) bulletinBaseItem) != null) {
                        c0oovLLIIIL = C0OOV.LLIIIL(c0oov, false, false, false, false, 0, 0, null, 0, null, null, null, 67108861);
                        c0oovLLIIIL.LLJLILLLLZIIL = null;
                    } else {
                        c0oovLLIIIL = null;
                    }
                    arrayList.add(0, new C0OJT(enumC618810OOxLIZLLL4, jLJIIZILJ4, null, null, null, c0oovLLIIIL, null, 92));
                    c = 0;
                    break;
                case 6:
                    EnumC618810OOx enumC618810OOxLIZLLL5 = bulletinBaseItem.LIZLLL();
                    long jLJIIZILJ5 = bulletinBaseItem.LJIIZILJ();
                    if ((bulletinBaseItem instanceof BulletinVoiceItem) && (bulletinVoiceItem = (BulletinVoiceItem) bulletinBaseItem) != null) {
                        bulletinVoiceItemLLIIIL = BulletinVoiceItem.LLIIIL(bulletinVoiceItem, null, false, false, false, false, 0, 0, null, null, 0, -1025);
                        bulletinVoiceItemLLIIIL.LLL = null;
                    } else {
                        bulletinVoiceItemLLIIIL = null;
                    }
                    arrayList.add(0, new C0OJT(enumC618810OOxLIZLLL5, jLJIIZILJ5, null, null, null, null, bulletinVoiceItemLLIIIL, 60));
                    c = 0;
                    break;
                default:
                    c = 0;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("storeNotSendItem() error - type error, item = ");
                    sbLIZ2.append(bulletinBaseItem);
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                    break;
            }
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS28S0000000_9(20));
            }
            String strLJ = JsonParseUtils.LJ(arrayList);
            Keva kevaLIZIZ = C0OOY.LIZIZ();
            Object[] objArr = new Object[1];
            objArr[c] = str;
            kevaLIZIZ.storeString(C786410Ut5.j4("bulletin_list_not_send_list%s", Arrays.copyOf(objArr, 1)), strLJ);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("storeNotSendItem() done - bulletinId=");
            sbLIZ3.append(str);
            sbLIZ3.append(", listSize=");
            sbLIZ3.append(arrayList.size());
            sbLIZ3.append(", jsonLen=");
            if (strLJ != null) {
                numValueOf = Integer.valueOf(strLJ.length());
            }
            sbLIZ3.append(numValueOf);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
            C0OOY.LIZIZ.remove(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("storeNotSendItem() error - e.message = ");
            sbLIZ4.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ4));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinPublishManager@9c10.onPublishFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
