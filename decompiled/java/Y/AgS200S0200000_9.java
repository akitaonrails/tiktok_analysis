package Y;

import X.AbstractC1683020ttk;
import X.C05P0;
import X.C05TQ;
import X.C05TR;
import X.C05Y0;
import X.C099R;
import X.C0NNS;
import X.C0NV6;
import X.C0NV7;
import X.C0NVY;
import X.C0NW0;
import X.C0NW2;
import X.C0NW8;
import X.C0O3L;
import X.C0O78;
import X.C0O79;
import X.C0O7A;
import X.C0O7B;
import X.C0OIH;
import X.C0OPX;
import X.C0PEM;
import X.C13LP;
import X.C1677050tk7;
import X.C1678590tmb;
import X.C1678760tms;
import X.C1683030ttl;
import X.C1954807lC;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2286608xc;
import X.C23250099c;
import X.C595030NVl;
import X.C595040NVm;
import X.C595170NVz;
import X.C614470O8f;
import X.C614480O8g;
import X.C632050Oqh;
import X.C632090Oql;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC332260D0u;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import X.InterfaceC614550O8n;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.mix.model.MixStruct;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.search.SearchPinnedMusicList;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AgS200S0200000_9 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, t, interfaceC1364105Vn);
            case 1:
                return emit$1(this, t, interfaceC1364105Vn);
            case 2:
                return emit$2(this, t, interfaceC1364105Vn);
            case 3:
                return emit$3(this, t, interfaceC1364105Vn);
            case 4:
                return emit$4(this, t, interfaceC1364105Vn);
            case 5:
                return emit$5(this, t, interfaceC1364105Vn);
            case 6:
                return emit$6(this, t, interfaceC1364105Vn);
            case 7:
                return emit$7(this, t, interfaceC1364105Vn);
            case 8:
                return emit$8(this, t, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, t, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, t, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, t, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, t, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, t, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS200S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final Object emit$0(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((InterfaceC332260D0u) agS200S0200000_9.l0).setValue(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BBArch [DC] derived updated: ");
        sbLIZ.append(((C0OIH) agS200S0200000_9.l1).LIZ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS200S0200000_9 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C0OIF
            if (r0 == 0) goto L49
            r4 = r7
            X.0OIF r4 = (X.C0OIF) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4f
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            if (r6 == 0) goto L22
            java.lang.Object r0 = r5.l1
            X.0OIE r0 = (X.C0OIE) r0
            kotlin.jvm.functions.Function1<T, java.lang.Boolean> r0 = r0.LIZIZ
            java.lang.Object r0 = r0.invoke(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r6, r4)
            if (r0 != r3) goto L22
            return r3
        L49:
            X.0OIF r4 = new X.0OIF
            r4.<init>(r5, r7)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS200S0200000_9.emit$1(Y.AgS200S0200000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$10(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0NNS c0nns = (C0NNS) obj;
        if (c0nns instanceof C0NW8) {
            ((List) agS200S0200000_9.l0).add(c0nns);
        } else if (c0nns instanceof C0NV7) {
            ((List) agS200S0200000_9.l0).remove(((C0NV7) c0nns).LIZ);
        } else if (c0nns instanceof C0NV6) {
            ((List) agS200S0200000_9.l0).remove(((C0NV6) c0nns).LIZ);
        }
        ((C05P0) agS200S0200000_9.l1).setValue(Boolean.valueOf(!((List) agS200S0200000_9.l0).isEmpty()));
        return Unit.LIZ;
    }

    public static final Object emit$11(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0NNS c0nns = (C0NNS) obj;
        if (c0nns instanceof C1678760tms) {
            ((List) agS200S0200000_9.l0).add(c0nns);
        } else if (c0nns instanceof C0NVY) {
            ((List) agS200S0200000_9.l0).remove(((C0NVY) c0nns).LIZ);
        }
        ((C05P0) agS200S0200000_9.l1).setValue(Boolean.valueOf(!((List) agS200S0200000_9.l0).isEmpty()));
        return Unit.LIZ;
    }

    public static final Object emit$12(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0NNS c0nns = (C0NNS) obj;
        if (c0nns instanceof C0NW2) {
            ((List) agS200S0200000_9.l0).add(c0nns);
        } else if (c0nns instanceof C595040NVm) {
            ((List) agS200S0200000_9.l0).remove(((C595040NVm) c0nns).LIZ);
        } else if (c0nns instanceof C595030NVl) {
            ((List) agS200S0200000_9.l0).remove(((C595030NVl) c0nns).LIZ);
        }
        ((C05P0) agS200S0200000_9.l1).setValue(Boolean.valueOf(!((List) agS200S0200000_9.l0).isEmpty()));
        return Unit.LIZ;
    }

    public static final Object emit$13(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            C1DFH c1dfh = C0PEM.LIZ;
            Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C614470O8f(c0o7a, (InterfaceC614550O8n) agS200S0200000_9.l0, (NewFaceStickerBean) agS200S0200000_9.l1, null));
            if (objLJI != C099R.LJFF()) {
                return Unit.LIZ;
            }
            return objLJI;
        }
        if (c0o7a instanceof C0O78) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            Object objLJI2 = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C614480O8g(c0o7a, (InterfaceC614550O8n) agS200S0200000_9.l0, (NewFaceStickerBean) agS200S0200000_9.l1, null));
            if (objLJI2 == C099R.LJFF()) {
                return objLJI2;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS200S0200000_9 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C0OIA
            if (r0 == 0) goto L40
            r6 = r9
            X.0OIA r6 = (X.C0OIA) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L46
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            kotlin.jvm.internal.AwS375S0200000_9 r2 = new kotlin.jvm.internal.AwS375S0200000_9
            java.lang.Object r1 = r7.l1
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 47
            r2.<init>(r8, r1, r0)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L40:
            X.0OIA r6 = new X.0OIA
            r6.<init>(r7, r9)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS200S0200000_9.emit$2(Y.AgS200S0200000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS200S0200000_9 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C0OIC
            if (r0 == 0) goto L40
            r6 = r9
            X.0OIC r6 = (X.C0OIC) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L46
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            kotlin.jvm.internal.AwS375S0200000_9 r2 = new kotlin.jvm.internal.AwS375S0200000_9
            java.lang.Object r1 = r7.l1
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 48
            r2.<init>(r8, r1, r0)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r2, r6)
            if (r0 != r5) goto L22
            return r5
        L40:
            X.0OIC r6 = new X.0OIC
            r6.<init>(r7, r9)
            goto L12
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS200S0200000_9.emit$3(Y.AgS200S0200000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$4(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        SearchPinnedMusicList searchPinnedMusicListXQ2;
        SearchPinnedMusicList searchPinnedMusicListXQ22;
        List<MusicGroup> musicGroups;
        if (obj instanceof C0O79) {
            SearchMusicListViewModel searchMusicListViewModel = (SearchMusicListViewModel) agS200S0200000_9.l0;
            searchMusicListViewModel.LLIZ = false;
            C632090Oql c632090Oql = (C632090Oql) agS200S0200000_9.l1;
            SearchPinnedMusicList searchPinnedMusicListXQ23 = searchMusicListViewModel.xQ2();
            if ((searchPinnedMusicListXQ23 == null || searchPinnedMusicListXQ23.getMusicGroups() == null) && (searchPinnedMusicListXQ2 = searchMusicListViewModel.xQ2()) != null) {
                searchPinnedMusicListXQ2.setMusicGroups(new ArrayList());
            }
            MusicGroup musicGroupLIZIZ = C632050Oqh.LIZIZ(searchMusicListViewModel.wQ2(c632090Oql.getMusicModel()).getIdStr(), searchMusicListViewModel.LLILLL);
            if (musicGroupLIZIZ != null && (searchPinnedMusicListXQ22 = searchMusicListViewModel.xQ2()) != null && (musicGroups = searchPinnedMusicListXQ22.getMusicGroups()) != null) {
                ListProtector.add(musicGroups, 0, musicGroupLIZIZ);
            }
            searchMusicListViewModel.listSetItems(searchMusicListViewModel.vQ2());
            searchMusicListViewModel.setState(AFwS240S0000000_9.get$arr$(507));
        } else if (obj instanceof C0O7B) {
            ((SearchMusicListViewModel) agS200S0200000_9.l0).setState(AFwS240S0000000_9.get$arr$(506));
            ((SearchMusicListViewModel) agS200S0200000_9.l0).LLIZ = false;
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        SearchPinnedMusicList searchPinnedMusicListXQ2;
        List<MusicGroup> musicGroups;
        if (obj instanceof C0O79) {
            ((SearchMusicListViewModel) agS200S0200000_9.l0).setState(AFwS240S0000000_9.get$arr$(508));
            SearchMusicListViewModel searchMusicListViewModel = (SearchMusicListViewModel) agS200S0200000_9.l0;
            searchMusicListViewModel.LLIZ = false;
            MusicGroup musicGroupLIZIZ = C632050Oqh.LIZIZ(searchMusicListViewModel.wQ2(((C632090Oql) agS200S0200000_9.l1).getMusicModel()).getIdStr(), searchMusicListViewModel.LLILLL);
            if (musicGroupLIZIZ != null && (searchPinnedMusicListXQ2 = searchMusicListViewModel.xQ2()) != null && (musicGroups = searchPinnedMusicListXQ2.getMusicGroups()) != null) {
                musicGroups.remove(musicGroupLIZIZ);
            }
            searchMusicListViewModel.listSetItems(searchMusicListViewModel.vQ2());
        } else if (obj instanceof C0O7B) {
            ((SearchMusicListViewModel) agS200S0200000_9.l0).setState(AFwS240S0000000_9.get$arr$(509));
            ((SearchMusicListViewModel) agS200S0200000_9.l0).LLIZ = false;
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (obj instanceof C0O79) {
            ((OriginMusicListViewModel) agS200S0200000_9.l0).LLJILJIL = false;
            OriginMusicListViewModel originMusicListViewModel = (OriginMusicListViewModel) agS200S0200000_9.l0;
            ((OriginMusicListViewModel) agS200S0200000_9.l0).listSetItems(OriginMusicListViewModel.vQ2(originMusicListViewModel, null, null, originMusicListViewModel.yQ2(((C632090Oql) agS200S0200000_9.l1).getMusicModel()), null, null, null, 59));
            ((OriginMusicListViewModel) agS200S0200000_9.l0).setState(AFwS240S0000000_9.get$arr$(561));
        } else if (obj instanceof C0O7B) {
            ((OriginMusicListViewModel) agS200S0200000_9.l0).setState(AFwS240S0000000_9.get$arr$(562));
            ((OriginMusicListViewModel) agS200S0200000_9.l0).LLJILJIL = false;
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (obj instanceof C0O79) {
            ((OriginMusicListViewModel) agS200S0200000_9.l0).listSetItems(OriginMusicListViewModel.vQ2((OriginMusicListViewModel) agS200S0200000_9.l0, null, ((OriginMusicListViewModel) agS200S0200000_9.l0).yQ2(((C632090Oql) agS200S0200000_9.l1).getMusicModel()), null, null, null, null, 61));
            ((OriginMusicListViewModel) agS200S0200000_9.l0).setState(AFwS240S0000000_9.get$arr$(563));
        } else if (obj instanceof C0O7B) {
            ((OriginMusicListViewModel) agS200S0200000_9.l0).setState(AFwS240S0000000_9.get$arr$(564));
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$8(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C1677050tk7<Float> c1677050tk7;
        float f;
        C1677050tk7<Float> c1677050tk72;
        C0NNS c0nns = (C0NNS) obj;
        if (c0nns instanceof C0NW2) {
            ((AbstractC1683020ttk) agS200S0200000_9.l0).LIZIZ((C0NW2) c0nns, (InterfaceC497601wk) agS200S0200000_9.l1);
        } else if (c0nns instanceof C595040NVm) {
            ((AbstractC1683020ttk) agS200S0200000_9.l0).LJI(((C595040NVm) c0nns).LIZ);
        } else if (c0nns instanceof C595030NVl) {
            ((AbstractC1683020ttk) agS200S0200000_9.l0).LJI(((C595030NVl) c0nns).LIZ);
        } else {
            AbstractC1683020ttk abstractC1683020ttk = (AbstractC1683020ttk) agS200S0200000_9.l0;
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) agS200S0200000_9.l1;
            C1683030ttl c1683030ttl = abstractC1683020ttk.LL;
            c1683030ttl.getClass();
            boolean z = c0nns instanceof C595170NVz;
            if (z) {
                ((ArrayList) c1683030ttl.LIZLLL).add(c0nns);
            } else if (c0nns instanceof C0NW0) {
                ((ArrayList) c1683030ttl.LIZLLL).remove(((C0NW0) c0nns).LIZ);
            } else if (c0nns instanceof C1678760tms) {
                ((ArrayList) c1683030ttl.LIZLLL).add(c0nns);
            } else if (c0nns instanceof C0NVY) {
                ((ArrayList) c1683030ttl.LIZLLL).remove(((C0NVY) c0nns).LIZ);
            } else if (c0nns instanceof C0NW8) {
                ((ArrayList) c1683030ttl.LIZLLL).add(c0nns);
            } else if (c0nns instanceof C0NV7) {
                ((ArrayList) c1683030ttl.LIZLLL).remove(((C0NV7) c0nns).LIZ);
            } else if (c0nns instanceof C0NV6) {
                ((ArrayList) c1683030ttl.LIZLLL).remove(((C0NV6) c0nns).LIZ);
            }
            C0NNS c0nns2 = (C0NNS) C13LP.LJJLIIIJL(c1683030ttl.LIZLLL);
            if (!Intrinsics.LJFF(c1683030ttl.LJ, c0nns2)) {
                if (c0nns2 != null) {
                    if (z) {
                        f = c1683030ttl.LIZIZ.getValue().LIZJ;
                    } else if (c0nns instanceof C1678760tms) {
                        f = c1683030ttl.LIZIZ.getValue().LIZIZ;
                    } else if (c0nns instanceof C0NW8) {
                        f = c1683030ttl.LIZIZ.getValue().LIZ;
                    } else {
                        f = 0.0f;
                    }
                    C1677050tk7<Float> c1677050tk73 = C1678590tmb.LIZ;
                    if (c0nns2 instanceof C595170NVz) {
                        c1677050tk72 = C1678590tmb.LIZ;
                    } else if ((c0nns2 instanceof C1678760tms) || (c0nns2 instanceof C0NW8)) {
                        c1677050tk72 = new C1677050tk7<>(45, C05Y0.LIZLLL, 2);
                    } else {
                        c1677050tk72 = C1678590tmb.LIZ;
                    }
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05TR(c1683030ttl, f, c1677050tk72, null), 3);
                } else {
                    C0NNS c0nns3 = c1683030ttl.LJ;
                    C1677050tk7<Float> c1677050tk74 = C1678590tmb.LIZ;
                    if (!(c0nns3 instanceof C595170NVz) && !(c0nns3 instanceof C1678760tms) && (c0nns3 instanceof C0NW8)) {
                        c1677050tk7 = new C1677050tk7<>(150, C05Y0.LIZLLL, 2);
                    } else {
                        c1677050tk7 = C1678590tmb.LIZ;
                    }
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05TQ(c1683030ttl, c1677050tk7, null), 3);
                }
                c1683030ttl.LJ = c0nns2;
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS200S0200000_9 agS200S0200000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C0O7A c0o7a = (C0O7A) obj;
        if (c0o7a instanceof C0O79) {
            MixListResponse mixListResponse = ((C0O3L) ((C0O79) c0o7a).LJ).LIZ;
            InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) agS200S0200000_9.l0;
            if (interfaceC1631620sYq != null) {
                List<MixStruct> mixList = mixListResponse.getMixList();
                if (mixList == null) {
                    mixList = new ArrayList<>();
                }
                interfaceC1631620sYq.invoke(mixList, Boolean.valueOf(mixListResponse.getHasMore()), C2286608xc.LJFF(mixListResponse.getCursor()));
            }
        } else if (c0o7a instanceof C0O78) {
            Function1 function1 = (Function1) agS200S0200000_9.l1;
            if (function1 != null) {
                function1.invoke(((C0O78) c0o7a).LJFF);
            }
        } else {
            Function1 function12 = (Function1) agS200S0200000_9.l1;
            if (function12 != null) {
                function12.invoke(new Exception("Unknown Error"));
            }
        }
        return Unit.LIZ;
    }
}
