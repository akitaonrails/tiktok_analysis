package X;

import android.text.Layout;
import android.text.TextUtils;
import com.bytedance.android.livesdk.model.message.FeedUserRoomMonitorMessage;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718820SHo extends C09AY implements Function2<C03H5, C291001Au<? extends Integer>, Unit> {
    public final /* synthetic */ C718770SHj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C718820SHo(C718770SHj c718770SHj) {
        super(2);
        this.LL = c718770SHj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0Iv4, X.0SHz] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, C291001Au<? extends Integer> c291001Au) {
        Aweme aweme;
        C710300Rtc c710300Rtc;
        C0S5R c0s5r;
        final Aweme aweme2;
        Set<String> setLJJIIJ;
        List<TextExtraStruct> list;
        VideoItemParams item;
        VideoItemParams item2;
        Aweme aweme3;
        String desc;
        List<TextExtraStruct> textExtra;
        Aweme aweme4;
        String str;
        C291001Au<? extends Integer> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            VideoDescVM videoDescVM = this.LL.LLILLJJLI;
            videoDescVM.LLILZIL = true;
            videoDescVM.LLILZLL = false;
            videoDescVM.LLIZ = false;
            videoDescVM.setState(new C0S7H(c291001Au2));
            VideoItemParams item3 = videoDescVM.getItem();
            Layout layout = null;
            if (item3 != null) {
                aweme = item3.getAweme();
            } else {
                aweme = null;
            }
            if (!C1594680rbG.LJIIIIZZ(aweme) && (item2 = videoDescVM.getItem()) != null && (aweme3 = item2.getAweme()) != null && aweme3.getAwemeType() == 51 && (desc = aweme3.getDesc()) != null && aweme3 != null && (textExtra = aweme3.getTextExtra()) != null && desc.length() > 0) {
                Iterator<TextExtraStruct> it2 = textExtra.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    TextExtraStruct next = it2.next();
                    if (videoDescVM.EQ2(next, desc) && next.getType() == 0 && (!TextUtils.isEmpty(next.getAwemeId()) || 2 == next.getSubtype())) {
                        if (aweme3.getDesc().charAt(next.getStart()) == '@' && 2 != next.getSubtype() && aweme3.getAwemeType() == 51) {
                            VideoItemParams item4 = videoDescVM.getItem();
                            if (item4 != null && (aweme4 = item4.getAweme()) != null) {
                                VideoItemParams item5 = videoDescVM.getItem();
                                if (item5 == null || (str = item5.mEventType) == null) {
                                    str = "";
                                }
                                ShareDependService.LIZ.getClass();
                                ShareDependServiceImpl.LJJJJI().LJJIJL(aweme4, str);
                            }
                        }
                    }
                }
            }
            if (C0HD0.LIZ()) {
                C718770SHj c718770SHj = this.LL;
                if (!c718770SHj.LLLLL && ((aweme2 = c718770SHj.LLLLIIL) != null || ((item = c718770SHj.LLILLJJLI.getItem()) != null && (aweme2 = item.getAweme()) != null))) {
                    final C718770SHj c718770SHj2 = this.LL;
                    c718770SHj2.getClass();
                    ClientText originalClientText = aweme2.getOriginalClientText();
                    if (originalClientText == null || (list = originalClientText.textExtra) == null || (setLJJIIJ = C09RB.LJJIIJ(C09RB.LJIJI(C09RB.LJIIIZ(new C1939607ik(list), AFwS236S0000000_6.get$arr$(465)), AFwS243S0000000_11.get$arr$(676)))) == null) {
                        setLJJIIJ = C08CX.INSTANCE;
                    }
                    if (setLJJIIJ.isEmpty()) {
                        c718770SHj2.LLLLJI = null;
                        c718770SHj2.LJJZZI();
                    } else {
                        InterfaceC1602300rnY interfaceC1602300rnY = (InterfaceC1602300rnY) c718770SHj2.LLLLIILL.getValue();
                        if (interfaceC1602300rnY != 0 && (!Intrinsics.LJFF(setLJJIIJ, c718770SHj2.LLLLIILLL) || c718770SHj2.LLLLJ == null)) {
                            c718770SHj2.LLLLJI = null;
                            c718770SHj2.LJJZZI();
                            c718770SHj2.LLLLIILLL = setLJJIIJ;
                            interfaceC1602300rnY.LJ(C13LP.LLIIIZ(setLJJIIJ), new C018E() { // from class: X.0Rs0
                                @Override // X.C018E
                                public final void onFail() {
                                }

                                @Override // X.C018E
                                public final void LIZ(Map<String, Long> map) {
                                    String aid;
                                    String aid2;
                                    VideoItemParams item6;
                                    String str2;
                                    User author;
                                    String uid;
                                    Object next2;
                                    String string;
                                    Aweme aweme5 = c718770SHj2.LLLLIIL;
                                    if (aweme5 != null) {
                                        aid = aweme5.getAid();
                                    } else {
                                        aid = null;
                                    }
                                    if (!Intrinsics.LJFF(aid, aweme2.getAid())) {
                                        return;
                                    }
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry<String, Long> entry : map.entrySet()) {
                                        if (entry.getValue().longValue() > 0) {
                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    Set setKeySet = linkedHashMap.keySet();
                                    c718770SHj2.LLLLIL.clear();
                                    c718770SHj2.LLLLIL.addAll(setKeySet);
                                    ((LinkedHashMap) c718770SHj2.LLLLILI).clear();
                                    c718770SHj2.LLLLILI.putAll(linkedHashMap);
                                    if (!setKeySet.isEmpty()) {
                                        C718770SHj c718770SHj3 = c718770SHj2;
                                        Aweme aweme6 = aweme2;
                                        if (!c718770SHj3.LLLLIL.isEmpty() && (aid2 = aweme6.getAid()) != null && !Intrinsics.LJFF(c718770SHj3.LLLLJI, aid2) && (item6 = c718770SHj3.LLILLJJLI.getItem()) != null && (str2 = item6.mEventType) != null && (author = aweme6.getAuthor()) != null && (uid = author.getUid()) != null) {
                                            Iterator<T> it3 = c718770SHj3.LLLLIILLL.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    next2 = it3.next();
                                                    if (c718770SHj3.LLLLIL.contains(next2)) {
                                                        break;
                                                    }
                                                } else {
                                                    next2 = null;
                                                    break;
                                                }
                                            }
                                            String str3 = (String) next2;
                                            if (str3 != null || (str3 = (String) C13LP.LJJJLIIL(c718770SHj3.LLLLIL)) != null) {
                                                Long l = (Long) ((LinkedHashMap) c718770SHj3.LLLLILI).get(str3);
                                                if (l == null || l.longValue() <= 0 || (string = l.toString()) == null) {
                                                    string = "";
                                                }
                                                c718770SHj3.LLLLJI = aid2;
                                                C2344009Gk c2344009Gk = new C2344009Gk();
                                                c2344009Gk.LJIIIIZZ("author_id", uid);
                                                c2344009Gk.LJIIIIZZ("group_id", aid2);
                                                c2344009Gk.LJIIIIZZ("enter_from", str2);
                                                c2344009Gk.LJIIIIZZ("anchor_id", str3);
                                                c2344009Gk.LJIIIIZZ("room_id", string);
                                                c2344009Gk.LJIIIIZZ("item_id", aid2);
                                                C20684815ws.LJIILLIIL("livesdk_video_title_at_anchor_show", c2344009Gk.LIZ);
                                                C2344009Gk c2344009Gk2 = new C2344009Gk();
                                                c2344009Gk2.LJIIIIZZ("enter_method", "video_title_at_name");
                                                c2344009Gk2.LJIIIIZZ("enter_from_merge", str2);
                                                c2344009Gk2.LJIIIIZZ("action_type", "click");
                                                c2344009Gk2.LJIIIIZZ("anchor_id", str3);
                                                c2344009Gk2.LJIIIIZZ("room_id", string);
                                                c2344009Gk2.LJIIIIZZ("item_id", aid2);
                                                C20684815ws.LJIILLIIL("livesdk_live_show", c2344009Gk2.LIZ);
                                            }
                                        }
                                    }
                                    c718770SHj2.LJLLLL(aweme2);
                                }
                            });
                            ?? r0 = new InterfaceC481880Iv4() { // from class: X.0SHz
                                @Override // X.InterfaceC481880Iv4
                                public final C481790Iuv q(FeedUserRoomMonitorMessage feedUserRoomMonitorMessage) {
                                    boolean zRemove;
                                    String aid;
                                    String strValueOf = String.valueOf(feedUserRoomMonitorMessage.anchorId);
                                    if (!c718770SHj2.LLLLIILLL.contains(strValueOf)) {
                                        return new C481790Iuv(false, false, "mention");
                                    }
                                    if (feedUserRoomMonitorMessage.roomStatus == 2 && feedUserRoomMonitorMessage.roomId > 0) {
                                        c718770SHj2.LLLLILI.put(strValueOf, Long.valueOf(feedUserRoomMonitorMessage.roomId));
                                        zRemove = c718770SHj2.LLLLIL.add(strValueOf);
                                    } else {
                                        c718770SHj2.LLLLILI.remove(strValueOf);
                                        zRemove = c718770SHj2.LLLLIL.remove(strValueOf);
                                    }
                                    if (zRemove) {
                                        Aweme aweme5 = c718770SHj2.LLLLIIL;
                                        if (aweme5 != null) {
                                            aid = aweme5.getAid();
                                        } else {
                                            aid = null;
                                        }
                                        if (Intrinsics.LJFF(aid, aweme2.getAid())) {
                                            c718770SHj2.LJLLLL(aweme2);
                                        }
                                    }
                                    return new C481790Iuv(true, false, "mention");
                                }
                            };
                            c718770SHj2.LLLLJ = r0;
                            interfaceC1602300rnY.LIZLLL(r0, "mention");
                            interfaceC1602300rnY.LJIJ(5, "mention", C13LP.LLIIIZ(setLJJIIJ), true);
                            c718770SHj2.LLLLL = true;
                        }
                    }
                }
            }
            C718770SHj c718770SHj3 = this.LL;
            C0S64 c0s64 = c718770SHj3.LLLLIIIILLL;
            if (c0s64 != null && (c0s5r = c0s64.LIZ) != null && c0s5r.LIZJ) {
                c710300Rtc = c718770SHj3.LLLILZJ;
            } else {
                c710300Rtc = c718770SHj3.LLLIILIL;
            }
            c718770SHj3.LLILLJJLI.RQ2();
            C718770SHj c718770SHj4 = this.LL;
            if (c710300Rtc != null) {
                layout = c710300Rtc.LIZIZ;
            }
            c718770SHj4.LJJLIIIJ(layout);
        }
        return Unit.LIZ;
    }
}
