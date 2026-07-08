package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS76S0200000_7;
import Y.AUListenerS270S0100000_21;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1364640lcE implements InterfaceC1365090lcx {
    public static final C01GW<Integer> LJIILL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1321));
    public static final C01GW<Integer> LJIILLIIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1323));
    public static final C01GW<Integer> LJIIZILJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1322));
    public final C1363060lZg LIZ;
    public final SharePackage LIZIZ;
    public final InterfaceC1364650lcF LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public final int LJFF;
    public boolean LJI;
    public final AUListenerS270S0100000_21 LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public String LJIILJJIL;

    @Override // X.InterfaceC1365090lcx
    public final void LIZIZ() {
        this.LJIIJJI = false;
    }

    public void LJII() {
        LJI(false);
    }

    @Override // X.InterfaceC1365090lcx
    public void LIZLLL() {
        boolean z = this.LIZLLL;
        if (z && this.LJIIJ != z) {
            this.LJIIJ = z;
            this.LIZ.LIZIZ.setChecked(z);
            this.LIZJ.N9(this.LJIIJ);
        }
        ACListenerS155S0100000_21 aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(this, 225);
        C197039127h c197039127h = this.LIZ.LIZLLL;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS155S0100000_21(aCListenerS155S0100000_21, 224));
        }
    }

    public final C1364660lcG LJFF() {
        return (C1364660lcG) this.LJIIL.getValue();
    }

    public void LJIIIIZZ() {
        if (((AnimatorSet) this.LJIIIZ.getValue()).isRunning()) {
            ((AnimatorSet) this.LJIIIZ.getValue()).cancel();
        }
        LJI(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ() {
        /*
            r4 = this;
            X.06uk r0 = X.C1759206uk.LIZ
            boolean r0 = X.C1759206uk.LIZ()
            r3 = 0
            if (r0 == 0) goto L60
            X.0lcG r0 = r4.LJFF()
            java.util.Set r1 = r0.LIZIZ()
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 1
            if (r0 == 0) goto L4e
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4e
        L1f:
            X.0lcG r0 = r4.LJFF()
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto L60
            X.0lcG r1 = r4.LJFF()
            X.01GW r0 = r1.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L60
            java.util.Set r0 = r1.LIZIZ()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L60
            r4.LJIIIIZZ()
            X.0lcF r0 = r4.LIZJ
            r0.bd(r2)
            return
        L4e:
            java.util.Iterator r1 = r1.iterator()
        L52:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser
            if (r0 == 0) goto L52
        L60:
            r4.LJII()
            X.0lcF r0 = r4.LIZJ
            r0.bd(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364640lcE.LJIIIZ():void");
    }

    @Override // X.InterfaceC1365090lcx
    public boolean eo() {
        return this.LJ;
    }

    @Override // X.InterfaceC1365090lcx
    public boolean isChecked() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC1365090lcx
    public void LIZ(Collection<? extends IMContact> collection) {
        C1364660lcG c1364660lcGLJFF = LJFF();
        ((Set) c1364660lcGLJFF.LIZ.getValue()).clear();
        c1364660lcGLJFF.LIZ().clear();
        c1364660lcGLJFF.LIZIZ().clear();
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            LJFF().LIZJ((IMContact) it2.next(), true);
        }
        LJIIIZ();
    }

    @Override // X.InterfaceC1365090lcx
    public boolean LIZJ(final Function1<? super Serializable, Unit> function1) {
        String string;
        String uid;
        Bundle bundle;
        C1759206uk c1759206uk = C1759206uk.LIZ;
        if (!C1759206uk.LIZ()) {
            C1720006oQ.LJ("CreateGroupChatWidget", "group chat not supported");
            LJII();
            return false;
        }
        if (this.LJIIJJI) {
            C1720006oQ.LJ("CreateGroupChatWidget", "is requesting");
            return false;
        }
        C1364660lcG c1364660lcGLJFF = LJFF();
        if (((Set) c1364660lcGLJFF.LIZ.getValue()).isEmpty() && c1364660lcGLJFF.LIZ().isEmpty() && c1364660lcGLJFF.LIZIZ().isEmpty()) {
            C1720006oQ.LJ("CreateGroupChatWidget", "empty contact list");
            return false;
        }
        if (LJFF().LIZLLL()) {
            C1720006oQ.LJ("CreateGroupChatWidget", "contact list size is less than 2");
            return false;
        }
        C1364660lcG c1364660lcGLJFF2 = LJFF();
        if (((Set) c1364660lcGLJFF2.LIZ.getValue()).isEmpty() && c1364660lcGLJFF2.LIZIZ().isEmpty()) {
            this.LJIIJJI = true;
            SharePackage sharePackage = this.LIZIZ;
            if (sharePackage != null && (bundle = sharePackage.extras) != null) {
                string = bundle.getString("aid");
            } else {
                string = null;
            }
            HashMap mapLJI = C2097608Jq.LJI(new Pair("share_aweme_id", String.valueOf(string)));
            C1231470i9R c1231470i9RLIZIZ = C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "ci", "share_panel");
            List<IMContact> listLLIIII = C13LP.LLIIII(LJFF().LIZ());
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
            for (IMContact iMContact : listLLIIII) {
                if (!(iMContact instanceof IMUser) || iMContact == null || (uid = iMContact.getUid()) == null) {
                    uid = "";
                }
                arrayList.add(uid);
            }
            c1231470i9RLIZIZ.LIZ(new C1229390i65(arrayList, null, EnumC913760Zt0.NORMAL_GROUP_CHAT, null, null, null, null, null, null, 506), new C1229400i66("share", (String) null, mapLJI, 10), new C1231500i9U() { // from class: X.0lcI
                @Override // X.C1231500i9U, X.InterfaceC863580XuG, X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    super.LIZIZ(c0ymw);
                    function1.invoke(null);
                }

                @Override // X.C1231500i9U, X.InterfaceC863580XuG
                public final void LIZJ(C0Y8T c0y8t, C0YMW c0ymw) {
                    super.LIZJ(c0y8t, c0ymw);
                    function1.invoke(c0y8t);
                }
            }, null);
            return true;
        }
        C1720006oQ.LJ("CreateGroupChatWidget", "contact list contains group chat or single-follow user");
        return false;
    }

    public final void LJI(boolean z) {
        IMUser iMUser;
        UrlModel avatarMedium;
        final C197039127h c197039127h = this.LIZ.LIZLLL;
        if (c197039127h == null) {
            return;
        }
        c197039127h.setText((String) this.LJIILIIL.getValue());
        int i = 0;
        if (z) {
            final List<IMContact> listLL = C13LP.LL(LJFF().LIZ(), 2);
            if (this.LJIILJJIL.length() > 0) {
                String str = this.LJIILJJIL;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listLL.iterator();
                while (it2.hasNext()) {
                    String uid = ((BaseContact) it2.next()).getUid();
                    if (uid != null) {
                        arrayList.add(uid);
                    }
                }
                if (Intrinsics.LJFF(str, C13LP.LJJLIIIJ(arrayList, "_", null, null, 0, null, null, 62))) {
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (IMContact iMContact : listLL) {
                if ((iMContact instanceof IMUser) && (iMUser = (IMUser) iMContact) != null && (avatarMedium = iMUser.getAvatarMedium()) != null) {
                    arrayList2.add(avatarMedium);
                }
            }
            if (arrayList2.size() == 2) {
                C11NZ<Bitmap> c11nzLIZIZ = new C2177241AIw(this.LIZ.LIZ.getContext(), new C1246110iX3(arrayList2, 2), new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), null, 0, 2, 0.85f, 0.0f, 0, 0, null, null, false, false, false, null, 130872)).LIZIZ();
                if (c11nzLIZIZ != null) {
                    c11nzLIZIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0I96
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("CreateGroupChatWidget@e9a.handleCreateGroupButtonLayoutUpdate$avatarDrawDisposable$1");
                            Bitmap bitmap = (Bitmap) obj;
                            C197039127h c197039127h2 = c197039127h;
                            C1364640lcE c1364640lcE = this;
                            List<IMContact> list = listLL;
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(c197039127h2.getContext().getResources(), bitmap);
                            bitmapDrawable.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            c197039127h2.setIconWidth(bitmap.getWidth());
                            c197039127h2.setIconHeight(bitmap.getHeight());
                            c197039127h2.setButtonEndIconDrawable(bitmapDrawable);
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<IMContact> it3 = list.iterator();
                            while (it3.hasNext()) {
                                String uid2 = it3.next().getUid();
                                if (uid2 != null) {
                                    arrayList3.add(uid2);
                                }
                            }
                            c1364640lcE.LJIILJJIL = C13LP.LJJLIIIJ(arrayList3, "_", null, null, 0, null, null, 62);
                            C1C7U.LIZIZ("CreateGroupChatWidget@e9a.handleCreateGroupButtonLayoutUpdate$avatarDrawDisposable$1");
                        }
                    });
                }
            } else {
                return;
            }
        } else {
            c197039127h.setButtonEndIconDrawable(null);
            this.LJIILJJIL = "";
        }
        if (c197039127h.getVisibility() != 0) {
            if (z) {
                if (!this.LJ) {
                    C1364620lcC.LIZIZ(C1364620lcC.LIZ, CardStruct.IStatusCode.DEFAULT);
                }
                if (!z) {
                }
            }
            i = 8;
        } else if (!z) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, c197039127h);
        if (z && !this.LJI) {
            HandlerHook.viewPost(c197039127h, new ARunnableS76S0200000_7(c197039127h, this, 57));
        }
    }

    public static final void LJ(C1364640lcE c1364640lcE, boolean z) {
        if (c1364640lcE.LJIIJ != z) {
            c1364640lcE.LJIIJ = z;
            c1364640lcE.LIZ.LIZIZ.setChecked(z);
            c1364640lcE.LIZJ.N9(c1364640lcE.LJIIJ);
        }
    }

    public /* synthetic */ C1364640lcE(C1363060lZg c1363060lZg, SharePackage sharePackage, InterfaceC1364650lcF interfaceC1364650lcF) {
        this(c1363060lZg, sharePackage, interfaceC1364650lcF, false, false);
    }

    public C1364640lcE(C1363060lZg c1363060lZg, SharePackage sharePackage, InterfaceC1364650lcF interfaceC1364650lcF, boolean z, boolean z2) {
        this.LIZ = c1363060lZg;
        this.LIZIZ = sharePackage;
        this.LIZJ = interfaceC1364650lcF;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = C1364570lc7.LIZJ();
        this.LJII = new AUListenerS270S0100000_21(this, 39);
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1417));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1419));
        this.LJIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(543));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1418));
        this.LJIILJJIL = "";
        c1363060lZg.LIZIZ.setClickable(false);
        C786410Ut5.R7(c1363060lZg.LIZ, new ACListenerS155S0100000_21(this, 223));
        ((IIMChatDetailAnalytics) ServiceManager.get().getService(IIMChatDetailAnalytics.class)).LJI("share");
    }
}
