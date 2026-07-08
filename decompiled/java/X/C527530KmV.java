package X;

import Y.AComparatorS507S0100000_8;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.AlbumSelection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.AlbumSelectionRestoreComponent$onCreate$1$list$1", f = "AlbumSelectionRestoreComponent.kt", l = {206}, m = "invokeSuspend")
public final class C527530KmV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends TikTokMediaModel>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C527520KmU LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C527530KmV(C527520KmU c527520KmU, Context context, InterfaceC1364105Vn<? super C527530KmV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c527520KmU;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C527530KmV c527530KmV = new C527530KmV(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c527530KmV.LLILLL = obj;
        return c527530KmV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        Map map;
        C1C7U.LIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Iterable iterable2 = (Iterable) this.LL;
                Map map2 = (Map) this.LLILLL;
                C155000ia.LIZIZ(obj);
                map = map2;
                iterable = iterable2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            if (this.LLILZ.W2(this.LLILZIL)) {
                C13BV c13bv = C13BV.INSTANCE;
                C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1");
                return c13bv;
            }
            String[] stringArray = C527550KmX.LIZLLL().getStringArray(this.LLILZ.Z1(), new String[0]);
            ArrayList arrayList = new ArrayList();
            int length = stringArray.length;
            int i2 = 0;
            while (true) {
                Object objLIZIZ = null;
                if (i2 >= length) {
                    break;
                }
                String str = stringArray[i2];
                try {
                    C1227904rF.LIZ.getClass();
                    objLIZIZ = C1227904rF.LIZIZ(str, AlbumSelection.class);
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    C201955140j.LJIIJ(C533790Kwb.LIZIZ, "getLastSelection json parse failed", e);
                }
                if (objLIZIZ != null) {
                    arrayList.add(objLIZIZ);
                }
                i2++;
            }
            if (arrayList.isEmpty()) {
                C13BV c13bv2 = C13BV.INSTANCE;
                C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1");
                return c13bv2;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            int i3 = 0;
            for (Object obj2 : arrayList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    AlbumSelection albumSelection = (AlbumSelection) obj2;
                    if (albumSelection.mediaId != null) {
                        linkedHashMap.put(albumSelection.mediaId, C2286608xc.LJ(i3));
                        Integer num = albumSelection.loadSource;
                        int key = EnumC538220L8y.MEDIA_STORE.getKey();
                        if (num != null && num.intValue() == key) {
                            Integer num2 = albumSelection.mediaType;
                            if (num2 != null && num2.intValue() == 4) {
                                arrayList3.add(albumSelection.mediaId);
                            } else {
                                arrayList2.add(albumSelection.mediaId);
                            }
                        } else {
                            int key2 = EnumC538220L8y.AI.getKey();
                            if (num != null && num.intValue() == key2) {
                                arrayList4.add(albumSelection.mediaId);
                            }
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            ArrayList arrayList5 = new ArrayList();
            C1DEV c1devLIZ = C2191201ApK.LIZ();
            AnonymousClass0957[] anonymousClass0957Arr = {C23250099c.LIZIZ(interfaceC497601wk, null, null, new C527500KmS(arrayList3, this.LLILZIL, c1devLIZ, this.LLILZ, arrayList5, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C527510KmT(arrayList2, this.LLILZIL, c1devLIZ, this.LLILZ, arrayList5, null), 3), C23250099c.LIZIZ(interfaceC497601wk, null, null, new C527490KmR(arrayList4, this.LLILZ, c1devLIZ, arrayList5, null), 3)};
            this.LLILLL = linkedHashMap;
            this.LL = arrayList5;
            this.LLILLJJLI = 1;
            map = linkedHashMap;
            iterable = arrayList5;
            if (C1D9F.LIZIZ(anonymousClass0957Arr, this) == objLJFF) {
                C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1");
                return objLJFF;
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS507S0100000_8(map, 0), iterable);
        C1C7U.LIZIZ("AlbumSelectionRestoreComponent@8c7.onCreate$1$list$1");
        return listLJLLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends TikTokMediaModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
