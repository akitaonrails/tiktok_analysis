package Y;

import X.AbstractC1368180lhw;
import X.C0HXG;
import X.C0I0B;
import X.C0IA9;
import X.C0IAB;
import X.C0IAD;
import X.C0IAH;
import X.C0WZX;
import X.C1055660dZs;
import X.C118300cf;
import X.C1214170hhX;
import X.C123100dR;
import X.C1348790lCf;
import X.C1351440lGw;
import X.C1355960lOE;
import X.C1356000lOI;
import X.C1356160lOY;
import X.C1356480lP4;
import X.C1356490lP5;
import X.C1361770lXb;
import X.C1362630lYz;
import X.C1368790liv;
import X.C1368800liw;
import X.C1370970lmR;
import X.C1381810m3v;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1599690rjL;
import X.C197039127h;
import X.C1ER1;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C442430HWn;
import X.C641850PFn;
import X.C786410Ut5;
import X.C897520ZIw;
import X.InterfaceC1360060lUq;
import X.InterfaceC1362600lYw;
import X.InterfaceC1364710lcL;
import X.InterfaceC1368680lik;
import X.ViewOnTouchListenerC1367610lh1;
import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.viewmodel.SingleLiveEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.fragment.RelationSelectFragment;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.viewmodel.RelationViewModel;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventInviteGuestFragment;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.LemonPostDetailFragment;
import com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.minis.api.IMinisShareService;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AObserverS183S0200000_21 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        IMinisShareService iMinisShareService;
        List list = (List) obj;
        C897520ZIw c897520ZIw = (C897520ZIw) ((C1368800liw) aObserverS183S0200000_21.l0).LLJILJIL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LJIIJJI(new C1356480lP4(list, null));
        }
        C1368800liw c1368800liw = (C1368800liw) aObserverS183S0200000_21.l0;
        ShareMoreViewModel shareMoreViewModel = (ShareMoreViewModel) aObserverS183S0200000_21.l1;
        ArrayList arrayList = new ArrayList(list);
        shareMoreViewModel.BQ2(arrayList);
        c1368800liw.LJFF().LLLJIL();
        if (!arrayList.isEmpty()) {
            if (Intrinsics.LJFF(c1368800liw.LIZJ().LIZ.itemType, "minis") && (iMinisShareService = (IMinisShareService) PluggableExtentionKt.pluggableSpi$default(IMinisShareService.class, false, false, false, 14, null)) != null) {
                iMinisShareService.LIZIZ(c1368800liw.LIZJ().LIZ.extras.getString("minis_id"), arrayList);
            }
            c1368800liw.LJFF().LLLIIIIL(arrayList);
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = -1;
            if (c1368800liw.LIZJ().LJIJ) {
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((IMContact) ListProtector.get(arrayList, i)).getType() == 17) {
                        c118300cf.element = i + 1;
                        break;
                    }
                    i++;
                }
            }
            if (c118300cf.element != -1) {
                c1368800liw.LLJJIII = new ARunnableS79S0200000_10(c1368800liw, c118300cf, 0);
                RecyclerView recyclerView = c1368800liw.LLJILLL;
                if (recyclerView != null) {
                    HandlerHook.viewPostDelay(recyclerView, c1368800liw.LLJJIII, 100L);
                }
            }
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZJ().LJIIL(c1368800liw.LIZJ().LIZ, C0I0B.LJFF.LIZIZ());
        }
    }

    public static final void onChanged$1(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        if (((SingleLiveEvent) aObserverS183S0200000_21.l0).pending.compareAndSet(true, false)) {
            ((Observer) aObserverS183S0200000_21.l1).onChanged(obj);
        }
    }

    public static final void onChanged$10(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            final C1361770lXb c1361770lXb = (C1361770lXb) aObserverS183S0200000_21.l0;
            String str = ((SharePanelImHeadViewModel) aObserverS183S0200000_21.l1).LLJJJ;
            c1361770lXb.getClass();
            C1362630lYz.LIZ.getClass();
            C1362630lYz.LIZ();
            IMSharePanelApi.LIZ.getClass();
            C1599690rjL.LIZ().getShareService().LJIJ(System.currentTimeMillis(), "more");
            InterfaceC1362600lYw interfaceC1362600lYw = c1361770lXb.LLJ;
            if (interfaceC1362600lYw != null) {
                interfaceC1362600lYw.LJIIJ(c1361770lXb.LLILLJJLI, "chat_merge");
            }
            Activity activityLIZ = C1388190mED.LIZ(c1361770lXb.LLILZIL);
            if (activityLIZ != null) {
                ((InputMethodManager) C786410Ut5.F2(activityLIZ, "input_method")).hideSoftInputFromWindow(activityLIZ.getWindow().getDecorView().getWindowToken(), 0);
            }
            Bundle bundle = c1361770lXb.LLILLJJLI.extras;
            C786410Ut5.LJJJI("enter_method", "more", bundle);
            Boolean bool = null;
            if (str != null && C123100dR.LIZ(str)) {
                C786410Ut5.LJJJI("default_edit_text_msg", str, bundle);
            }
            Activity activityLIZ2 = C1388190mED.LIZ(c1361770lXb.LLILZIL);
            if (activityLIZ2 != null) {
                InterfaceC1368680lik interfaceC1368680lik = new InterfaceC1368680lik() { // from class: X.0lYv
                    @Override // X.InterfaceC1368680lik
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LJ(IMContact iMContact, int i, boolean z) {
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LJIIIIZZ() {
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LIZ(SharePackage sharePackage) {
                        InterfaceC1362600lYw interfaceC1362600lYw2 = c1361770lXb.LLJ;
                        if (interfaceC1362600lYw2 != null) {
                            interfaceC1362600lYw2.LJIIL(sharePackage);
                        }
                        InterfaceC1362600lYw interfaceC1362600lYw3 = c1361770lXb.LLJ;
                        if (interfaceC1362600lYw3 != null) {
                            interfaceC1362600lYw3.LIZ(sharePackage);
                        }
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LIZIZ(HashMap<String, String> map) {
                        InterfaceC1362600lYw interfaceC1362600lYw2 = c1361770lXb.LLJ;
                        if (interfaceC1362600lYw2 != null) {
                            interfaceC1362600lYw2.LIZIZ(map);
                        }
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LJFF(SharePackage sharePackage) {
                        InterfaceC1362600lYw interfaceC1362600lYw2 = c1361770lXb.LLJ;
                        if (interfaceC1362600lYw2 != null) {
                            interfaceC1362600lYw2.LJFF(sharePackage);
                        }
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LJI(SharePackage sharePackage) {
                        InterfaceC1362600lYw interfaceC1362600lYw2 = c1361770lXb.LLJ;
                        if (interfaceC1362600lYw2 != null) {
                            interfaceC1362600lYw2.LJI(sharePackage);
                        }
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LJIIIZ(SharePackage sharePackage) {
                        InterfaceC1362600lYw interfaceC1362600lYw2 = c1361770lXb.LLJ;
                        if (interfaceC1362600lYw2 != null) {
                            interfaceC1362600lYw2.LJIIJJI(sharePackage);
                        }
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
                        InterfaceC1362600lYw interfaceC1362600lYw2 = c1361770lXb.LLJ;
                        if (interfaceC1362600lYw2 != null) {
                            interfaceC1362600lYw2.LIZJ(dialog, sharePackage);
                        }
                    }

                    @Override // X.InterfaceC1368680lik
                    public final void LJII(Dialog dialog, SharePackage sharePackage) {
                        InterfaceC1362600lYw interfaceC1362600lYw2 = c1361770lXb.LLJ;
                        if (interfaceC1362600lYw2 != null) {
                            interfaceC1362600lYw2.LJII(dialog, sharePackage);
                        }
                    }
                };
                SharePanelImHeadViewModel sharePanelImHeadViewModel = c1361770lXb.LLIZ;
                if (sharePanelImHeadViewModel != null) {
                    IInternalShareApi.LIZ.getClass();
                    InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
                    SharePackage sharePackage = sharePanelImHeadViewModel.LL;
                    Set<IMContact> setLJIILL = sharePanelImHeadViewModel.LLJJIJIL.LJIILL();
                    boolean z = !sharePanelImHeadViewModel.LL.extras.getBoolean("key_filter_group_chat");
                    SharePanelViewModel sharePanelViewModel = sharePanelImHeadViewModel.LLJJIJIL;
                    boolean z2 = sharePanelViewModel.LLJJJ;
                    C1214170hhX c1214170hhX = c1361770lXb.LLJILJIL;
                    boolean z3 = sharePanelViewModel.LLJJJIL;
                    if (Intrinsics.LJFF(sharePanelImHeadViewModel.LL.itemType, "search_image")) {
                        bool = c1361770lXb.LLILLL.LJJJJL;
                    }
                    interfaceC1364710lcLLIZIZ.LJFF(activityLIZ2, sharePackage, null, setLJIILL, false, interfaceC1368680lik, z2, c1214170hhX, false, z, bool, z3, false, null);
                }
            }
        }
    }

    public static final void onChanged$11(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            List<IMContact> value = ((ShareDialogViewModel) aObserverS183S0200000_21.l0).LLJ.getValue();
            if (value != null) {
                LiveEventInviteGuestFragment liveEventInviteGuestFragment = (LiveEventInviteGuestFragment) aObserverS183S0200000_21.l1;
                Iterator<IMContact> it2 = value.iterator();
                while (it2.hasNext()) {
                    it2.next().setInvitedEventId(liveEventInviteGuestFragment.LLJL);
                }
            }
            C1389890mGx c1389890mGx = new C1389890mGx((LiveEventInviteGuestFragment) aObserverS183S0200000_21.l1);
            c1389890mGx.LJIIIZ(2131852247);
            c1389890mGx.LJIIJJI();
            ((LiveEventInviteGuestFragment) aObserverS183S0200000_21.l1).MR().notifyDataSetChanged();
            return;
        }
        List<IMContact> value2 = ((ShareDialogViewModel) aObserverS183S0200000_21.l0).LLJ.getValue();
        if (value2 != null) {
            Iterator<IMContact> it3 = value2.iterator();
            while (it3.hasNext()) {
                it3.next().setInvitedEventId(null);
            }
        }
        ((LiveEventInviteGuestFragment) aObserverS183S0200000_21.l1).MR().notifyDataSetChanged();
        C1389890mGx c1389890mGx2 = new C1389890mGx((LiveEventInviteGuestFragment) aObserverS183S0200000_21.l1);
        c1389890mGx2.LJIIJ("invite failed");
        c1389890mGx2.LJIIJJI();
    }

    public static final void onChanged$2(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        PostModeDetailParams postModeDetailParams;
        C1356160lOY c1356160lOY = C1356160lOY.LIZ;
        Aweme aweme = (Aweme) aObserverS183S0200000_21.l0;
        C442430HWn c442430HWn = ((LemonPostDetailFragment) aObserverS183S0200000_21.l1).LLIZ;
        String str = null;
        if (c442430HWn != null) {
            postModeDetailParams = c442430HWn.LJI;
        } else {
            postModeDetailParams = null;
        }
        c1356160lOY.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1355960lOE.LIZJ(c2344009Gk, postModeDetailParams);
        C1355960lOE.LIZIZ(c2344009Gk, aweme);
        C1ER1 c1er1 = C1ER1.LIZIZ;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        }
        C641850PFn.LIZ(c2344009Gk, c1er1.fetchSearchParams(str, ""));
        C20684815ws.LJIILLIIL("enter_graphic_detail", c2344009Gk.LIZ);
        PostModeFullPageViewModel postModeFullPageViewModelNR = ((LemonPostDetailFragment) aObserverS183S0200000_21.l1).NR();
        postModeFullPageViewModelNR.LLILZIL = true;
        postModeFullPageViewModelNR.setState(AFwS259S0000000_21.get$arr$(474));
        C1356000lOI c1356000lOI = postModeFullPageViewModelNR.LLILZ;
        Aweme aweme2 = c1356000lOI.LJ;
        if (aweme2 != null && C0HXG.LIZ(aweme2) == 1) {
            c1356000lOI.LIZLLL = true;
        }
    }

    public static final void onChanged$3(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        if (((com.ss.android.ugc.aweme.minis.viewmodel.SingleLiveEvent) aObserverS183S0200000_21.l0).pending.compareAndSet(true, false)) {
            ((Observer) aObserverS183S0200000_21.l1).onChanged(obj);
        }
    }

    public static final void onChanged$4(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        String str = ((UpvoteListViewModelNew) aObserverS183S0200000_21.l1).LLILLJJLI;
        InterfaceC1360060lUq interfaceC1360060lUqGp = ((UpvoteVideoAssemNew) aObserverS183S0200000_21.l0).Gp();
        if (interfaceC1360060lUqGp != null) {
            interfaceC1360060lUqGp.LIZIZ(str);
        }
        ((UpvoteVideoAssemNew) aObserverS183S0200000_21.l0).wq(str);
    }

    public static final void onChanged$5(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        ((C1348790lCf) aObserverS183S0200000_21.l0).LJI((C197039127h) aObserverS183S0200000_21.l1);
    }

    public static final void onChanged$6(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        ((C1348790lCf) aObserverS183S0200000_21.l0).LJI((C197039127h) aObserverS183S0200000_21.l1);
    }

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
    public static final void onChanged$7(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) throws Throwable {
        List<Integer> listLJIIL;
        RelationSelectFragment relationSelectFragment;
        C0IAH c0iah = (C0IAH) obj;
        List<String> listLJIILIIL = null;
        Editable editableLLJILLL = null;
        if (c0iah instanceof C0IAD) {
            ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh1 = ((RelationSelectFragment) aObserverS183S0200000_21.l0).LLILLJJLI;
            if (viewOnTouchListenerC1367610lh1 != null && (relationSelectFragment = viewOnTouchListenerC1367610lh1.LLJJIJI) != null) {
                EditText editText = viewOnTouchListenerC1367610lh1.LLIZ;
                if (editText != null) {
                    editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzG3SDhT2DsSx9m1G5IYHvEV65AWt9aa4QI9Kz1aPtELX8/2BmGMdOtyuhi+AM=", null));
                }
                relationSelectFragment.LJJZZIII(String.valueOf(editableLLJILLL));
                return;
            }
            return;
        }
        if (c0iah instanceof C0IA9) {
            ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh12 = ((RelationSelectFragment) aObserverS183S0200000_21.l0).LLILLJJLI;
            if (viewOnTouchListenerC1367610lh12 != null) {
                AbstractC1368180lhw abstractC1368180lhw = ((RelationViewModel) aObserverS183S0200000_21.l1).LL;
                if (abstractC1368180lhw instanceof C1381810m3v) {
                    listLJIIL = ((C1381810m3v) abstractC1368180lhw).LJIIL();
                } else {
                    listLJIIL = null;
                }
                AbstractC1368180lhw abstractC1368180lhw2 = ((RelationViewModel) aObserverS183S0200000_21.l1).LL;
                if (abstractC1368180lhw2 instanceof C1381810m3v) {
                    listLJIILIIL = ((C1381810m3v) abstractC1368180lhw2).LJIILIIL();
                }
                viewOnTouchListenerC1367610lh12.LJI(listLJIIL, listLJIILIIL);
            }
            ViewOnTouchListenerC1367610lh1 viewOnTouchListenerC1367610lh13 = ((RelationSelectFragment) aObserverS183S0200000_21.l0).LLILLJJLI;
            if (viewOnTouchListenerC1367610lh13 == null) {
                return;
            }
            viewOnTouchListenerC1367610lh13.LJFF((List) ((C0IA9) c0iah).LIZ);
            return;
        }
        if (!(c0iah instanceof C0IAB)) {
            return;
        }
        c0iah.getClass();
        throw null;
    }

    public static final void onChanged$8(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        C1351440lGw c1351440lGw = (C1351440lGw) aObserverS183S0200000_21.l0;
        CommentContextSource commentContextSource = (CommentContextSource) aObserverS183S0200000_21.l1;
        int i = C1351440lGw.LLJJJJLIIL;
        c1351440lGw.LJIIL(null, commentContextSource, false);
    }

    public static final void onChanged$9(AObserverS183S0200000_21 aObserverS183S0200000_21, Object obj) {
        List list = (List) obj;
        C897520ZIw c897520ZIw = (C897520ZIw) ((C1368790liv) aObserverS183S0200000_21.l0).LLJILJIL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LJIIJJI(new C1356490lP5(list, null));
        }
        C1368790liv c1368790liv = (C1368790liv) aObserverS183S0200000_21.l0;
        ShareMoreViewModel shareMoreViewModel = (ShareMoreViewModel) aObserverS183S0200000_21.l1;
        ArrayList arrayList = new ArrayList(list);
        shareMoreViewModel.BQ2(arrayList);
        c1368790liv.LJFF().LLLJIL();
        if (!arrayList.isEmpty()) {
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (hashSet.add(C1055660dZs.LIZ((IMContact) obj2))) {
                    arrayList2.add(obj2);
                }
            }
            c1368790liv.LJFF().LLLIIIIL(arrayList2);
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = -1;
            if (c1368790liv.LIZJ().LJIJ) {
                int size = arrayList2.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (((IMContact) ListProtector.get(arrayList2, i)).getType() == 17) {
                        c118300cf.element = i + 1;
                        break;
                    }
                    i++;
                }
            }
            if (c118300cf.element != -1) {
                c1368790liv.LLJJIII = new ARunnableS79S0200000_10(c1368790liv, c118300cf, 81);
                RecyclerView recyclerView = c1368790liv.LLJILLL;
                if (recyclerView != null) {
                    HandlerHook.viewPostDelay(recyclerView, c1368790liv.LLJJIII, 100L);
                }
            }
            IInternalShareApi.LIZ.getClass();
            C1370970lmR.LIZ().LIZJ().LJIIL(c1368790liv.LIZJ().LIZ, C0I0B.LJFF.LIZIZ());
        }
    }

    public AObserverS183S0200000_21(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
