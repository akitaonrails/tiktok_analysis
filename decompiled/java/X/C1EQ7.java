package X;

import Y.ARunnableS25S1200000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.BaseHeader;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackStatusComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UrlStructComponent;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.analytics.IIMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.service.IShareStatusKeva;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.im.sharepanel.api.experiment.ForwardLimitSetting;
import com.ss.android.ugc.aweme.im.sharepanel.api.model.ScreenShotShareContent;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.ui.activity.RelationSelectActivity;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.controller.helper.ShareStateHelper;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.liveevent.LiveEventGuestShareDialog;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.screenshot.ScreenshotShareFragment;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.more.ShareMoreContactsContentFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.1EQ7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EQ7 extends C09AY implements Function0<C1365390ldR> {
    public C1EQ7() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ldR] */
    @Override // kotlin.jvm.functions.Function0
    public final C1365390ldR invoke() {
        return new InterfaceC1365380ldQ() { // from class: X.0ldR
            @Override // X.InterfaceC1365380ldQ
            public final void LJJIIZI() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.06p3] */
            @Override // X.InterfaceC1365380ldQ
            public final C1723906p3 LJIIJJI() {
                return new InterfaceC1371380ln6() { // from class: X.06p3
                    public C1369580lkC LIZ;

                    @Override // X.InterfaceC1371380ln6
                    public final C1369580lkC LIZJ() {
                        C1369580lkC c1369580lkC = this.LIZ;
                        if (c1369580lkC == null) {
                            return null;
                        }
                        return c1369580lkC;
                    }

                    @Override // X.InterfaceC1371380ln6
                    public final void onViewCreated(View view) {
                        boolean z;
                        UrlModel avatarThumb;
                        this.LIZ = (C1369580lkC) view.findViewById(R.id.uyu);
                        View viewFindViewById = view.findViewById(R.id.video_background);
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(16));
                        c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(16));
                        boolean z2 = false;
                        if (view.getLayoutDirection() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(5));
                            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(16));
                        } else {
                            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(5));
                        }
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1j);
                        viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
                        View viewFindViewById2 = view.findViewById(R.id.xl_);
                        C384050F3z c384050F3z2 = new C384050F3z();
                        if (view.getLayoutDirection() == 1) {
                            z2 = true;
                        }
                        if (z2) {
                            c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(20));
                            c384050F3z2.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(20));
                            c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(5));
                        } else {
                            c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(20));
                            c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(20));
                            c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(5));
                        }
                        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.ee);
                        viewFindViewById2.setBackground(c384050F3z2.LIZ(view.getContext()));
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, view.getContext());
                        if (numLIZJ != null) {
                            ((ImageView) view.findViewById(R.id.x2t)).setColorFilter(numLIZJ.intValue());
                        }
                        View viewFindViewById3 = view.findViewById(R.id.i07);
                        C384050F3z c384050F3z3 = new C384050F3z();
                        c384050F3z3.LIZIZ = Integer.valueOf(R.attr.a1p);
                        c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(1));
                        viewFindViewById3.setBackground(c384050F3z3.LIZ(view.getContext()));
                        View viewFindViewById4 = view.findViewById(R.id.uh0);
                        C384050F3z c384050F3z4 = new C384050F3z();
                        c384050F3z4.LIZIZ = Integer.valueOf(R.attr.a1p);
                        c384050F3z4.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(1));
                        viewFindViewById4.setBackground(c384050F3z4.LIZ(view.getContext()));
                        User currentUser = C0I0B.LJFF.LIZ().getCurrentUser();
                        if (currentUser != null) {
                            avatarThumb = currentUser.getAvatarThumb();
                        } else {
                            avatarThumb = null;
                        }
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarThumb));
                        c1331670kl3LJIIIIZZ.LJJIJLIJ = true;
                        c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) view.findViewById(R.id.bh2));
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    }

                    @Override // X.InterfaceC1371380ln6
                    public final View LIZIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return C786410Ut5.Td(layoutInflater, R.layout.cpj, viewGroup, false);
                    }
                };
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIIJ() {
                C1365330ldL.LIZ.getClass();
                C1365330ldL.LIZJ(null);
            }

            @Override // X.InterfaceC1365380ldQ
            public final List<C1723206ow> LJJIJL() {
                C1723106ov c1723106ov = C1723106ov.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("share_video_recent_records");
                sbLIZ.append(C1723106ov.LIZIZ());
                Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                synchronized (c1723106ov) {
                    List<C1723206ow> list = C1723106ov.LLILLJJLI;
                    if (list != null) {
                        return list;
                    }
                    if (C1723106ov.LLILLL == null) {
                        List<String> listLJJLL = C13LQ.LJJLL(repo.getStringArray("recent_video_share_targets", new String[0]));
                        ArrayList arrayList = new ArrayList();
                        for (String str : listLJJLL) {
                            C1723106ov c1723106ov2 = C1723106ov.LL;
                            C1723206ow c1723206owLIZJ = C1723106ov.LIZJ(str);
                            if (c1723206owLIZJ != null) {
                                arrayList.add(c1723206owLIZJ);
                            }
                        }
                        C1723106ov.LLILLL = arrayList;
                    }
                    if (C1723106ov.LLILLL.isEmpty()) {
                        return null;
                    }
                    List<C1723206ow> list2 = C1723106ov.LLILLL;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (C1723206ow c1723206ow : list2) {
                        EnumC1330205Im enumC1330205Im = c1723206ow.LIZ;
                        Object arrayList2 = linkedHashMap.get(enumC1330205Im);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(enumC1330205Im, arrayList2);
                        }
                        ((List) arrayList2).add(c1723206ow);
                    }
                    List list3 = (List) linkedHashMap.get(EnumC1330205Im.INTERNAL);
                    if (list3 == null) {
                        list3 = C13BV.INSTANCE;
                    }
                    List list4 = (List) linkedHashMap.get(EnumC1330205Im.EXTERNAL);
                    if (list4 == null) {
                        list4 = C13BV.INSTANCE;
                    }
                    if (list3.size() >= list4.size()) {
                        if (!list3.isEmpty()) {
                            C1723106ov.LLILLJJLI = list3.size() >= 3 ? C13LP.LJLJJLL(list3.subList(list3.size() - 3, list3.size())) : C13LP.LJLJJLL(list3);
                        }
                    } else if (!list4.isEmpty()) {
                        C1723106ov.LLILLJJLI = Collections.singletonList(ListProtector.get(list4, list4.size() - 1));
                    }
                    return C1723106ov.LLILLJJLI;
                }
            }

            @Override // X.InterfaceC1365380ldQ
            public final InterfaceC1368700lim LJJJJIZL() {
                return C1367930lhX.LIZ(InterfaceC1368700lim.LJLJJL, C13BV.INSTANCE, true, true, C0ZNY.LIZJ(), null, false, false, true, true, false, true, 1088);
            }

            @Override // X.InterfaceC1365380ldQ
            public final boolean LJJIII() {
                return (C296800BkE.LIZ() == 3 || C296800BkE.LIZ() == 4) && !C294930BhD.LIZ();
            }

            @Override // X.InterfaceC1365380ldQ
            public final boolean LIZ(String str) {
                if (((IShareStatusKeva) ServiceManager.get().getService(IShareStatusKeva.class)).LIZJ(str) == 1) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LIZJ(List<? extends C869590Y9l> list) {
                ArrayList<String> arrayList = C805520Vio.LIZ;
                C805520Vio c805520VioLIZ = C805530Vip.LIZ();
                c805520VioLIZ.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (C869590Y9l c869590Y9l : (ArrayList) list) {
                    if (((Boolean) C2276521E8s.LIZJ.getValue()).booleanValue() && C0ZDX.LJJJJIZL(c869590Y9l)) {
                        arrayList2.add(c869590Y9l);
                    }
                    if (((Boolean) C2276521E8s.LIZLLL.getValue()).booleanValue() && !C0ZDX.LJJJJIZL(c869590Y9l)) {
                        arrayList2.add(c869590Y9l);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    String strValueOf = String.valueOf(C0YNP.LJII(((C869590Y9l) it2.next()).getConversationId()));
                    IMUser iMUser = new IMUser();
                    iMUser.setUid(strValueOf);
                    arrayList3.add(iMUser);
                }
                c805520VioLIZ.LIZLLL("recent link share", "default", C13LP.LJJJJI(arrayList3));
            }

            @Override // X.InterfaceC1365380ldQ
            public final String LJ(EnumC896890ZGl enumC896890ZGl) {
                switch (C896900ZGm.LIZIZ[enumC896890ZGl.ordinal()]) {
                    case 1:
                    case 6:
                        return "quick_reply";
                    case 2:
                    case 7:
                        return "quick_reply_auto";
                    case 3:
                    case 4:
                        return "quick_reply_cell";
                    case 5:
                    default:
                        return "quick_reply_pannel";
                    case 8:
                        return "recommend_panel";
                    case BdTuring.TYPE_ECAF /* 9 */:
                        return "story_exposed_emoji";
                }
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJFF(C869590Y9l c869590Y9l) {
                ArrayList<String> arrayList = C805520Vio.LIZ;
                C805520Vio c805520VioLIZ = C805530Vip.LIZ();
                c805520VioLIZ.getClass();
                if (c869590Y9l.getMsgStatus() == 2) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ.plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 4)), null, new C805500Vim(c869590Y9l, c805520VioLIZ, null), 2);
                }
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJIIIIZZ(C869590Y9l c869590Y9l) {
                AwemeCardTemplate awemeCardTemplate;
                BaseRequestComponent baseRequestComponent;
                QueryDataComponent queryDataComponent;
                String str;
                Integer numLJIIJJI;
                if (c869590Y9l.getMsgStatus() == 2 && c869590Y9l.getMsgType() == 1809 && (awemeCardTemplate = (AwemeCardTemplate) C2241931Cox.LIZJ(c869590Y9l, AwemeCardTemplate.class)) != null && (baseRequestComponent = awemeCardTemplate.baseRequestComponent) != null && (queryDataComponent = baseRequestComponent.queryData) != null && (str = queryDataComponent.extras.get("forward_limit_label_category")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                    int i = 0;
                    if (numLJIIJJI.intValue() > 0) {
                        int iIntValue = numLJIIJJI.intValue();
                        C0Z7O c0z7o = C0Z7O.LL;
                        String str2 = queryDataComponent.resourceID;
                        synchronized (c0z7o) {
                            if (ForwardLimitSetting.LIZIZ(iIntValue) > 0) {
                                Keva kevaLIZIZ = c0z7o.LIZIZ();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("count");
                                sbLIZ.append(str2);
                                int i2 = kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
                                Keva kevaLIZIZ2 = c0z7o.LIZIZ();
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("expired_time");
                                sbLIZ2.append(str2);
                                if (kevaLIZIZ2.getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L) >= System.currentTimeMillis()) {
                                    i = i2;
                                    if (i2 == 0) {
                                    }
                                    Keva kevaLIZIZ3 = c0z7o.LIZIZ();
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("count");
                                    sbLIZ3.append(str2);
                                    kevaLIZIZ3.storeInt(C2188811AlT.LIZIZ(sbLIZ3), i + 1);
                                }
                                int i3 = ((ForwardLimitSetting.ForwardLimitConfig) ForwardLimitSetting.LIZIZ.getValue()).expiredDays;
                                Keva kevaLIZIZ4 = c0z7o.LIZIZ();
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("expired_time");
                                sbLIZ4.append(str2);
                                kevaLIZIZ4.storeLong(C2188811AlT.LIZIZ(sbLIZ4), System.currentTimeMillis() + TimeUnit.DAYS.toMillis(i3));
                                Keva kevaLIZIZ32 = c0z7o.LIZIZ();
                                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                                sbLIZ32.append("count");
                                sbLIZ32.append(str2);
                                kevaLIZIZ32.storeInt(C2188811AlT.LIZIZ(sbLIZ32), i + 1);
                            }
                        }
                    }
                }
            }

            @Override // X.InterfaceC1365380ldQ
            public final boolean LJIIIZ(ScreenShotShareContent screenShotShareContent) {
                C1366560lfK.LL.getClass();
                return C1366560lfK.LIZ(screenShotShareContent);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJIJI(boolean z) {
                String str;
                C1366570lfL.LL.LIZJ();
                C1366320lew c1366320lew = C1366320lew.LIZ;
                c1366320lew.getClass();
                String strLIZLLL = C1366320lew.LIZLLL();
                if (z) {
                    str = "auto_dismiss";
                } else {
                    str = "dismiss";
                }
                C1366320lew.LIZ(c1366320lew, strLIZLLL, str);
            }

            @Override // X.InterfaceC1365380ldQ
            public final DialogC1369410ljv LJJ(Activity activity) {
                return new DialogC1369410ljv(activity);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJI(List<String> list) {
                C1723106ov.LIZ(list);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIFFI(String str) {
                C1723106ov c1723106ov = C1723106ov.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("share_video_recent_records");
                sbLIZ.append(C1723106ov.LIZIZ());
                Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                C054G c054gLIZ = C2296808zG.LIZ(C0PEM.LIZJ);
                C1723106ov.LLILLJJLI = null;
                C23250099c.LIZLLL(c054gLIZ, null, null, new C1330105Il(str, repo, null), 3);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIJIIJI(List<? extends IMContact> list) {
                ArrayList<String> arrayList = C805520Vio.LIZ;
                C805530Vip.LIZ().LIZLLL("recent share", "default", list);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJJJJL(List<String> list) {
                C1723106ov c1723106ov = C1723106ov.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("share_video_recent_records");
                sbLIZ.append(C1723106ov.LIZIZ());
                Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty()) {
                    C1723106ov.LLILLJJLI = null;
                    String[] stringArray = repo.getStringArray("recent_video_share_targets", new String[0]);
                    ArrayList<String> arrayList2 = new ArrayList();
                    C089E c089e = new C089E(stringArray);
                    while (c089e.hasNext()) {
                        String str = (String) c089e.next();
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (a0.LJJIIZI(str, (String) it2.next(), false)) {
                                    break;
                                }
                            } else {
                                arrayList2.add(str);
                                break;
                            }
                        }
                    }
                    repo.storeStringArray("recent_video_share_targets", (String[]) arrayList2.toArray(new String[0]));
                    ArrayList arrayList3 = new ArrayList();
                    for (String str2 : arrayList2) {
                        C1723106ov c1723106ov2 = C1723106ov.LL;
                        C1723206ow c1723206owLIZJ = C1723106ov.LIZJ(str2);
                        if (c1723206owLIZJ != null) {
                            arrayList3.add(c1723206owLIZJ);
                        }
                    }
                    C1723106ov.LLILLL = arrayList3;
                }
            }

            public static C1365430ldV LJJJLL(EnumC896890ZGl enumC896890ZGl, C0ZH0 c0zh0) {
                boolean z;
                BaseContent.ReferenceSceneType referenceSceneType;
                boolean z2 = true;
                if (enumC896890ZGl == EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE) {
                    z = true;
                } else {
                    z = false;
                }
                switch (C896900ZGm.LIZIZ[enumC896890ZGl.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    default:
                        z2 = false;
                        break;
                }
                if (c0zh0 == C0ZH0.REPOST) {
                    referenceSceneType = BaseContent.ReferenceSceneType.REPLY_TO_REPOST;
                } else {
                    referenceSceneType = null;
                }
                return new C1365430ldV(z, z2, referenceSceneType);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LIZIZ(Context context, Bundle bundle) {
                String str = RelationSelectActivity._pnsPageId;
                C334250D8l.LIZ(context, bundle);
            }

            @Override // X.InterfaceC1365380ldQ
            public final boolean LIZLLL(View view, C869590Y9l c869590Y9l) {
                AwemeCardTemplate awemeCardTemplate;
                BaseTemplate baseTemplateLIZ = C0Z2Z.LIZ(c869590Y9l, BaseTemplate.class);
                if ((baseTemplateLIZ instanceof AwemeCardTemplate) && (awemeCardTemplate = (AwemeCardTemplate) baseTemplateLIZ) != null) {
                    return LJJJJL(view, awemeCardTemplate);
                }
                return true;
            }

            @Override // X.InterfaceC1365380ldQ
            public final BaseContent.ReferenceSceneType LJI(EnumC896890ZGl enumC896890ZGl, C0ZH0 c0zh0) {
                return LJJJLL(enumC896890ZGl, c0zh0).LIZJ;
            }

            @Override // X.InterfaceC1365380ldQ
            public final int LJIIL(int i, String str) {
                C0Z7O c0z7o = C0Z7O.LL;
                synchronized (c0z7o) {
                    if (ForwardLimitSetting.LIZIZ(i) < 0) {
                        return -1;
                    }
                    int iLIZIZ = ForwardLimitSetting.LIZIZ(i);
                    Keva kevaLIZIZ = c0z7o.LIZIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("count");
                    sbLIZ.append(str);
                    return Math.max(0, iLIZIZ - kevaLIZIZ.getInt(C2188811AlT.LIZIZ(sbLIZ), 0));
                }
            }

            @Override // X.InterfaceC1365380ldQ
            public final AttachmentTypeComponent LJIIZILJ(EnumC896890ZGl enumC896890ZGl, C0ZH0 c0zh0) {
                BaseContent.ReferenceSceneType referenceSceneType = LJJJLL(enumC896890ZGl, c0zh0).LIZJ;
                if (referenceSceneType != null) {
                    switch (C896900ZGm.LIZ[referenceSceneType.ordinal()]) {
                        case -1:
                        case 6:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            return null;
                        case 0:
                        default:
                            throw new C1954807lC();
                        case 1:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_DEFAULT;
                        case 2:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_LIKE;
                        case 3:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_FAVOURITE;
                        case 4:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_NUDGE_REPOST;
                        case 5:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_REPLY_REPOST;
                        case 7:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_POST;
                        case 8:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_RECENT_ACTIVITY_REPLY_REPOST;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_REPLY_REPOST;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_SHARED_REPOST;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            return AttachmentTypeComponent.ATTACHMENT_TYPE_STORY_REPLY;
                    }
                }
                return null;
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJIJ(long j, String str) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2216308mH(j, str, null), 3);
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZJ().LJIILL(j);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJII(C19EG c19eg, String str) {
                C1366320lew c1366320lew = C1366320lew.LIZ;
                c1366320lew.getClass();
                String strLIZLLL = C1366320lew.LIZLLL();
                C1366570lfL.LL.LIZLLL();
                C1366320lew.LIZ(c1366320lew, strLIZLLL, "share");
                String str2 = ScreenshotShareFragment._pnsPageId;
                C1366300leu.LIZ(c19eg, str, strLIZLLL, new InterfaceC1366350lez() { // from class: X.0ldW
                    @Override // X.InterfaceC1366350lez
                    public final SharePackage LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC1366350lez
                    public final boolean LIZIZ() {
                        return false;
                    }

                    @Override // X.InterfaceC1366350lez
                    public final InterfaceC1366340ley LIZLLL() {
                        return null;
                    }

                    @Override // X.InterfaceC1366350lez
                    public final boolean LIZJ() {
                        return C1366580lfM.LIZIZ();
                    }
                });
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIIZ(Fragment fragment, C1365870leD c1365870leD) {
                C345270DgD.LIZ.getClass();
                C345270DgD.LIZIZ(fragment, c1365870leD, null);
            }

            @Override // X.InterfaceC1365380ldQ
            public final boolean LJJJJJ(int i, String str) {
                return !C0Z7O.LL.LIZ(i, str);
            }

            @Override // X.InterfaceC1365380ldQ
            public final boolean LJJJJL(View view, AwemeCardTemplate awemeCardTemplate) {
                Integer numLJIIJJI;
                QueryDataComponent queryDataComponent = awemeCardTemplate.baseRequestComponent.queryData;
                String str = queryDataComponent.extras.get("forward_limit_label_category");
                if (str != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && numLJIIJJI.intValue() > 0) {
                    if (!C0Z7O.LL.LIZ(numLJIIJJI.intValue(), queryDataComponent.resourceID)) {
                        C1389890mGx c1389890mGx = new C1389890mGx(view);
                        c1389890mGx.LJIIIZ(2131847840);
                        c1389890mGx.LJIIJJI();
                        return false;
                    }
                }
                return true;
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJJJLI(SharePackage sharePackage, IMContact iMContact) {
                C1365330ldL.LIZ.getClass();
                C1365330ldL.LIZIZ(sharePackage, iMContact, "");
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJJLIIL(C19EG c19eg, C1372780lpM c1372780lpM) {
                SharePackage sharePackage;
                C1371590lnR c1371590lnRLJIJJ = C621180OYa.LIZ.LJIJJ(c19eg, c1372780lpM);
                c1371590lnRLJIJJ.LJJJJL = Boolean.FALSE;
                final C0DYN c0dyn = new C0DYN(C2222691Bz1.LIZIZ().toLowerCase(Locale.getDefault()));
                BaseSharePackage baseSharePackage = c1371590lnRLJIJJ.LJIJJ;
                if ((baseSharePackage instanceof SharePackage) && (sharePackage = (SharePackage) baseSharePackage) != null) {
                    IMSharePanelApi.LIZ.getClass();
                    DialogC1389100mFg dialogC1389100mFgLJJJJZ = C1599690rjL.LIZ().getShareService().LJJJJZ(c19eg, sharePackage, null, null, true, new InterfaceC1365250ldD() { // from class: X.0ldS
                        @Override // X.InterfaceC1365250ldD
                        public final void LIZIZ(HashMap<String, String> map) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LIZJ(Dialog dialog, SharePackage sharePackage2) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJFF(SharePackage sharePackage2) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJII(Dialog dialog, SharePackage sharePackage2) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJIIIIZZ() {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LIZLLL() {
                            C0DYN c0dyn2 = c0dyn;
                            Function2<String, Map<String, String>, Unit> function2 = c0dyn2.LIZIZ;
                            C2344009Gk c2344009GkLIZ = c0dyn2.LIZ();
                            c2344009GkLIZ.LJIIIIZZ("button_name", "search");
                            function2.invoke("tt_dm_panel_click", c2344009GkLIZ.LIZ);
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJI(SharePackage sharePackage2) {
                            C0DYN c0dyn2 = c0dyn;
                            Function2<String, Map<String, String>, Unit> function2 = c0dyn2.LIZIZ;
                            C2344009Gk c2344009GkLIZ = c0dyn2.LIZ();
                            c2344009GkLIZ.LJIIIIZZ("button_name", "send");
                            c2344009GkLIZ.LIZJ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            function2.invoke("tt_dm_panel_click", c2344009GkLIZ.LIZ);
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJIIIZ(SharePackage sharePackage2) {
                            C0DYN c0dyn2 = c0dyn;
                            Function2<String, Map<String, String>, Unit> function2 = c0dyn2.LIZIZ;
                            C2344009Gk c2344009GkLIZ = c0dyn2.LIZ();
                            c2344009GkLIZ.LJIIIIZZ("button_name", "close");
                            function2.invoke("tt_dm_panel_click", c2344009GkLIZ.LIZ);
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJIIJ(SharePackage sharePackage2, List<? extends IMContact> list) {
                            C0DYN c0dyn2 = c0dyn;
                            Function2<String, Map<String, String>, Unit> function2 = c0dyn2.LIZIZ;
                            C2344009Gk c2344009GkLIZ = c0dyn2.LIZ();
                            c2344009GkLIZ.LJIIIIZZ("button_name", "send");
                            c2344009GkLIZ.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                            function2.invoke("tt_dm_panel_click", c2344009GkLIZ.LIZ);
                        }
                    }, false, null, false, true, false, false, c1371590lnRLJIJJ.LJJJJL, false, false, false, null);
                    if (dialogC1389100mFgLJJJJZ != null) {
                        PopupManager.LIZJ(C0TSH.class);
                        PopupManager.LJIJI(new C0TSH(c19eg, dialogC1389100mFgLJJJJZ, new AwS565S0100000_21(c0dyn, 1349)), true);
                    }
                }
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJIILIIL(List list, GroupSharePackage groupSharePackage, String str) {
                C1365330ldL.LJ(C1365330ldL.LIZ, list, "", groupSharePackage, null, null, null, null, null, str, null, null, false, null, 6288);
            }

            @Override // X.InterfaceC1365380ldQ
            public final boolean LJIILJJIL(C19EG c19eg, String str, C1366620lfQ c1366620lfQ) {
                String str2 = ScreenshotShareFragment._pnsPageId;
                return C1366300leu.LIZ(c19eg, str, "live", c1366620lfQ);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJIL(Context context, View view, C1365870leD c1365870leD) {
                C1389910mGz c1389910mGzLIZ;
                C345270DgD.LIZ.getClass();
                if (context != null && view != null && c1365870leD != null && (c1389910mGzLIZ = C345270DgD.LIZ(new C1389910mGz(view), view, context, c1365870leD, null)) != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0CSS(c1389910mGzLIZ, null), 3);
                }
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIIJZLJL(Fragment fragment, C1365870leD c1365870leD, int i) {
                C345270DgD c345270DgD = C345270DgD.LIZ;
                Integer numValueOf = Integer.valueOf(i);
                c345270DgD.getClass();
                C345270DgD.LIZIZ(fragment, c1365870leD, numValueOf);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIJ(TextContent textContent, TextContent textContent2, SharePackage sharePackage) {
                C1365330ldL.LIZ.getClass();
                C1365330ldL.LJIIL(textContent, textContent2, sharePackage);
            }

            @Override // X.InterfaceC1365380ldQ
            public final AttachmentComponent LJJJJI(Aweme aweme, AttachmentTypeComponent attachmentTypeComponent, User user) {
                long j;
                long jLongValue;
                List<String> urlList;
                long j2;
                UrlModel cover;
                if (aweme == null || user == null) {
                    return null;
                }
                String aid = aweme.getAid();
                String uid = user.getUid();
                if (uid != null) {
                    j = CastLongProtector.parseLong(uid);
                } else {
                    j = -1;
                }
                Long lLJIILIIL = C2095008Iq.LJIILIIL(AwemeExtKt.getAuthorUid(aweme));
                if (lLJIILIIL != null) {
                    jLongValue = lLJIILIIL.longValue();
                } else {
                    jLongValue = -1;
                }
                Video video = aweme.getVideo();
                if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                    urlList = C13BV.INSTANCE;
                }
                UrlStructComponent urlStructComponent = new UrlStructComponent(urlList);
                int awemeType = aweme.getAwemeType();
                boolean isTikTokStory = aweme.getIsTikTokStory();
                FallbackStatusComponent fallbackStatusComponent = FallbackStatusComponent.UNKNOWN;
                Story story = aweme.getStory();
                if (story != null) {
                    j2 = story.expiredAt;
                } else {
                    j2 = 0;
                }
                return new AttachmentComponent(attachmentTypeComponent, aid, j, jLongValue, urlStructComponent, awemeType, isTikTokStory, fallbackStatusComponent, j2);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIJIL(Context context, IMContact iMContact, SharePackage sharePackage, C0U3R<Boolean> c0u3r) {
                C1365330ldL.LIZ.LJIIJ(Collections.singletonList(iMContact), sharePackage, c0u3r);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIJLIJ(InterfaceC1362600lYw interfaceC1362600lYw, SharePackage sharePackage, String str, List list) {
                C1365220ldA.LIZ.getClass();
                ShareStateHelper.LIZJ(sharePackage, ((IIMAnalyticsUtil) ServiceManager.get().getService(IIMAnalyticsUtil.class)).LJII(), list);
                if (interfaceC1362600lYw != null) {
                    ((ArrayList) list).size();
                    interfaceC1362600lYw.LJIIL(sharePackage);
                    interfaceC1362600lYw.LIZ(sharePackage);
                }
                ArrayList<String> arrayList = C805520Vio.LIZ;
                C805530Vip.LIZ().LIZLLL("recent share", "default", list);
                ExecutorService executorServiceLIZLLL = C823050WQl.LIZLLL();
                if (executorServiceLIZLLL != null) {
                    executorServiceLIZLLL.submit(new ARunnableS25S1200000_21(list, str, interfaceC1362600lYw, 1));
                }
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIZ(Context context, List list, SharePackage sharePackage, C740840T4g c740840T4g) {
                C1365330ldL.LIZ.LJIIJ(list, sharePackage, c740840T4g);
            }

            @Override // X.InterfaceC1365380ldQ
            public final LiveEventGuestShareDialog LJIJJLI(Activity activity, LiveEventSharePackage liveEventSharePackage, String str, long j, Pair pair) {
                if (!((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin()) {
                    DialogC1369410ljv dialogC1369410ljv = new DialogC1369410ljv(activity);
                    dialogC1369410ljv.show();
                    C785410UrT.LIZIZ(dialogC1369410ljv);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(dialogC1369410ljv);
                    C816490W1f.LIZ(dialogC1369410ljv);
                    return null;
                }
                return new LiveEventGuestShareDialog(activity, liveEventSharePackage, str, j, pair);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIJIIJIL(SharePackage sharePackage, String str, List<? extends IMContact> list, Map<String, String> map, boolean z, InterfaceC1362600lYw interfaceC1362600lYw) {
                C1365220ldA c1365220ldA = C1365220ldA.LIZ;
                Map mapLJ = C2097608Jq.LJ();
                c1365220ldA.getClass();
                C1365220ldA.LJII(sharePackage, str, list, interfaceC1362600lYw, null, null, map, z, null, mapLJ);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJIL(String str, Aweme aweme, String str2, String str3, Map map, C896860ZGi c896860ZGi) {
                String strLJII;
                String str4 = str2;
                C1365330ldL c1365330ldL = C1365330ldL.LIZ;
                c1365330ldL.getClass();
                IIMAnalyticsUtil iIMAnalyticsUtil = (IIMAnalyticsUtil) PluggableExtentionKt.pluggableSpi$default(IIMAnalyticsUtil.class, false, false, false, 14, null);
                if (iIMAnalyticsUtil != null) {
                    strLJII = iIMAnalyticsUtil.LJII();
                } else {
                    strLJII = null;
                }
                C2201941BFw c2201941BFw = IMUser.Companion;
                User author = aweme.getAuthor();
                c2201941BFw.getClass();
                List listSingletonList = Collections.singletonList(C2201941BFw.LIZJ(author));
                C1370940lmO c1370940lmO = new C1370940lmO();
                c1370940lmO.LIZ = "text";
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                C786410Ut5.LJJJI("enter_from", str4, c1370940lmO.LJII);
                C786410Ut5.LJJJI("enter_method", str3, c1370940lmO.LJII);
                String aid = aweme.getAid();
                if (aid != null) {
                    str5 = aid;
                }
                C786410Ut5.LJJJI("aid", str5, c1370940lmO.LJII);
                C1365330ldL.LJ(c1365330ldL, listSingletonList, "", new SharePackage(c1370940lmO), TextContent.Companion.obtain(str, aweme, null, null, null, null), null, null, map, null, strLJII, null, c896860ZGi, false, null, 6832);
            }

            @Override // X.InterfaceC1365380ldQ
            public final Map<String, String> LJIILLIIL(Aweme aweme, String str, String str2, String str3, String str4, BaseContent.ReferenceSceneType referenceSceneType, InterfaceC714750S1x interfaceC714750S1x, Map<String, String> map) {
                C1365330ldL.LIZ.getClass();
                return C1365330ldL.LIZ(aweme, str, str2, str3, str4, referenceSceneType, interfaceC714750S1x, map);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJJJZI(List list, String str, SharePackage sharePackage, Map map, Map map2, String str2, C1365050lct c1365050lct, InterfaceC1362600lYw interfaceC1362600lYw, List list2) {
                C1365330ldL.LIZ.LJI(list, str, sharePackage, null, map, map2, null, str2, false, c1365050lct, interfaceC1362600lYw, list2);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJII(final String str, User user, C0Y8T c0y8t, Aweme aweme, String str2, EnumC896890ZGl enumC896890ZGl, String str3, C0ZH0 c0zh0, String str4, final Function1<? super CharSequence, Unit> function1) {
                boolean z;
                boolean z2;
                BaseContent.ReferenceSceneType referenceSceneType;
                boolean z3 = false;
                if (enumC896890ZGl == EnumC896890ZGl.TYPE_STORY_QUICK_ENTRANCE) {
                    z = true;
                } else {
                    z = false;
                }
                int i = C896900ZGm.LIZIZ[enumC896890ZGl.ordinal()];
                if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (c0zh0 == C0ZH0.REPOST) {
                    referenceSceneType = BaseContent.ReferenceSceneType.REPLY_TO_REPOST;
                } else {
                    referenceSceneType = null;
                }
                C1365330ldL c1365330ldL = C1365330ldL.LIZ;
                String strLJ = LJ(enumC896890ZGl);
                if (z || z2) {
                    z3 = true;
                }
                c1365330ldL.LJIIIZ(c0y8t, aweme, referenceSceneType, new InterfaceC1361990lXx() { // from class: X.0ldU
                    @Override // X.InterfaceC1361990lXx
                    public final /* synthetic */ void LIZIZ(HashMap map) {
                    }

                    @Override // X.InterfaceC1361990lXx
                    public final void LIZ() {
                        Function1<CharSequence, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(str);
                        }
                    }
                }, user, Boolean.valueOf(z3), str, str2, strLJ, str3, str4, z);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJJJLL(C0Y8T c0y8t, Aweme aweme, C896870ZGj c896870ZGj, Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z) {
                C1365330ldL.LIZ.LJIIIZ(c0y8t, aweme, null, c896870ZGj, null, bool, str, str2, str3, str4, str5, z);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJJ(final SharePackage sharePackage, final String str, final List<? extends IMContact> list, final InterfaceC1362600lYw interfaceC1362600lYw, int i, BaseContent baseContent, Map<String, String> map, Map<String, String> map2, boolean z, Integer num, Map<String, ? extends List<RichTextInfo>> map3) {
                if (i != 1) {
                    if (i == 2) {
                        C1365220ldA.LIZ.getClass();
                        IInternalShareApi.LIZ.getClass();
                        C1370970lmR.LIZ().LIZIZ().LJJIZ(list);
                        final String strLJII = ((IIMAnalyticsUtil) ServiceManager.get().getService(IIMAnalyticsUtil.class)).LJII();
                        SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
                        C786410Ut5.LJJJI("source", "share", sharePackage.extras);
                        C1365220ldA.LJIIL(sharePackage, list);
                        if (sendMessageTemplateTask != null) {
                            Map<String, String> mapLJFF = C1365220ldA.LJFF(sharePackage);
                            C1365220ldA.LJIIJJI(sendMessageTemplateTask, sharePackage, mapLJFF);
                            C1336205Ku.LIZ(false).getSendMessageTemplateService().LIZ(list, sendMessageTemplateTask, str, mapLJFF, null, null, new C1365180ld6(interfaceC1362600lYw, sharePackage, str, list), false, null);
                            C1365220ldA.LJIIIZ(sharePackage, sendMessageTemplateTask.sendMessageEventParcel, list, null);
                            if (Intrinsics.LJFF(sendMessageTemplateTask.scene, "now_post")) {
                                C1370970lmR.LIZ().LIZJ().LJIILLIIL(sharePackage, str, new ArrayList(list), System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
                                return;
                            }
                            return;
                        }
                        if (interfaceC1362600lYw != null) {
                            interfaceC1362600lYw.LJFF(sharePackage);
                        }
                        InterfaceC1361990lXx interfaceC1361990lXx = new InterfaceC1361990lXx() { // from class: X.0ld7
                            @Override // X.InterfaceC1361990lXx
                            public final void LIZ() {
                                ShareStateHelper.LIZJ(sharePackage, strLJII, list);
                                InterfaceC1362600lYw interfaceC1362600lYw2 = interfaceC1362600lYw;
                                if (interfaceC1362600lYw2 != null) {
                                    SharePackage sharePackage2 = sharePackage;
                                    list.size();
                                    interfaceC1362600lYw2.LJIIL(sharePackage2);
                                }
                                InterfaceC1362600lYw interfaceC1362600lYw3 = interfaceC1362600lYw;
                                if (interfaceC1362600lYw3 != null) {
                                    interfaceC1362600lYw3.LIZ(sharePackage);
                                }
                                IInternalShareApi.LIZ.getClass();
                                C1370970lmR.LIZ().LIZJ().LJIILLIIL(sharePackage, str, new ArrayList(list), System.currentTimeMillis(), C0I0B.LJFF.LIZIZ(), -1);
                                C1365220ldA c1365220ldA = C1365220ldA.LIZ;
                                List<IMContact> list2 = list;
                                c1365220ldA.getClass();
                                ArrayList<String> arrayList = C805520Vio.LIZ;
                                C805530Vip.LIZ().LIZLLL("recent share", "default", list2);
                            }

                            @Override // X.InterfaceC1361990lXx
                            public final void LIZIZ(HashMap<String, String> map4) {
                                InterfaceC1362600lYw interfaceC1362600lYw2 = interfaceC1362600lYw;
                                if (interfaceC1362600lYw2 != null) {
                                    interfaceC1362600lYw2.LIZIZ(map4);
                                }
                            }
                        };
                        ArrayList arrayList = new ArrayList();
                        for (IMContact iMContact : list) {
                            if (iMContact instanceof IMConversation) {
                                arrayList.add(iMContact);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            C1365330ldL.LJ(C1365330ldL.LIZ, list, str, sharePackage, null, null, C2097908Jt.LIZJ(new Pair("panel_source", "long_press")), C1365220ldA.LJFF(sharePackage), null, strLJII, null, interfaceC1361990lXx, false, null, 6808);
                            return;
                        } else {
                            C1365330ldL.LIZ.LJI(list, str, sharePackage, null, C2097908Jt.LIZJ(new Pair("panel_source", "long_press")), C1365220ldA.LJFF(sharePackage), null, strLJII, false, interfaceC1361990lXx, null, null);
                            return;
                        }
                    }
                    return;
                }
                C1365220ldA.LIZ.getClass();
                C1365220ldA.LJII(sharePackage, str, list, interfaceC1362600lYw, baseContent, map, map2, z, num, map3);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJJI(final String str, User user, Aweme aweme, String str2, EnumC896890ZGl enumC896890ZGl, String str3, C0ZH0 c0zh0, String str4, boolean z, Map<String, String> map, final Function1<? super CharSequence, Unit> function1) {
                boolean z2;
                boolean z3;
                C1365430ldV c1365430ldVLJJJLL = LJJJLL(enumC896890ZGl, c0zh0);
                boolean z4 = c1365430ldVLJJJLL.LIZ;
                boolean z5 = c1365430ldVLJJJLL.LIZIZ;
                BaseContent.ReferenceSceneType referenceSceneType = c1365430ldVLJJJLL.LIZJ;
                TextContent textContentObtainShareReplyContent = TextContent.Companion.obtainShareReplyContent(str, user, aweme, referenceSceneType);
                C1365330ldL c1365330ldL = C1365330ldL.LIZ;
                IMUser.Companion.getClass();
                IMUser iMUserLIZJ = C2201941BFw.LIZJ(user);
                if (iMUserLIZJ == null) {
                    return;
                }
                String strLJ = LJ(enumC896890ZGl);
                if (!z4 && !z5) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                if (!z4 && !z) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                C1365330ldL.LJIIIIZZ(c1365330ldL, textContentObtainShareReplyContent, null, iMUserLIZJ, aweme, str2, strLJ, str3, boolValueOf, z3, str4, referenceSceneType, null, map, new InterfaceC1361990lXx() { // from class: X.0ldT
                    @Override // X.InterfaceC1361990lXx
                    public final /* synthetic */ void LIZIZ(HashMap map2) {
                    }

                    @Override // X.InterfaceC1361990lXx
                    public final void LIZ() {
                        Function1<CharSequence, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(str);
                        }
                    }
                }, 10242);
            }

            @Override // X.InterfaceC1365380ldQ
            public final DialogC1366380lf2 LJIIJ(Activity activity, InterfaceC1365250ldD interfaceC1365250ldD, SharePackage sharePackage, BaseContent baseContent, Map map, Map map2, Map map3, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0) {
                String string;
                Bundle bundle = sharePackage.extras;
                if (bundle != null && (string = bundle.getString("panel_source")) != null) {
                    if (map3 != null) {
                        map3.put("panel_source", string);
                    }
                    if (map2 != null) {
                        map2.put("panel_source", string);
                    }
                }
                return new DialogC1366380lf2(activity, C08CX.INSTANCE, interfaceC1365250ldD, sharePackage, baseContent, map, map2, map3, z, z2, z3, z4, function0);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJIJJ(String str, StickerTemplate stickerTemplate, User user, Aweme aweme, String str2, String str3, String str4, Boolean bool, boolean z, BaseContent.ReferenceSceneType referenceSceneType, String str5, InterfaceC714750S1x interfaceC714750S1x, Map map, InterfaceC1361990lXx interfaceC1361990lXx) {
                TextContent textContentObtainShareReplyContent = null;
                if (C817650W5r.LIZ(aweme)) {
                    if (str != null) {
                        textContentObtainShareReplyContent = TextContent.Companion.obtainShareReplyContent(str, user, (Aweme) null, referenceSceneType);
                    }
                } else if (str != null) {
                    textContentObtainShareReplyContent = TextContent.Companion.obtainShareReplyContent(str, user, aweme, referenceSceneType);
                }
                C1365330ldL c1365330ldL = C1365330ldL.LIZ;
                IMUser.Companion.getClass();
                IMUser iMUserLIZJ = C2201941BFw.LIZJ(user);
                if (iMUserLIZJ == null) {
                    return;
                }
                C1365330ldL.LJIIIIZZ(c1365330ldL, textContentObtainShareReplyContent, stickerTemplate, iMUserLIZJ, aweme, str2, str3, str4, bool, z, str5, referenceSceneType, interfaceC714750S1x, map, interfaceC1361990lXx, 8192);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJJJIL(final String str, IMUser iMUser, Aweme aweme, String str2, EnumC896890ZGl enumC896890ZGl, String str3, C0ZH0 c0zh0, String str4, boolean z, InterfaceC714750S1x interfaceC714750S1x, final Function1<? super CharSequence, Unit> function1, Map<String, String> map, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
                boolean z2;
                boolean z3;
                C1365430ldV c1365430ldVLJJJLL = LJJJLL(enumC896890ZGl, c0zh0);
                boolean z4 = c1365430ldVLJJJLL.LIZ;
                boolean z5 = c1365430ldVLJJJLL.LIZIZ;
                BaseContent.ReferenceSceneType referenceSceneType = c1365430ldVLJJJLL.LIZJ;
                TextContent textContentObtainShareReplyContent = TextContent.Companion.obtainShareReplyContent(str, iMUser.getUid(), iMUser.getSecUid(), aweme, referenceSceneType, featureAttachmentContent, baseHeader);
                C1365330ldL c1365330ldL = C1365330ldL.LIZ;
                String strLJ = LJ(enumC896890ZGl);
                if (!z4 && !z5) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                if (!z4 && !z) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                C1365330ldL.LJIIIIZZ(c1365330ldL, textContentObtainShareReplyContent, null, iMUser, aweme, str2, strLJ, str3, boolValueOf, z3, str4, referenceSceneType, interfaceC714750S1x, map, new InterfaceC1361990lXx() { // from class: X.0ZHE
                    @Override // X.InterfaceC1361990lXx
                    public final /* synthetic */ void LIZIZ(HashMap map2) {
                    }

                    @Override // X.InterfaceC1361990lXx
                    public final void LIZ() {
                        Function1<CharSequence, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(str);
                        }
                    }
                }, 8194);
            }

            @Override // X.InterfaceC1365380ldQ
            public final void LJIILL(final String str, IMUser iMUser, IMContact iMContact, Aweme aweme, String str2, EnumC896890ZGl enumC896890ZGl, String str3, C0ZH0 c0zh0, String str4, boolean z, InterfaceC714750S1x interfaceC714750S1x, final Function1<? super CharSequence, Unit> function1, Map<String, String> map, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
                String uid;
                boolean z2;
                boolean z3;
                C1365430ldV c1365430ldVLJJJLL = LJJJLL(enumC896890ZGl, c0zh0);
                boolean z4 = c1365430ldVLJJJLL.LIZ;
                boolean z5 = c1365430ldVLJJJLL.LIZIZ;
                BaseContent.ReferenceSceneType referenceSceneType = c1365430ldVLJJJLL.LIZJ;
                TextContent.Companion companion = TextContent.Companion;
                String secUid = null;
                if (iMUser != null) {
                    uid = iMUser.getUid();
                    secUid = iMUser.getSecUid();
                } else {
                    uid = null;
                }
                TextContent textContentObtainShareReplyContent = companion.obtainShareReplyContent(str, uid, secUid, aweme, referenceSceneType, featureAttachmentContent, baseHeader);
                C1365330ldL c1365330ldL = C1365330ldL.LIZ;
                String strLJ = LJ(enumC896890ZGl);
                if (!z4 && !z5) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z2);
                if (!z4 && !z) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                C1365330ldL.LJIIIIZZ(c1365330ldL, textContentObtainShareReplyContent, null, iMContact, aweme, str2, strLJ, str3, boolValueOf, z3, str4, referenceSceneType, interfaceC714750S1x, map, new InterfaceC1361990lXx() { // from class: X.0ZH4
                    @Override // X.InterfaceC1361990lXx
                    public final /* synthetic */ void LIZIZ(HashMap map2) {
                    }

                    @Override // X.InterfaceC1361990lXx
                    public final void LIZ() {
                        Function1<CharSequence, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(str);
                        }
                    }
                }, 8194);
            }

            @Override // X.InterfaceC1365380ldQ
            public final C1365120ld0 LJJJJ(Context context, MutableLiveData mutableLiveData, ShareMoreContactsContentFragment shareMoreContactsContentFragment, C1368660lii c1368660lii, SharePackage sharePackage, BaseContent baseContent, Map map, Map map2, Set set, boolean z, boolean z2, Fragment fragment, View view, boolean z3, boolean z4) {
                C1365220ldA c1365220ldA = C1365220ldA.LIZ;
                Bundle bundle = sharePackage.extras;
                c1365220ldA.getClass();
                C1365220ldA.LIZ(bundle, map2);
                return C1365070lcv.LIZ(context, mutableLiveData, shareMoreContactsContentFragment, c1368660lii, sharePackage, baseContent, map, map2, null, set, z, z2, fragment, view, z3, z4, null, "share_more_panel", 65792);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x007c A[PHI: r0 r17 r24
              0x007c: PHI (r0v8 boolean) = (r0v7 boolean), (r0v10 boolean) binds: [B:24:0x0079, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]
              0x007c: PHI (r17v3 boolean) = (r17v2 boolean), (r17v5 boolean) binds: [B:24:0x0079, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]
              0x007c: PHI (r24v1 boolean) = (r24v0 boolean), (r24v3 boolean) binds: [B:24:0x0079, B:17:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC1365380ldQ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.DialogC1389100mFg LJJJJZ(android.app.Activity r28, com.ss.android.ugc.aweme.sharer.model.SharePackage r29, X.C1365460ldY r30, java.util.Set r31, boolean r32, X.InterfaceC1365250ldD r33, boolean r34, X.C1214170hhX r35, boolean r36, boolean r37, boolean r38, boolean r39, java.lang.Boolean r40, boolean r41, boolean r42, boolean r43, java.lang.String r44) {
                /*
                    r27 = this;
                    r17 = r37
                    X.0I0B r0 = X.C0I0B.LJFF
                    X.0I8r r0 = r0.LIZ()
                    X.0mXo r0 = (X.C1400340mXo) r0
                    boolean r1 = r0.isLogin()
                    r0 = 1
                    r2 = r28
                    if (r1 == r0) goto L19
                    X.0ljv r1 = new X.0ljv
                    r1.<init>(r2)
                    return r1
                L19:
                    r7 = r29
                    android.os.Bundle r1 = r7.extras
                    java.lang.String r0 = "aweme_type"
                    int r1 = r1.getInt(r0)
                    r0 = 502(0x1f6, float:7.03E-43)
                    if (r1 == r0) goto L71
                    r0 = 501(0x1f5, float:7.02E-43)
                    if (r1 == r0) goto L71
                    r0 = 504(0x1f8, float:7.06E-43)
                    if (r1 == r0) goto L71
                    r1 = 0
                    if (r40 == 0) goto L6a
                    boolean r0 = r40.booleanValue()
                L36:
                    if (r38 != 0) goto L77
                    r24 = 0
                L3a:
                    if (r39 != 0) goto L7c
                    r23 = 0
                L3e:
                    X.0lis r1 = new X.0lis
                    r8 = 0
                    java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
                    r15 = 0
                    r26 = 1123264(0x1123c0, float:1.574028E-39)
                    r25 = r44
                    r21 = r43
                    r19 = r42
                    r16 = r36
                    r12 = r35
                    r6 = r34
                    r5 = r33
                    r4 = r32
                    r3 = r31
                    r20 = r41
                    r13 = r30
                    r9 = r8
                    r10 = r8
                    r11 = r8
                    r18 = r15
                    r22 = r8
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                    return r1
                L6a:
                    X.06uk r0 = X.C1759206uk.LIZ
                    boolean r0 = X.C1759206uk.LIZ()
                    goto L36
                L71:
                    r1 = 1
                    r0 = 0
                    boolean r17 = X.C0ZNY.LIZJ()
                L77:
                    r24 = 1
                    if (r1 != 0) goto L7c
                    goto L3a
                L7c:
                    r23 = 1
                    goto L3e
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1365390ldR.LJJJJZ(android.app.Activity, com.ss.android.ugc.aweme.sharer.model.SharePackage, X.0ldY, java.util.Set, boolean, X.0ldD, boolean, X.0hhX, boolean, boolean, boolean, boolean, java.lang.Boolean, boolean, boolean, boolean, java.lang.String):X.0mFg");
            }
        };
    }
}
