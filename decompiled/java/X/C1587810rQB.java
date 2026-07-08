package X;

import Y.ACallableS182S0300000_24;
import android.app.Activity;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;
import com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rQB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587810rQB extends AbstractC1255880imo<FriendsFeed, FriendsFeedResponse> implements Cloneable, C0PDP {
    public boolean LL;
    public FriendsFeedResponse LLILZ;
    public C1587590rPp LLILZIL;
    public volatile boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;
    public InterfaceC1587840rQE LLJJIII;
    public final List<FriendsFeed> LLILLJJLI = new CopyOnWriteArrayList();
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(540));
    public final C1587670rPx LLJJ = new C1587670rPx();
    public final Set<String> LLJJI = new LinkedHashSet();
    public List<Aweme> LLJJIJI = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> LJIIJJI() {
        List<FriendsFeed> listLLIIII;
        Aweme aweme;
        List<FriendsFeed> list;
        if (this.mData == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) this.mData;
        if (friendsFeedResponse == null || (list = friendsFeedResponse.friendFeedData) == null || (listLLIIII = C13LP.LLIIII(list)) == null) {
            listLLIIII = C13BV.INSTANCE;
        }
        for (FriendsFeed friendsFeed : listLLIIII) {
            if (friendsFeed != null && (aweme = friendsFeed.getAweme()) != null) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final List<FriendsFeed> getItems() {
        FriendsFeedResponse friendsFeedResponse;
        T t = this.mData;
        if (t == 0 || (friendsFeedResponse = (FriendsFeedResponse) t) == null) {
            return null;
        }
        return friendsFeedResponse.friendFeedData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((FriendsFeedResponse) t).hasMore;
    }

    public final void LJIIJ() {
        C19EG c19egLIZIZ;
        C1576740r8K c1576740r8KLIZ;
        InterfaceC1587840rQE interfaceC1587840rQE;
        if (!C1587360rPS.LIZJ() && (interfaceC1587840rQE = this.LLJJIII) != null) {
            interfaceC1587840rQE.LIZ();
        }
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) != null) {
            if (!C614770O9j.LIZIZ.LJ().LJJIIJ(0, c19egLIZIZ) && (c1576740r8KLIZ = C690440R6k.LIZ()) != null) {
                c1576740r8KLIZ.LJ(false);
            }
            IExposedCommentDataAbility iExposedCommentDataAbility = (IExposedCommentDataAbility) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), IExposedCommentDataAbility.class, null);
            if (iExposedCommentDataAbility != null) {
                iExposedCommentDataAbility.tZ0();
            }
        }
        C1587490rPf.LIZ = "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object clone() {
        try {
            AbstractC666100QAu abstractC666100QAu = (AbstractC666100QAu) super.clone();
            FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) this.mData;
            abstractC666100QAu.mData = friendsFeedResponse != null ? friendsFeedResponse.clone() : 0;
            return abstractC666100QAu;
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            return super.clone();
        }
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return C1587680rPy.LIZIZ(getItems());
    }

    @Override // X.AbstractC666100QAu
    public final boolean isLoading() {
        return this.LLIZ;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        C798060VSi c798060VSi;
        FriendsFeedResponse friendsFeedResponse;
        this.mIsLoading = false;
        this.LLIZ = false;
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            HandlerHook.getMessageObj(message.obj);
            List<InterfaceC1526205yG> list = this.mNotifyListeners;
            if (list != null) {
                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onFailed((Exception) HandlerHook.getMessageObj(message.obj));
                }
                return;
            }
            return;
        }
        Message messageObtain = Message.obtain(message);
        Object messageObj = HandlerHook.getMessageObj(messageObtain.obj);
        if (messageObj instanceof C798060VSi) {
            c798060VSi = (C798060VSi) messageObj;
            if (c798060VSi == null || (friendsFeedResponse = c798060VSi.LIZ) == null) {
            }
            C15O7.LIZIZ(new ACallableS182S0300000_24(this, friendsFeedResponse, c798060VSi, 2), C823050WQl.LIZLLL(), null).LJ(new C346480DiA(this, 9), C15O7.LJIIIIZZ, null);
        }
        c798060VSi = null;
        Object messageObj2 = HandlerHook.getMessageObj(messageObtain.obj);
        if (messageObj2 instanceof FriendsFeedResponse) {
            friendsFeedResponse = (FriendsFeedResponse) messageObj2;
        } else {
            friendsFeedResponse = null;
        }
        C15O7.LIZIZ(new ACallableS182S0300000_24(this, friendsFeedResponse, c798060VSi, 2), C823050WQl.LIZLLL(), null).LJ(new C346480DiA(this, 9), C15O7.LJIIIIZZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void loadMoreList(java.lang.Object... r14) {
        /*
            r13 = this;
            X.01GW r0 = X.C278450Avj.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            boolean r0 = X.C1906580ziK.LJI()
            if (r0 == 0) goto L1f
            X.0rPu r1 = new X.0rPu
            java.lang.String r0 = "load_more"
            r1.<init>(r0)
            r1.LIZ()
            return
        L1f:
            int r0 = r14.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r14, r0)
            int r1 = r3.length
            r0 = 2
            r2 = 1
            if (r1 < r0) goto L9c
            r1 = r3[r2]
            boolean r0 = r1 instanceof X.C1587820rQC
            if (r0 == 0) goto L9c
            X.0rQC r1 = (X.C1587820rQC) r1
            if (r1 == 0) goto L9c
            r7 = r13
            r7.LLIZ = r2
            T r0 = r7.mData
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r0 = (com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse) r0
            int r12 = r0.source
        L3e:
            T r0 = r7.mData
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r0 = (com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse) r0
            java.lang.String r0 = r0.pageToken
            if (r0 != 0) goto L4a
        L48:
            java.lang.String r0 = ""
        L4a:
            X.0rPx r4 = r7.LLJJ
            int r9 = r1.LIZ
            com.bytedance.common.utility.collection.WeakHandler r5 = r7.mHandler
            boolean r11 = r1.LJI
            r4.getClass()
            X.00zU r10 = new X.00zU
            r10.<init>()
            r10.element = r0
            X.00cf r8 = new X.00cf
            r8.<init>()
            r8.element = r12
            X.0rPo r6 = new X.0rPo
            r6.<init>()
            X.11Kf r1 = X.C11NZ.LJIJJLI(r6)
            X.11RO r0 = X.C11S5.LIZ()
            X.11Hw r1 = r1.LJL(r0)
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            X.11O8 r1 = r1.LJJJLZIJ(r0)
            X.0sA3 r0 = new X.0sA3
            r0.<init>()
            X.11QK r3 = r1.LJJLIIIJLJLI(r0)
            Y.AfS172S0100000_3 r2 = new Y.AfS172S0100000_3
            r0 = 51
            r2.<init>(r5, r0)
            Y.AfS182S0100000_13 r1 = new Y.AfS182S0100000_13
            r0 = 106(0x6a, float:1.49E-43)
            r1.<init>(r5, r0)
            X.01kM r1 = r3.LJJLL(r2, r1)
            X.11NJ r0 = r4.LIZ
            r0.LIZ(r1)
        L9c:
            return
        L9d:
            X.0rOh r0 = X.EnumC1586890rOh.SORT
            int r12 = r0.getDataLevel()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587810rQB.loadMoreList(java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    @Override // X.AbstractC1255880imo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshList(java.lang.Object... r15) {
        /*
            r14 = this;
            X.01GW r0 = X.C278450Avj.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            boolean r0 = X.C1906580ziK.LJI()
            if (r0 == 0) goto L1f
            X.0rPu r1 = new X.0rPu
            java.lang.String r0 = "refresh"
            r1.<init>(r0)
            r1.LIZ()
            return
        L1f:
            X.0rQ4 r0 = X.C1587740rQ4.LIZ
            r0.getClass()
            boolean r0 = X.C1587740rQ4.LJIJI
            if (r0 != 0) goto L2e
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C1587740rQ4.LIZLLL = r0
        L2e:
            int r0 = r15.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r15, r0)
            int r2 = r3.length
            r0 = 2
            r1 = 1
            if (r2 < r0) goto L6e
            r3 = r3[r1]
            boolean r0 = r3 instanceof X.C1587820rQC
            if (r0 == 0) goto L6e
            X.0rQC r3 = (X.C1587820rQC) r3
        L40:
            r0 = 0
            r9 = r14
            r9.LLJIJIL = r0
            r9.LLJ = r0
            r9.LLJI = r0
            r9.LLIZLLLIL = r0
            r9.LLJILJIL = r0
            r9.LLJILJILJ = r0
            if (r3 == 0) goto L6d
            r9.LLIZ = r1
            X.0VjA r0 = X.C805740VjA.LIZIZ
            r0.clear()
            boolean r0 = X.C1587360rPS.LIZJ()
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.relation.api.PlaceUserInfo r2 = X.C1587360rPS.LJI
            kotlin.jvm.internal.AwS425S0200000_24 r1 = new kotlin.jvm.internal.AwS425S0200000_24
            r0 = 70
            r1.<init>(r9, r3, r0)
            X.0rQE r0 = r9.LLJJIII
            if (r0 == 0) goto L6d
            r0.LIZJ(r2, r1)
        L6d:
            return
        L6e:
            r3 = 0
            goto L40
        L70:
            X.0rPx r4 = r9.LLJJ
            X.0rOh r0 = X.EnumC1586890rOh.SORT
            int r5 = r0.getDataLevel()
            int r6 = r3.LIZ
            java.lang.String r7 = r3.LIZIZ
            if (r7 != 0) goto L80
            java.lang.String r7 = ""
        L80:
            com.bytedance.common.utility.collection.WeakHandler r8 = r9.mHandler
            java.lang.String r10 = r3.LIZLLL
            boolean r11 = r3.LJ
            boolean r12 = r3.LJFF
            boolean r13 = r3.LJI
            r4.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587810rQB.refreshList(java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse] */
    @Override // X.AbstractC1255880imo
    public final void setItems(List<FriendsFeed> list) {
        ArrayList arrayList;
        List listLLIIII;
        if (this.mData == 0) {
            this.mData = new FriendsFeedResponse(0, false, null, "", "", null, 0, null, null, "");
        }
        FriendsFeedResponse friendsFeedResponse = (FriendsFeedResponse) this.mData;
        if (friendsFeedResponse != null) {
            if (list != null && (listLLIIII = C13LP.LLIIII(list)) != null) {
                arrayList = new ArrayList(listLLIIII);
            } else {
                arrayList = null;
            }
            friendsFeedResponse.friendFeedData = arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0871 A[LOOP:12: B:494:0x086f->B:495:0x0871, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x069b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143 A[LOOP:1: B:91:0x0143->B:96:0x0166, LOOP_START, PHI: r10
      0x0143: PHI (r10v8 int) = (r10v0 int), (r10v9 int) binds: [B:90:0x0141, B:96:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016b  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct] */
    /* JADX WARN: Type inference failed for: r27v0, types: [T, X.0X12, com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.ss.android.ugc.aweme.live.ILiveOuterService] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List<com.ss.android.ugc.aweme.friendstab.api.InsertResultCode>] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r4v33, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v17, types: [T, java.util.List] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(final com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 2550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1587810rQB.LJIIL(com.ss.android.ugc.aweme.friendstab.api.FriendsFeedResponse, boolean):void");
    }
}
