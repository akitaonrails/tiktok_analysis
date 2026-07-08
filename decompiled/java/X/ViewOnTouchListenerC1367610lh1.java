package X;

import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.messagelist.api.IMMessageListApi;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.fragment.RelationSelectFragment;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.controller.helper.ShareStateHelper;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewOnTouchListenerC1367610lh1 implements View.OnTouchListener {
    public final Activity LL;
    public final View LLILLJJLI;
    public SharePackage LLILLL;
    public BaseContent LLILZ;
    public Map<String, String> LLILZIL;
    public boolean LLILZLL;
    public EditText LLIZ;
    public ImageView LLIZLLLIL;
    public C1749280vcc LLJ;
    public RecyclerView LLJI;
    public C1367990lhd LLJIJIL;
    public C1402120mag LLJILJIL;
    public AbstractC1368060lhk LLJILJILJ;
    public ACListenerS155S0100000_21 LLJILLL;
    public C1367550lgv LLJJ;
    public String LLJJI;
    public RelationSelectFragment LLJJIJI;
    public String LLJJIII = "";
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(934));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(933));
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(390));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(391));

    public void LJI(List<Integer> list, List<String> list2) {
    }

    public void LIZJ() {
        this.LLJIJIL = (C1367990lhd) this.LLILLJJLI.findViewById(R.id.y08);
        this.LLJ = (C1749280vcc) this.LLILLJJLI.findViewById(R.id.w28);
        EditText editText = (EditText) this.LLILLJJLI.findViewById(R.id.u_1);
        this.LLIZ = editText;
        if (editText != null) {
            editText.setTag("relation_search_tag");
        }
        EditText editText2 = this.LLIZ;
        if (editText2 != null) {
            editText2.setHint(2131835514);
        }
        this.LLIZLLLIL = (ImageView) this.LLILLJJLI.findViewById(R.id.coo);
        RecyclerView recyclerView = (RecyclerView) this.LLILLJJLI.findViewById(R.id.t0e);
        this.LLJI = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this.LL));
        }
        RecyclerView recyclerView2 = this.LLJI;
        if (recyclerView2 != null) {
            final Activity activity = this.LL;
            recyclerView2.addOnScrollListener(new C1379050lzT(activity) { // from class: X.0lh3
                @Override // X.C1379050lzT, X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView3, int i) {
                    super.LJJIIJ(recyclerView3, i);
                    ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1 = this.LLILLJJLI;
                    EditText editText3 = viewOnTouchListenerC1367610lh1.LLIZ;
                    if (editText3 != null) {
                        C0DLI.LIZ(viewOnTouchListenerC1367610lh1.LL, editText3);
                    }
                }
            });
        }
    }

    public final void LJIIIIZZ() {
        C1367990lhd c1367990lhd = this.LLJIJIL;
        if (c1367990lhd != null) {
            c1367990lhd.setRightTuxFont(41);
            c1367990lhd.setLeftText(R.string.f1_);
            c1367990lhd.setRightText(2131835705);
            c1367990lhd.setTitle(2131835793);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a05, c1367990lhd.getContext());
            if (numLIZJ != null) {
                c1367990lhd.setRightTextColor(numLIZJ.intValue());
            }
            View rightView = c1367990lhd.getRightView();
            if (rightView != null) {
                rightView.setEnabled(false);
            }
        }
        AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
        if (abstractC1368060lhk != null) {
            abstractC1368060lhk.LLLJ(true);
        }
        C1367990lhd c1367990lhd2 = this.LLJIJIL;
        if (c1367990lhd2 != null) {
            c1367990lhd2.setOnTitlebarClickListener(new InterfaceC1368020lhg() { // from class: X.0lgw
                @Override // X.InterfaceC1368020lhg
                public final void LIZ() {
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZIZ() {
                    final ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1 = this.LIZ;
                    AbstractC1368060lhk abstractC1368060lhk2 = viewOnTouchListenerC1367610lh1.LLJILJILJ;
                    if (abstractC1368060lhk2 == null || abstractC1368060lhk2.LLILZLL.size() <= 0) {
                        return;
                    }
                    IInternalShareApi.LIZ.getClass();
                    C1370970lmR.LIZ().LIZIZ().LJIJJ(viewOnTouchListenerC1367610lh1.LL, viewOnTouchListenerC1367610lh1.LLILLL, (IMContact[]) abstractC1368060lhk2.LLILZLL.toArray(new IMContact[0]), viewOnTouchListenerC1367610lh1.LLJJI, new InterfaceC1367420lgi() { // from class: X.0lgn
                        @Override // X.InterfaceC1367420lgi
                        public final void LIZ(String str) {
                            List<? extends IMContact> listLJJLL;
                            Object[] array;
                            AbstractC1368060lhk abstractC1368060lhk3 = viewOnTouchListenerC1367610lh1.LLJILJILJ;
                            if (abstractC1368060lhk3 == null || (array = abstractC1368060lhk3.LLILZLL.toArray(new IMContact[0])) == null || (listLJJLL = C13LQ.LJJLL(array)) == null) {
                                listLJJLL = C13BV.INSTANCE;
                            }
                            viewOnTouchListenerC1367610lh1.LJIIJ(str, listLJJLL);
                            ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh12 = viewOnTouchListenerC1367610lh1;
                            SharePackage sharePackage = viewOnTouchListenerC1367610lh12.LLILLL;
                            if (sharePackage != null) {
                                BaseContent baseContent = viewOnTouchListenerC1367610lh12.LLILZ;
                                int size = listLJJLL.size();
                                IInternalShareApi.LIZ.getClass();
                                C1370970lmR.LIZ().LIZJ().LJJIIZI(sharePackage, baseContent, size, C0I0B.LJFF.LIZIZ());
                                C1370970lmR.LIZ().LIZJ().LJIILLIIL(sharePackage, "", listLJJLL, System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
                                ShareStateHelper.LIZJ(sharePackage, ((IIMAnalyticsUtil) viewOnTouchListenerC1367610lh12.LLJJJ.getValue()).getProcessId(), C19719512Dh.LIZIZ(listLJJLL));
                            }
                        }
                    }, new InterfaceC1367420lgi() { // from class: X.0lgy
                        @Override // X.InterfaceC1367420lgi
                        public final void LIZ(String str) {
                        }
                    });
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZLLL() {
                    this.LIZ.LJIIIZ();
                }
            });
        }
    }

    public final void LJIIIZ() {
        C1367990lhd c1367990lhd = this.LLJIJIL;
        if (c1367990lhd != null) {
            c1367990lhd.setRightTuxFont(41);
            c1367990lhd.setLeftText(2131835677);
            c1367990lhd.setTitle(2131835795);
            c1367990lhd.setRightText(2131835792);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1367990lhd.getContext());
            if (numLIZJ != null) {
                c1367990lhd.setRightTextColor(numLIZJ.intValue());
            }
            View rightView = c1367990lhd.getRightView();
            if (rightView != null) {
                rightView.setEnabled(true);
            }
            c1367990lhd.setOnTitlebarClickListener(new InterfaceC1368020lhg() { // from class: X.0lh2
                @Override // X.InterfaceC1368020lhg
                public final void LIZ() {
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZIZ() {
                    ((ILogger) this.LIZ.LLJJJIL.getValue()).LIZIZ(C0I0B.LJFF.LIZIZ());
                    this.LIZ.LJIIIIZZ();
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZLLL() {
                    ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1 = this.LIZ;
                    EditText editText = viewOnTouchListenerC1367610lh1.LLIZ;
                    if (editText != null) {
                        C0DLI.LIZ(viewOnTouchListenerC1367610lh1.LL, editText);
                    }
                    this.LIZ.LL.finish();
                }
            });
        }
        AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
        if (abstractC1368060lhk != null) {
            abstractC1368060lhk.LLLJ(false);
        }
    }

    public void LJIIJJI() {
        C1749280vcc c1749280vcc = this.LLJ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
        if (abstractC1368060lhk == null || abstractC1368060lhk.getItemCount() != 0) {
            C1749280vcc c1749280vcc2 = this.LLJ;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 8);
                return;
            }
            return;
        }
        if (this.LLILZLL) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LJ(c1722300uv6);
            C1749280vcc c1749280vcc3 = this.LLJ;
            if (c1749280vcc3 != null) {
                c1749280vcc3.setStatus(c1722300uv6);
            }
        } else {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_large_person;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            c1722300uv62.LIZJ = 0;
            c1722300uv62.LIZIZ = c419910GdJ;
            c1722300uv62.LJI = this.LL.getString(2131835775);
            c1722300uv62.LJIIIIZZ = this.LL.getString(2131835774);
            C1749280vcc c1749280vcc4 = this.LLJ;
            if (c1749280vcc4 != null) {
                c1749280vcc4.setStatus(c1722300uv62);
            }
        }
        C1749280vcc c1749280vcc5 = this.LLJ;
        if (c1749280vcc5 != null) {
            C786410Ut5.LLLZLZ(c1749280vcc5, 0);
        }
    }

    public final void LJIIL() {
        AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
        if ((abstractC1368060lhk != null ? abstractC1368060lhk.LLILZLL.size() : 0) <= 0) {
            C1367990lhd c1367990lhd = this.LLJIJIL;
            if (c1367990lhd != null) {
                c1367990lhd.setRightText(2131835705);
                c1367990lhd.setEnabled(false);
                c1367990lhd.setRightTuxFont(41);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a05, c1367990lhd.getContext());
                if (numLIZJ != null) {
                    c1367990lhd.setRightTextColor(numLIZJ.intValue());
                    return;
                }
                return;
            }
            return;
        }
        C1367990lhd c1367990lhd2 = this.LLJIJIL;
        if (c1367990lhd2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.getString(2131835705));
            sbLIZ.append('(');
            AbstractC1368060lhk abstractC1368060lhk2 = this.LLJILJILJ;
            sbLIZ.append(abstractC1368060lhk2 != null ? Integer.valueOf(abstractC1368060lhk2.LLILZLL.size()) : null);
            sbLIZ.append(')');
            c1367990lhd2.setRightText(C2188811AlT.LIZIZ(sbLIZ));
            View rightView = c1367990lhd2.getRightView();
            if (rightView != null) {
                rightView.setEnabled(true);
            }
            c1367990lhd2.setRightTuxFont(42);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a04, c1367990lhd2.getContext());
            if (numLIZJ2 != null) {
                c1367990lhd2.setRightTextColor(numLIZJ2.intValue());
            }
        }
    }

    public void LIZIZ() {
        AbstractC1368060lhk abstractC1368060lhk = C838600Wv4.LIZIZ() ? this.LLILLL != null ? new C1367730lhD() { // from class: X.0TLm
            @Override // X.AbstractC1368060lhk
            public final void LLLII(int i) {
                if (i >= 0 && i < ((ArrayList) this.LLILLL).size()) {
                    Object obj = ListProtector.get(this.LLILLL, i);
                    int size = this.LLILLL.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (Intrinsics.LJFF(obj, ListProtector.get(this.LLILLL, i2))) {
                            notifyItemChanged(i2);
                        }
                    }
                }
            }

            @Override // X.C1367730lhD, X.AbstractC1368060lhk
            public final C1368080lhm LLLIILIL(int i, ViewGroup viewGroup) {
                int i2;
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                if (i == 0) {
                    i2 = R.layout.cmj;
                } else {
                    i2 = R.layout.cmk;
                }
                return new C1368070lhl(this, C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false));
            }

            @Override // X.C1367730lhD, X.AbstractC1368060lhk, X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C1368080lhm c1368080lhmLLLIILIL = LLLIILIL(i, viewGroup);
                try {
                    View view = c1368080lhmLLLIILIL.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1368080lhmLLLIILIL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1368080lhmLLLIILIL.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(c1368080lhmLLLIILIL.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1368080lhmLLLIILIL.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1368080lhmLLLIILIL.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = c1368080lhmLLLIILIL.getClass().getName();
                return c1368080lhmLLLIILIL;
            }
        } : new C1367730lhD() { // from class: X.0TLo
            @Override // X.C1367730lhD, X.AbstractC1368060lhk
            public final C1368080lhm LLLIILIL(int i, ViewGroup viewGroup) {
                int i2;
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
                if (i == 0) {
                    i2 = R.layout.cmi;
                } else {
                    i2 = R.layout.cmk;
                }
                return new C1368090lhn(this, C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false));
            }

            @Override // X.C1367730lhD, X.AbstractC1368060lhk, X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C1368080lhm c1368080lhmLLLIILIL = LLLIILIL(i, viewGroup);
                try {
                    View view = c1368080lhmLLLIILIL.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1368080lhmLLLIILIL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1368080lhmLLLIILIL.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(c1368080lhmLLLIILIL.getClass().getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1368080lhmLLLIILIL.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1368080lhmLLLIILIL.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = c1368080lhmLLLIILIL.getClass().getName();
                return c1368080lhmLLLIILIL;
            }
        } : new AbstractC1368060lhk() { // from class: X.0lh4
            @Override // X.AbstractC1368060lhk
            public final String LLLFZ(IMContact iMContact) {
                IMUser iMUserLIZ = C903150Zbt.LIZ(iMContact);
                if (iMUserLIZ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(iMUserLIZ.getUniqueId());
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return null;
            }
        };
        this.LLJILJILJ = abstractC1368060lhk;
        abstractC1368060lhk.LLJ = new ARunnableS121S0100000_21(this, 109);
        abstractC1368060lhk.LLJI = this.LLJJ;
        SharePackage sharePackage = this.LLILLL;
        abstractC1368060lhk.LLILLJJLI = sharePackage == null ? false : TextUtils.equals(sharePackage.extras.getString("is_friend_private"), "true");
        RecyclerView recyclerView = this.LLJI;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LLJILJILJ);
        }
    }

    public final boolean LIZ(IMContact iMContact) {
        boolean z;
        String str;
        Bundle bundle;
        Integer numValueOf;
        if (iMContact instanceof IMConversation) {
            return true;
        }
        IMUser iMUserLIZ = C903150Zbt.LIZ(iMContact);
        if (iMUserLIZ == null) {
            return false;
        }
        if (!TextUtils.equals(iMUserLIZ.getUid(), C461720I8s.LIZIZ()) && iMUserLIZ.getFollowStatus() != 2) {
            SharePackage sharePackage = this.LLILLL;
            String str2 = null;
            if (sharePackage != null && (bundle = sharePackage.extras) != null && (numValueOf = Integer.valueOf(bundle.getInt("aweme_type"))) != null && (numValueOf.intValue() == 501 || numValueOf.intValue() == 502)) {
                z = true;
            } else {
                z = false;
            }
            SharePackage sharePackage2 = this.LLILLL;
            if (sharePackage2 != null) {
                str = sharePackage2.itemType;
            } else {
                str = null;
            }
            boolean zEquals = TextUtils.equals(str, "gif");
            SharePackage sharePackage3 = this.LLILLL;
            if (sharePackage3 != null) {
                str2 = sharePackage3.itemType;
            }
            if (TextUtils.equals(str2, "pic")) {
                RecyclerView recyclerView = this.LLJI;
                if (recyclerView != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(recyclerView);
                    c1389890mGx.LJIIIZ(2131835756);
                    c1389890mGx.LJIIJJI();
                }
                return false;
            }
            if (zEquals && z) {
                RecyclerView recyclerView2 = this.LLJI;
                if (recyclerView2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(recyclerView2);
                    c1389890mGx2.LJIIIZ(2131835701);
                    c1389890mGx2.LJIIJJI();
                }
                return false;
            }
        }
        return true;
    }

    public final void LJ(IMContact iMContact) {
        String str;
        if (this.LLILZ == null) {
            str = "chat_list";
        } else {
            str = "chat_forward";
        }
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZJ().LJJII(this.LLILLL, iMContact, str, System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), C0I0B.LJFF.LIZIZ());
        if (iMContact instanceof IMUser) {
            String uid = iMContact.getUid();
            if (uid != null) {
                LIZLLL(C0YNP.LIZLLL(C2095008Iq.LJIILIIL(uid)), uid);
                return;
            }
            return;
        }
        if (!(iMContact instanceof IMConversation)) {
            return;
        }
        String conversationId = ((IMConversation) iMContact).getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        LIZLLL(conversationId, "");
    }

    public void LJFF(List<? extends IMContact> list) {
        if (C06W7.LIZIZ(this.LL)) {
            this.LLILZLL = false;
            AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
            if (abstractC1368060lhk != null) {
                abstractC1368060lhk.LLLIL(list);
            }
            LJIIJJI();
        }
    }

    public final void LIZLLL(String str, String str2) {
        SharePackage sharePackage = this.LLILLL;
        if (sharePackage == null) {
            return;
        }
        String strLIZIZ = C1367440lgk.LIZIZ(sharePackage.itemType);
        if (!TextUtils.isEmpty(strLIZIZ)) {
            IInternalShareApi.LIZ.getClass();
            InterfaceC1367800lhK interfaceC1367800lhKLIZJ = C1370970lmR.LIZ().LIZJ();
            String strLIZIZ2 = C461720I8s.LIZIZ();
            strLIZIZ2.toString();
            interfaceC1367800lhKLIZJ.LJIIIZ(strLIZIZ, str, str2, strLIZIZ2, C0I0B.LJFF.LIZIZ());
        }
    }

    public void LJII(CharSequence charSequence, List list) {
        if (C06W7.LIZIZ(this.LL)) {
            this.LLILZLL = true;
            AbstractC1368060lhk abstractC1368060lhk = this.LLJILJILJ;
            if (abstractC1368060lhk != null) {
                abstractC1368060lhk.LL = 1;
                abstractC1368060lhk.LLILZIL = charSequence.toString();
                ((ArrayList) abstractC1368060lhk.LLILLL).clear();
                ((ArrayList) abstractC1368060lhk.LLILLL).addAll(list);
                abstractC1368060lhk.notifyDataSetChanged();
            }
            LJIIJJI();
        }
    }

    public final void LJIIJ(String str, List list) {
        IMMessageListApi iMMessageListApi;
        InterfaceC896020ZDc interfaceC896020ZDcLIZ;
        BaseContent baseContentLIZIZ = this.LLILZ;
        if (baseContentLIZIZ == null) {
            C1365330ldL c1365330ldL = C1365330ldL.LIZ;
            SharePackage sharePackage = this.LLILLL;
            c1365330ldL.getClass();
            if (sharePackage != null && (iMMessageListApi = (IMMessageListApi) PluggableExtentionKt.pluggableSpi$default(IMMessageListApi.class, false, false, false, 14, null)) != null && (interfaceC896020ZDcLIZ = iMMessageListApi.LIZ()) != null) {
                baseContentLIZIZ = interfaceC896020ZDcLIZ.LIZIZ(sharePackage);
            } else {
                baseContentLIZIZ = null;
            }
        }
        SharePackage sharePackage2 = this.LLILLL;
        if (sharePackage2 == null) {
            return;
        }
        C1365220ldA c1365220ldA = C1365220ldA.LIZ;
        Map<String, String> map = this.LLILZIL;
        Map mapLJ = C2097608Jq.LJ();
        c1365220ldA.getClass();
        C1365220ldA.LJII(sharePackage2, str, list, null, baseContentLIZIZ, map, null, true, null, mapLJ);
        if (C06W7.LIZIZ(this.LL)) {
            this.LL.finish();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        if (Intrinsics.LJFF(view, this.LLIZ) && motionEvent.getAction() == 1) {
            if (this.LLILZ != null) {
                str = "forward";
            } else if (this.LLILLL != null) {
                str = "share";
            } else {
                str = "contact";
            }
            ((ILogger) this.LLJJJIL.getValue()).LIZJ(str, C0I0B.LJFF.LIZIZ());
            return false;
        }
        return false;
    }

    public ViewOnTouchListenerC1367610lh1(C19EG c19eg, View view, boolean z) {
        C1367990lhd c1367990lhd;
        this.LL = c19eg;
        this.LLILLJJLI = view;
        LIZJ();
        if (this.LLJILLL == null) {
            this.LLJILLL = new ACListenerS155S0100000_21(this, 147);
        }
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C1402120mag(this, 11);
        }
        if (this.LLJJ == null) {
            this.LLJJ = new C1367550lgv(this);
        }
        C1367990lhd c1367990lhd2 = this.LLJIJIL;
        if (c1367990lhd2 != null) {
            c1367990lhd2.setOnTitlebarClickListener(new InterfaceC1368020lhg() { // from class: X.0lh5
                @Override // X.InterfaceC1368020lhg
                public final void LIZ() {
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1368020lhg
                public final void LIZLLL() {
                    ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1 = this.LIZ;
                    EditText editText = viewOnTouchListenerC1367610lh1.LLIZ;
                    if (editText != null) {
                        C0DLI.LIZ(viewOnTouchListenerC1367610lh1.LL, editText);
                    }
                    this.LIZ.LL.finish();
                }
            });
        }
        ImageView imageView = this.LLIZLLLIL;
        if (imageView != null) {
            C786410Ut5.Q7(imageView, this.LLJILLL);
        }
        final EditText editText = this.LLIZ;
        if (editText != null) {
            editText.addTextChangedListener(this.LLJILJIL);
            editText.setOnKeyListener(new View.OnKeyListener() { // from class: X.0lh6
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                    if (i == 66) {
                        C0DLI.LIZ(this.LL.LL, editText);
                        return true;
                    }
                    return false;
                }
            });
            editText.setOnTouchListener(this);
        }
        LIZIZ();
        if (z && (c1367990lhd = this.LLJIJIL) != null) {
            int visibility = c1367990lhd.getVisibility();
            c1367990lhd.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1367990lhd);
        }
    }
}
