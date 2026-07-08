package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.CustomBizData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightData;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import com.ss.android.ugc.aweme.story.widget.IStoryWidgetService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598340rhA implements InterfaceC1598020rge, LifecycleOwner {
    public final SkylightListViewModel LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(652));
    public final Map<EnumC1598330rh9, AbstractC1598350rhB<?>> LLILLL;
    public final ConcurrentHashMap<String, Integer> LLILZ;
    public final C1598410rhH LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;

    @Override // X.InterfaceC1598020rge
    public final Map<EnumC1598330rh9, AbstractC1598350rhB<?>> LIZIZ() {
        return LJIIIIZZ(false);
    }

    @Override // X.InterfaceC1598020rge
    public final InboxHorizontalTopListCombinePod LJ() {
        if (!this.LLILZLL) {
            return this.LL.FQ2();
        }
        InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LL.LLJJ;
        return inboxHorizontalTopListCombinePod == null ? new InboxHorizontalTopListCombinePod(null, null, null, 0L, false, null, null, null, null, null, false, null, 0L, false, 0, 0, null, true, null, null, 917503, null) : inboxHorizontalTopListCombinePod;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c4, code lost:
    
        if (r0.longValue() > 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0172, code lost:
    
        r3 = new java.util.ArrayList();
        r2 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017f, code lost:
    
        if (r2.hasNext() == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0181, code lost:
    
        r1 = r2.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x018c, code lost:
    
        if (LJIIJ((X.InterfaceC1891350zJl) r1) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018e, code lost:
    
        r3.add(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC1891350zJl> LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598340rhA.LJIIIZ():java.util.List");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.getLifecycle();
    }

    @Override // X.InterfaceC1598020rge
    public final ConcurrentHashMap<String, Integer> LIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1598020rge
    public final /* bridge */ /* synthetic */ SkylightListViewModel vm() {
        return this.LL;
    }

    public C1598340rhA(SkylightListViewModel skylightListViewModel) {
        AbstractC1598350rhB c1598000rgc;
        this.LL = skylightListViewModel;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LLILLL = linkedHashMap;
        this.LLILZ = new ConcurrentHashMap<>();
        this.LLILZIL = new C1598410rhH();
        this.LLIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(653));
        linkedHashMap.put(EnumC1598330rh9.GENERAL, new AbstractC1598350rhB<InterfaceC1891350zJl>(this) { // from class: X.0rhj
            public List<SkylightData> LIZLLL = new ArrayList();
            public final List<InboxLiveNotice> LJ = new ArrayList();
            public final C01GW LJFF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(670));

            @Override // X.AbstractC1598350rhB
            public final Unit LIZIZ() {
                if (!C1209404oG.LIZ()) {
                    if (C296730Bk7.LIZ() != 0) {
                        C1440005kM.LIZ(new C1599120riQ(this.LJ, true));
                    } else {
                        C296840BkI.LIZ.getClass();
                        if (C296840BkI.LIZ()) {
                            C1440005kM.LIZ(new C1599120riQ(C13BV.INSTANCE, false));
                        }
                    }
                }
                return Unit.LIZ;
            }

            @Override // X.AbstractC1598350rhB
            public final Object LIZLLL(InterfaceC1364105Vn interfaceC1364105Vn) {
                boolean z;
                boolean zShouldShowCreationEntrance;
                User user;
                String uid;
                if (this.LIZ.LJ().pageToken() != null) {
                    z = true;
                } else {
                    z = false;
                }
                List<SkylightData> list = this.LIZLLL;
                ArrayList arrayList = new ArrayList();
                for (SkylightData skylightData : list) {
                    SkylightData skylightData2 = skylightData;
                    if (skylightData2.bizType != 1 || ((Boolean) C277580AuK.LIZ.getValue()).booleanValue()) {
                        CustomBizData customBizData = skylightData2.customBizData;
                        if (customBizData != null && (user = customBizData.user) != null && (uid = user.getUid()) != null && uid.length() != 0 && uid != null) {
                            zShouldShowCreationEntrance = this.LIZ.LIZJ(skylightData2.priority, uid);
                            if (z) {
                                if (zShouldShowCreationEntrance) {
                                    if (skylightData2.priority <= this.LIZ.LIZLLL(5)) {
                                        zShouldShowCreationEntrance = true;
                                        this.LIZ.LIZ().put(uid, C2286608xc.LJ(skylightData2.priority));
                                    } else {
                                        zShouldShowCreationEntrance = false;
                                    }
                                }
                            } else if (zShouldShowCreationEntrance) {
                                this.LIZ.LIZ().put(uid, C2286608xc.LJ(skylightData2.priority));
                            }
                        } else {
                            zShouldShowCreationEntrance = false;
                        }
                        int i = skylightData2.bizType;
                        if (i != 4) {
                            if (i == 7) {
                                zShouldShowCreationEntrance = C1618440sDa.LIZIZ.LJJLIIIJLLLLLLLZ().shouldShowCreationEntrance(skylightData2);
                            }
                            if (zShouldShowCreationEntrance) {
                            }
                        }
                        arrayList.add(skylightData);
                    }
                }
                List<SkylightData> listLIZIZ = C19719512Dh.LIZIZ(arrayList);
                this.LIZLLL = listLIZIZ;
                C1598990riD.LIZ(listLIZIZ);
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:116:0x01ff  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x0278  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC1598350rhB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LJ(X.EnumC1155010gA7 r24) {
                /*
                    Method dump skipped, instruction units count: 929
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1598690rhj.LJ(X.0gA7):java.lang.Object");
            }

            @Override // X.AbstractC1598350rhB
            public final Object LIZJ(EnumC1155010gA7 enumC1155010gA7, InterfaceC1364105Vn<? super AbstractC1598350rhB<InterfaceC1891350zJl>> interfaceC1364105Vn) {
                List<SkylightData> dataList;
                this.LIZLLL.clear();
                this.LIZIZ.clear();
                ((ArrayList) this.LJ).clear();
                this.LIZJ.clear();
                SkylightDataResponse skylightData = this.LIZ.LJ().getSkylightData();
                if (skylightData != null && (dataList = skylightData.getDataList()) != null) {
                    Boolean.valueOf(this.LIZLLL.addAll(dataList));
                }
                C1598990riD.LIZ(this.LIZLLL);
                return this;
            }
        });
        linkedHashMap.put(EnumC1598330rh9.ACTIVE_STATUS, new C1598850rhz(this));
        if (!C295190Bhd.LIZ()) {
            linkedHashMap.put(EnumC1598330rh9.STORY_WIDGET, new AbstractC1598350rhB<InterfaceC1891350zJl>(this) { // from class: X.0rgj
                public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(671));

                @Override // X.AbstractC1598350rhB
                public final Object LIZLLL(InterfaceC1364105Vn interfaceC1364105Vn) {
                    return this;
                }

                @Override // X.AbstractC1598350rhB
                public final Object LJ(EnumC1155010gA7 enumC1155010gA7) {
                    return this;
                }

                @Override // X.AbstractC1598350rhB
                public final Unit LIZIZ() {
                    return Unit.LIZ;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // X.AbstractC1598350rhB
                public final Object LIZJ(EnumC1155010gA7 enumC1155010gA7, InterfaceC1364105Vn<? super AbstractC1598350rhB<InterfaceC1891350zJl>> interfaceC1364105Vn) {
                    int i;
                    this.LIZIZ.clear();
                    Pair<InterfaceC1891350zJl, Boolean> pairLIZLLL = ((IStoryWidgetService) this.LIZLLL.getValue()).LIZLLL();
                    if (pairLIZLLL.getFirst() != null) {
                        InterfaceC1597720rgA interfaceC1597720rgA = (InterfaceC1597720rgA) pairLIZLLL.getFirst();
                        if (pairLIZLLL.getSecond().booleanValue()) {
                            i = 10000;
                        } else {
                            i = LSPassThroughRecordSizeConfig.DEFAULT;
                        }
                        this.LIZIZ.add(interfaceC1597720rgA.LLILL(i));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("process data size ");
                    sbLIZ.append(this.LIZIZ.size());
                    sbLIZ.append(", priority low ");
                    sbLIZ.append(pairLIZLLL.getFirst());
                    C2188811AlT.LIZIZ(sbLIZ);
                    return this;
                }
            });
        }
        if (C1209404oG.LIZ()) {
            c1598000rgc = new C1597990rgb(this);
        } else if (C295190Bhd.LIZIZ()) {
            return;
        } else {
            c1598000rgc = new C1598000rgc(this);
        }
        linkedHashMap.put(EnumC1598330rh9.STORY, c1598000rgc);
    }

    @Override // X.InterfaceC1598020rge
    public final int LIZLLL(int i) {
        return this.LLILZIL.LIZ(i);
    }

    @Override // X.InterfaceC1598020rge
    public final void LJI(boolean z) {
        C1598410rhH c1598410rhH = this.LLILZIL;
        if (z) {
            c1598410rhH.LIZ.put(5, 5000);
        } else {
            c1598410rhH.LIZ.put(5, 7000);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    @Override // X.InterfaceC1598020rge
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1891350zJl>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1598380rhE
            if (r0 == 0) goto L62
            r6 = r9
            X.0rhE r6 = (X.C1598380rhE) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r3 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 1
            if (r0 == 0) goto L49
            if (r0 != r5) goto L6d
            long r1 = r6.LL
            java.lang.Object r4 = r6.LLILLJJLI
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.C155000ia.LIZIZ(r3)
        L28:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getValue()
            X.0rhB r3 = (X.AbstractC1598350rhB) r3
            X.0gA7 r0 = X.EnumC1155010gA7.REFRESH_ALL
            r6.LLILLJJLI = r4
            r6.LL = r1
            r6.LLILZIL = r5
            java.lang.Object r0 = r3.LJFF(r0, r6)
            if (r0 != r7) goto L28
            return r7
        L49:
            X.C155000ia.LIZIZ(r3)
            r8.LLILZLL = r5
            long r1 = java.lang.System.currentTimeMillis()
            r0 = 0
            java.util.Map r0 = r8.LJIIIIZZ(r0)
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
            goto L28
        L62:
            X.0rhE r6 = new X.0rhE
            r6.<init>(r8, r9)
            goto L12
        L68:
            java.util.List r0 = r8.LJIIIZ()
            return r0
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598340rhA.LJII(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<X.EnumC1598330rh9, X.AbstractC1598350rhB<?>> LJIIIIZZ(boolean r8) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598340rhA.LJIIIIZZ(boolean):java.util.Map");
    }

    public final boolean LJIIJ(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        int i;
        ISkylightMafService iSkylightMafService;
        if ((interfaceC1891350zJl instanceof AbstractC1598130rgp) && (iSkylightMafService = (ISkylightMafService) this.LLIZ.getValue()) != null && iSkylightMafService.LIZLLL(((AbstractC1598130rgp) interfaceC1891350zJl).getUser())) {
            z = true;
        } else {
            z = false;
        }
        if ((interfaceC1891350zJl instanceof C1598140rgq) && ((i = ((C1598140rgq) interfaceC1891350zJl).LLILLJJLI.bizType) == 1 || i == 6)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = interfaceC1891350zJl instanceof C1598860ri0;
        if (!z && !z2 && !z3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1891350zJl>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C1598370rhD
            if (r0 == 0) goto La3
            r4 = r11
            X.0rhD r4 = (X.C1598370rhD) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La3
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r2 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r5 = 1
            if (r0 == 0) goto L27
            if (r0 != r5) goto Laa
            X.0rhB r1 = r4.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            java.util.List<T extends X.0zJl> r0 = r1.LIZIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r2)
            r6 = 0
            r10.LLILZLL = r6
            X.0rhH r1 = r10.LLILZIL
            r0 = 6
            int r9 = r1.LIZ(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r0 = r10.LLILZ
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L43:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r2 = r7.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r9) goto L43
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r0 = r2.getValue()
            r8.put(r1, r0)
            goto L43
        L67:
            java.util.Set r0 = r8.keySet()
            java.util.List r0 = X.C13LP.LLIIII(r0)
            java.util.Iterator r2 = r0.iterator()
        L73:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r1 = r2.next()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r0 = r10.LLILZ
            r0.remove(r1)
            goto L73
        L83:
            X.0gA7 r2 = X.EnumC1155010gA7.REFRESH_ACTIVITY_STATUS
            java.util.Map r1 = r10.LJIIIIZZ(r6)
            X.0rh9 r0 = X.EnumC1598330rh9.ACTIVE_STATUS
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            X.0rhB r1 = (X.AbstractC1598350rhB) r1
            if (r1 != 0) goto L98
            X.13BV r0 = X.C13BV.INSTANCE
            return r0
        L98:
            r4.LL = r1
            r4.LLILZ = r5
            java.lang.Object r0 = r1.LJFF(r2, r4)
            if (r0 != r3) goto L24
            return r3
        La3:
            X.0rhD r4 = new X.0rhD
            r4.<init>(r10, r11)
            goto L12
        Laa:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598340rhA.LJIIJJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1891350zJl>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1598400rhG
            if (r0 == 0) goto L5f
            r5 = r7
            X.0rhG r5 = (X.C1598400rhG) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5f
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 != r3) goto L6d
            java.lang.Object r2 = r5.LL
            java.util.Iterator r2 = (java.util.Iterator) r2
            X.C155000ia.LIZIZ(r1)
        L26:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            X.0rhB r1 = (X.AbstractC1598350rhB) r1
            X.0gA7 r0 = X.EnumC1155010gA7.REFRESH_ALL
            r5.LL = r2
            r5.LLILZ = r3
            java.lang.Object r0 = r1.LJFF(r0, r5)
            if (r0 != r4) goto L26
            return r4
        L45:
            X.C155000ia.LIZIZ(r1)
            r1 = 0
            r6.LLILZLL = r1
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r0 = r6.LLILZ
            r0.clear()
            java.util.Map r0 = r6.LJIIIIZZ(r1)
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
            goto L26
        L5f:
            X.0rhG r5 = new X.0rhG
            r5.<init>(r6, r7)
            goto L12
        L65:
            java.lang.System.currentTimeMillis()
            java.util.List r0 = r6.LJIIIZ()
            return r0
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598340rhA.LJIILIIL(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1598020rge
    public final boolean LIZJ(int i, String str) {
        Integer num;
        if (this.LLILZ.containsKey(str) && str != "ignore" && (num = this.LLILZ.get(str)) != null && i >= num.intValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.0gA7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.0gA7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(java.util.List<? extends X.EnumC1598330rh9> r12, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1891350zJl>> r13) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1598340rhA.LJIIL(java.util.List, X.05Vn):java.lang.Object");
    }
}
