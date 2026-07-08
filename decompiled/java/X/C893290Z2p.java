package X;

import Y.ACListenerS117S0200000_14;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.service.service.IIMAnonymousService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Z2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893290Z2p extends AbstractC21673619ry<C0Z4N> {
    public final IMReactionListSheetViewModel LL;
    public C869590Y9l LLILLJJLI;
    public final List<C860410Xp9> LLILLL = new ArrayList();
    public final C892120YzC LLILZ = new InterfaceC893300Z2q() { // from class: X.0YzC
        @Override // X.InterfaceC893300Z2q
        public final void LIZ(C0Z4N c0z4n) {
            int bindingAdapterPosition = c0z4n.getBindingAdapterPosition();
            if (bindingAdapterPosition == -1) {
                return;
            }
            C893290Z2p c893290Z2p = this.LIZ;
            IMReactionListSheetViewModel iMReactionListSheetViewModel = c893290Z2p.LL;
            iMReactionListSheetViewModel.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (iMReactionListSheetViewModel.LLIZLLLIL + 600 < jCurrentTimeMillis) {
                iMReactionListSheetViewModel.LLIZLLLIL = jCurrentTimeMillis;
                C860410Xp9 c860410Xp9 = (C860410Xp9) C13LP.LJJJLZIJ(bindingAdapterPosition, c893290Z2p.LLILLL);
                if (c860410Xp9 != null) {
                    c893290Z2p.LL.wQ2(c860410Xp9);
                }
            }
        }

        @Override // X.InterfaceC893300Z2q
        public final void LIZIZ(EnumC879260YeS enumC879260YeS) {
            IIMMessageReactionAnalytics iIMMessageReactionAnalytics = (IIMMessageReactionAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMMessageReactionAnalytics.class);
            if (iIMMessageReactionAnalytics != null) {
                iIMMessageReactionAnalytics.LIZLLL(this.LIZ.LLILLJJLI, EnumC879370Yed.REMOVE, enumC879260YeS, C0I0B.LJFF.LIZIZ());
            }
        }

        @Override // X.InterfaceC893300Z2q
        public final void LIZJ(Context context, String str) {
            IIMAnonymousService iIMAnonymousService;
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJ = C069P.LIZ().LJ().LJ(str, null);
            if (iMUserLJ != null && (iIMAnonymousService = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null)) != null) {
                String conversationId = this.LIZ.LLILLJJLI.getConversationId();
                String uid = iMUserLJ.getUid();
                if (uid == null) {
                    uid = "";
                }
                if (iIMAnonymousService.LIZLLL(conversationId, uid, false)) {
                    IIMAnonymousService iIMAnonymousService2 = (IIMAnonymousService) PluggableExtentionKt.pluggableSpi$default(IIMAnonymousService.class, false, false, false, 14, null);
                    if (iIMAnonymousService2 != null) {
                        iIMAnonymousService2.LIZIZ(context, "reaction_panel_user_head", this.LIZ.LLILLJJLI.getConversationId(), str);
                        return;
                    }
                    return;
                }
            }
            IMReactionListSheetViewModel iMReactionListSheetViewModel = this.LIZ.LL;
            iMReactionListSheetViewModel.getClass();
            if (str.length() > 0) {
                IIMChatAnalytics.LIZ.getClass();
                IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
                if (iIMChatAnalyticsLIZ != null) {
                    iIMChatAnalyticsLIZ.LJ(C0I0B.LJFF.LIZIZ(), null, str, "chat", "click_reaction", String.valueOf(System.currentTimeMillis()));
                }
                IDmHelper.LIZ.getClass();
                IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
                if (iDmHelperLIZ != null) {
                    iDmHelperLIZ.LIZJ(str);
                }
                iMReactionListSheetViewModel.LLILLL = true;
            }
        }
    };

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C860410Xp9) ListProtector.get(this.LLILLL, i)).LLILZ.ordinal();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0YzC] */
    public C893290Z2p(IMReactionListSheetViewModel iMReactionListSheetViewModel, C869590Y9l c869590Y9l) {
        this.LL = iMReactionListSheetViewModel;
        this.LLILLJJLI = c869590Y9l;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((C0Z4N) viewHolder).I5((C860410Xp9) ListProtector.get(this.LLILLL, i), this.LLILLJJLI.getConversationId(), this.LLILLJJLI);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0Z4N c0z4n;
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cn_, viewGroup, false);
        int i2 = C879240YeQ.LIZ[EnumC879230YeP.values()[i].ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        final C892120YzC c892120YzC = this.LLILZ;
                        c0z4n = new C0Z4N(viewTd, c892120YzC) { // from class: X.0Z2t
                            @Override // X.C0Z4N
                            public final void I5(C860410Xp9 c860410Xp9, String str, C869590Y9l c869590Y9l) {
                                String strLIZ;
                                String uid;
                                UrlModel displayAvatar;
                                TuxIconView tuxIconViewR5;
                                T5(c860410Xp9);
                                IMContactApi.LIZ.getClass();
                                IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(c860410Xp9.LLILLJJLI, "", "im_local_db");
                                IMAIServiceAPI.LIZ.getClass();
                                Drawable drawable = AnonymousClass0629.LIZ().LIZ().LJII(C0ZQ1.REACTION_PANEL_AVATAR_LABEL, c869590Y9l).LIZIZ;
                                if (drawable != null && (tuxIconViewR5 = R5()) != null) {
                                    tuxIconViewR5.setImageDrawable(drawable);
                                }
                                if (iMUserLJIIL != null) {
                                    strLIZ = C892130YzD.LIZ(iMUserLJIIL, str);
                                } else {
                                    strLIZ = null;
                                }
                                TextView textView = (TextView) this.LLILZ.getValue();
                                C0I0B.LJFF.LIZJ();
                                textView.setText(C894660Z7w.LIZ().getResources().getString(2131825825, strLIZ));
                                TuxIconView tuxIconViewR52 = R5();
                                if (tuxIconViewR52 != null) {
                                    C786410Ut5.LLLLLLZZ(tuxIconViewR52, 0);
                                }
                                IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJ.getValue();
                                if (iMUserLJIIL != null) {
                                    uid = iMUserLJIIL.getUid();
                                    displayAvatar = iMUserLJIIL.getDisplayAvatar();
                                } else {
                                    uid = null;
                                    displayAvatar = null;
                                }
                                iDMAvatarLoader.LIZIZ(uid, displayAvatar, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
                                C786410Ut5.LLLLZLL(N5(), 8);
                                S5().setTag(null);
                                P5().setTag(null);
                                ((View) this.LLILZLL.getValue()).setTag(null);
                                this.itemView.setTag(0);
                                L5(new ACListenerS117S0200000_14(this, c860410Xp9, 37));
                            }
                        };
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    final C892120YzC c892120YzC2 = this.LLILZ;
                    c0z4n = new C0Z4N(viewTd, c892120YzC2) { // from class: X.0Z2s
                        @Override // X.C0Z4N
                        public final void I5(C860410Xp9 c860410Xp9, String str, C869590Y9l c869590Y9l) {
                            String strLIZ;
                            String uid;
                            UrlModel displayAvatar;
                            TuxIconView tuxIconViewR5;
                            T5(c860410Xp9);
                            IMContactApi.LIZ.getClass();
                            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(c860410Xp9.LLILLJJLI, "", "im_local_db");
                            IMAIServiceAPI.LIZ.getClass();
                            Drawable drawable = AnonymousClass0629.LIZ().LIZ().LJII(C0ZQ1.REACTION_PANEL_AVATAR_LABEL, c869590Y9l).LIZIZ;
                            if (drawable != null && (tuxIconViewR5 = R5()) != null) {
                                tuxIconViewR5.setImageDrawable(drawable);
                            }
                            if (iMUserLJIIL != null) {
                                strLIZ = C892130YzD.LIZ(iMUserLJIIL, str);
                            } else {
                                strLIZ = null;
                            }
                            TextView textView = (TextView) this.LLILZ.getValue();
                            C0I0B.LJFF.LIZJ();
                            textView.setText(C894660Z7w.LIZ().getResources().getString(2131825825, strLIZ));
                            TuxIconView tuxIconViewR52 = R5();
                            if (tuxIconViewR52 != null) {
                                C786410Ut5.LLLLLLZZ(tuxIconViewR52, 0);
                            }
                            IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJ.getValue();
                            if (iMUserLJIIL != null) {
                                uid = iMUserLJIIL.getUid();
                                displayAvatar = iMUserLJIIL.getDisplayAvatar();
                            } else {
                                uid = null;
                                displayAvatar = null;
                            }
                            iDMAvatarLoader.LIZIZ(uid, displayAvatar, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
                            C786410Ut5.LLLLZLL(N5(), 0);
                            N5().setText(this.itemView.getContext().getString(2131831622));
                            S5().setTag(1);
                            P5().setTag(1);
                            ((View) this.LLILZLL.getValue()).setTag(1);
                            this.itemView.setTag(null);
                            L5(new ACListenerS117S0200000_14(this, c860410Xp9, 38));
                        }
                    };
                }
            } else {
                final C892120YzC c892120YzC3 = this.LLILZ;
                c0z4n = new C0Z4N(viewTd, c892120YzC3) { // from class: X.0Z2u
                    @Override // X.C0Z4N
                    public final void I5(C860410Xp9 c860410Xp9, String str, C869590Y9l c869590Y9l) {
                        String strLIZ;
                        String uid;
                        UrlModel displayAvatar;
                        T5(c860410Xp9);
                        IMContactApi.LIZ.getClass();
                        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(c860410Xp9.LLILLJJLI, "", "im_local_db");
                        TuxIconView tuxIconViewR5 = R5();
                        if (tuxIconViewR5 != null) {
                            C786410Ut5.LLLLLLZZ(tuxIconViewR5, 8);
                        }
                        TextView textView = (TextView) this.LLILZ.getValue();
                        if (iMUserLJIIL != null) {
                            strLIZ = C892130YzD.LIZ(iMUserLJIIL, str);
                        } else {
                            strLIZ = null;
                        }
                        textView.setText(strLIZ);
                        IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJ.getValue();
                        if (iMUserLJIIL != null) {
                            uid = iMUserLJIIL.getUid();
                            displayAvatar = iMUserLJIIL.getDisplayAvatar();
                        } else {
                            uid = null;
                            displayAvatar = null;
                        }
                        iDMAvatarLoader.LIZIZ(uid, displayAvatar, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
                        C786410Ut5.LLLLZLL(N5(), 8);
                        S5().setTag(null);
                        P5().setTag(null);
                        ((View) this.LLILZLL.getValue()).setTag(null);
                        this.itemView.setTag(0);
                        L5(new ACListenerS117S0200000_14(this, c860410Xp9, 39));
                    }
                };
            }
        } else {
            final C892120YzC c892120YzC4 = this.LLILZ;
            c0z4n = new C0Z4N(viewTd, c892120YzC4) { // from class: X.0Z2r
                @Override // X.C0Z4N
                public final void I5(C860410Xp9 c860410Xp9, String str, C869590Y9l c869590Y9l) {
                    String strLIZ;
                    String uid;
                    UrlModel displayAvatar;
                    T5(c860410Xp9);
                    IMContactApi.LIZ.getClass();
                    IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(c860410Xp9.LLILLJJLI, "", "im_local_db");
                    TuxIconView tuxIconViewR5 = R5();
                    if (tuxIconViewR5 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconViewR5, 8);
                    }
                    TextView textView = (TextView) this.LLILZ.getValue();
                    if (iMUserLJIIL != null) {
                        strLIZ = C892130YzD.LIZ(iMUserLJIIL, str);
                    } else {
                        strLIZ = null;
                    }
                    textView.setText(strLIZ);
                    IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJ.getValue();
                    if (iMUserLJIIL != null) {
                        uid = iMUserLJIIL.getUid();
                        displayAvatar = iMUserLJIIL.getDisplayAvatar();
                    } else {
                        uid = null;
                        displayAvatar = null;
                    }
                    iDMAvatarLoader.LIZIZ(uid, displayAvatar, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
                    C786410Ut5.LLLLZLL(N5(), 0);
                    N5().setText(this.itemView.getContext().getString(2131831622));
                    S5().setTag(1);
                    P5().setTag(1);
                    ((View) this.LLILZLL.getValue()).setTag(1);
                    this.itemView.setTag(null);
                    L5(new ACListenerS117S0200000_14(this, c860410Xp9, 40));
                }
            };
        }
        try {
            View view = c0z4n.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0z4n.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0z4n.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0z4n.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0z4n.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0z4n.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0z4n.getClass().getName();
        return c0z4n;
    }
}
