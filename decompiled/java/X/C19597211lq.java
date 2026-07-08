package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS93S0300000_29;
import Y.ARunnableS98S0200000_29;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.l;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.data.HashtagStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.MentionStruct;
import com.ss.android.ugc.aweme.urllink.model.LinkStickerStruct;
import com.ss.android.ugc.aweme.video.IPlayerManagerService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19597211lq implements InterfaceC19578611iq, InterfaceC487330J9f {
    public static final Object LLJ = new Object();
    public static WeakReference<C0P0T> LLJI;
    public final Context LL;
    public final C705930RmZ LLILLJJLI;
    public final Aweme LLILLL;
    public final C19EG LLILZ;
    public final Function2<C2344009Gk, Aweme, Unit> LLILZIL;
    public final InterfaceC19597711lv LLILZLL;
    public final boolean LLIZ;
    public C0P0T LLIZLLLIL;

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct) {
        return false;
    }

    public final void LIZ(InteractStickerStruct interactStickerStruct) {
        String str;
        String str2;
        String str3;
        String str4;
        String hashtagId;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        String str5;
        String str6;
        String str7;
        String str8;
        int scenario;
        C0R60 c0r605;
        C0R60 c0r606;
        C0R60 c0r607;
        C0R60 c0r608;
        String hashtagName = null;
        if (interactStickerStruct.getType() == 8) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", "at_prop");
            C705930RmZ c705930RmZ = this.LLILLJJLI;
            if (c705930RmZ != null && (c0r608 = c705930RmZ.LJIIZILJ) != null) {
                str5 = c0r608.LIZ;
            } else {
                str5 = null;
            }
            c2344009Gk.LJIIIIZZ("enter_from", str5);
            C705930RmZ c705930RmZ2 = this.LLILLJJLI;
            if (c705930RmZ2 != null && (c0r607 = c705930RmZ2.LJIIZILJ) != null) {
                str6 = c0r607.LIZJ;
            } else {
                str6 = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", str6);
            C705930RmZ c705930RmZ3 = this.LLILLJJLI;
            if (c705930RmZ3 != null && (c0r606 = c705930RmZ3.LJIIZILJ) != null) {
                str7 = c0r606.LIZLLL;
            } else {
                str7 = null;
            }
            c2344009Gk.LJIIIIZZ("group_id", str7);
            C705930RmZ c705930RmZ4 = this.LLILLJJLI;
            if (c705930RmZ4 != null && (c0r605 = c705930RmZ4.LJIIZILJ) != null) {
                str8 = c0r605.LJ;
            } else {
                str8 = null;
            }
            c2344009Gk.LJIIIIZZ("log_pb", str8);
            MentionStruct mentionInfo = interactStickerStruct.getMentionInfo();
            if (mentionInfo != null) {
                hashtagName = mentionInfo.getUserId();
            }
            c2344009Gk.LJIIIIZZ("to_user_id", hashtagName);
            C19597311lr c19597311lr = EnumC19597411ls.Companion;
            MentionStruct mentionInfo2 = interactStickerStruct.getMentionInfo();
            if (mentionInfo2 != null) {
                scenario = mentionInfo2.getScenario();
            } else {
                scenario = 0;
            }
            c19597311lr.getClass();
            c2344009Gk.LJIIIIZZ("mention_type", C19597311lr.LIZ(scenario));
            C20684815ws.LJIILLIIL("at_prop_click", c2344009Gk.LIZ);
            return;
        }
        if (interactStickerStruct.getType() == 9) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            C705930RmZ c705930RmZ5 = this.LLILLJJLI;
            if (c705930RmZ5 != null && (c0r604 = c705930RmZ5.LJIIZILJ) != null) {
                str = c0r604.LIZ;
            } else {
                str = null;
            }
            c2344009Gk2.LJIIIIZZ("enter_from", str);
            C705930RmZ c705930RmZ6 = this.LLILLJJLI;
            if (c705930RmZ6 != null && (c0r603 = c705930RmZ6.LJIIZILJ) != null) {
                str2 = c0r603.LIZJ;
            } else {
                str2 = null;
            }
            c2344009Gk2.LJIIIIZZ("author_id", str2);
            C705930RmZ c705930RmZ7 = this.LLILLJJLI;
            if (c705930RmZ7 != null && (c0r602 = c705930RmZ7.LJIIZILJ) != null) {
                str3 = c0r602.LIZLLL;
            } else {
                str3 = null;
            }
            c2344009Gk2.LJIIIIZZ("group_id", str3);
            C705930RmZ c705930RmZ8 = this.LLILLJJLI;
            if (c705930RmZ8 != null && (c0r60 = c705930RmZ8.LJIIZILJ) != null) {
                str4 = c0r60.LJ;
            } else {
                str4 = null;
            }
            c2344009Gk2.LJIIIIZZ("log_pb", str4);
            HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
            if (hashtagInfo != null) {
                hashtagId = hashtagInfo.getHashtagId();
            } else {
                hashtagId = null;
            }
            c2344009Gk2.LJIIIIZZ("tag_id", hashtagId);
            HashtagStruct hashtagInfo2 = interactStickerStruct.getHashtagInfo();
            if (hashtagInfo2 != null) {
                hashtagName = hashtagInfo2.getHashtagName();
            }
            c2344009Gk2.LJIIIIZZ("tag_name", hashtagName);
            C20684815ws.LJIILLIIL("tag_prop_click", c2344009Gk2.LIZ);
            return;
        }
        if (interactStickerStruct.getType() != 106) {
            return;
        }
        C20684815ws.LJIILLIIL("link_sticker_click", new C2344009Gk().LIZ);
    }

    public final void LIZIZ(InteractStickerStruct interactStickerStruct) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        String str;
        String str2;
        String str3;
        String str4;
        String hashtagId;
        String str5;
        C0R60 c0r60;
        C0R60 c0r602;
        C0R60 c0r603;
        C0R60 c0r604;
        C0R60 c0r605;
        String userId;
        String str6;
        String str7;
        String str8;
        String userId2;
        int scenario;
        Integer numValueOf;
        String value;
        String userId3;
        String str9;
        String str10;
        String str11;
        String str12;
        String strLIZ;
        String strLIZIZ;
        String strLIZJ;
        C0R60 c0r606;
        C0R60 c0r607;
        C0R60 c0r608;
        C0R60 c0r609;
        C0R60 c0r6010;
        C0R60 c0r6011;
        C0R60 c0r6012;
        String str13;
        C0R60 c0r6013;
        String str14 = "";
        boolean zIsConnected = false;
        String hashtagName = null;
        if (interactStickerStruct.getType() == 8) {
            MentionStruct mentionInfo = interactStickerStruct.getMentionInfo();
            if (mentionInfo != null) {
                userId = mentionInfo.getUserId();
            } else {
                userId = null;
            }
            if (Intrinsics.LJFF(userId, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                C705930RmZ c705930RmZ = this.LLILLJJLI;
                if (c705930RmZ != null && (c0r6013 = c705930RmZ.LJIIZILJ) != null) {
                    str13 = c0r6013.LIZ;
                } else {
                    str13 = null;
                }
                c2344009Gk.LJIIIIZZ("enter_from", str13);
                C20684815ws.LJIILLIIL("self_mention_click", c2344009Gk.LIZ);
            }
            C2487409ou.LIZLLL(300L, new ARunnableS98S0200000_29(interactStickerStruct, this, 49));
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            C705930RmZ c705930RmZ2 = this.LLILLJJLI;
            if (c705930RmZ2 != null && (c0r6012 = c705930RmZ2.LJIIZILJ) != null) {
                str6 = c0r6012.LIZ;
            } else {
                str6 = null;
            }
            c2344009Gk2.LJIIIIZZ("enter_from", str6);
            C705930RmZ c705930RmZ3 = this.LLILLJJLI;
            if (c705930RmZ3 != null && (c0r6011 = c705930RmZ3.LJIIZILJ) != null) {
                str7 = c0r6011.LIZJ;
            } else {
                str7 = null;
            }
            c2344009Gk2.LJIIIIZZ("author_id", str7);
            C705930RmZ c705930RmZ4 = this.LLILLJJLI;
            if (c705930RmZ4 != null && (c0r6010 = c705930RmZ4.LJIIZILJ) != null) {
                str8 = c0r6010.LIZLLL;
            } else {
                str8 = null;
            }
            c2344009Gk2.LJIIIIZZ("group_id", str8);
            MentionStruct mentionInfo2 = interactStickerStruct.getMentionInfo();
            if (mentionInfo2 != null) {
                userId2 = mentionInfo2.getUserId();
            } else {
                userId2 = null;
            }
            c2344009Gk2.LJIIIIZZ("to_user_id", userId2);
            C19597311lr c19597311lr = EnumC19597411ls.Companion;
            MentionStruct mentionInfo3 = interactStickerStruct.getMentionInfo();
            if (mentionInfo3 != null) {
                scenario = mentionInfo3.getScenario();
            } else {
                scenario = 0;
            }
            c19597311lr.getClass();
            c2344009Gk2.LJIIIIZZ("mention_type", C19597311lr.LIZ(scenario));
            C20684815ws.LJIILLIIL("at_prop_bubble_click", c2344009Gk2.LIZ);
            MentionStruct mentionInfo4 = interactStickerStruct.getMentionInfo();
            if (mentionInfo4 != null) {
                numValueOf = Integer.valueOf(mentionInfo4.getScenario());
            } else {
                numValueOf = null;
            }
            int value2 = EnumC19597511lt.CAPTION_MODE.getValue();
            if (numValueOf != null && numValueOf.intValue() == value2) {
                value = "caption_mode_at";
            } else {
                int value3 = EnumC19597511lt.TEXT_MODE.getValue();
                if (numValueOf != null && numValueOf.intValue() == value3) {
                    value = "text_mode_at";
                } else {
                    int value4 = EnumC19597511lt.POST_BACKWARDS_MENTION.getValue();
                    if (numValueOf != null && numValueOf.intValue() == value4) {
                        value = "post_to_story_backward_mention";
                    } else {
                        int value5 = EnumC19597511lt.STORY_BACKWARDS_MENTION.getValue();
                        if (numValueOf != null && numValueOf.intValue() == value5) {
                            value = "story_to_story_backward_mention";
                        } else {
                            int value6 = EnumC19597511lt.STORY_ANNIVERSARY_MENTION.getValue();
                            if (numValueOf != null && numValueOf.intValue() == value6) {
                                value = "story_anniversary_bubble";
                            } else {
                                int value7 = EnumC19597511lt.STORY_STREAK_PET_MENTION.getValue();
                                if (numValueOf != null && numValueOf.intValue() == value7) {
                                    value = EnumC19597411ls.STREAK_PET_TO_STORY.getValue();
                                } else {
                                    value = "at_prop";
                                }
                            }
                        }
                    }
                }
            }
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJIIIIZZ("enter_method", value);
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            MentionStruct mentionInfo5 = interactStickerStruct.getMentionInfo();
            if (mentionInfo5 != null) {
                userId3 = mentionInfo5.getUserId();
            } else {
                userId3 = null;
            }
            c2344009Gk3.LIZJ(Intrinsics.LJFF(curUserId, userId3) ? 1 : 0, "self_click");
            C705930RmZ c705930RmZ5 = this.LLILLJJLI;
            if (c705930RmZ5 != null && (c0r609 = c705930RmZ5.LJIIZILJ) != null) {
                str9 = c0r609.LIZ;
            } else {
                str9 = null;
            }
            c2344009Gk3.LJIIIIZZ("enter_from", str9);
            C705930RmZ c705930RmZ6 = this.LLILLJJLI;
            if (c705930RmZ6 != null && (c0r608 = c705930RmZ6.LJIIZILJ) != null) {
                str10 = c0r608.LIZJ;
            } else {
                str10 = null;
            }
            c2344009Gk3.LJIIIIZZ("author_id", str10);
            C705930RmZ c705930RmZ7 = this.LLILLJJLI;
            if (c705930RmZ7 != null && (c0r607 = c705930RmZ7.LJIIZILJ) != null) {
                str11 = c0r607.LIZLLL;
            } else {
                str11 = null;
            }
            c2344009Gk3.LJIIIIZZ("group_id", str11);
            C705930RmZ c705930RmZ8 = this.LLILLJJLI;
            if (c705930RmZ8 != null && (c0r606 = c705930RmZ8.LJIIZILJ) != null) {
                str12 = c0r606.LJ;
            } else {
                str12 = null;
            }
            c2344009Gk3.LJIIIIZZ("log_pb", str12);
            MentionStruct mentionInfo6 = interactStickerStruct.getMentionInfo();
            if (mentionInfo6 != null) {
                hashtagName = mentionInfo6.getUserId();
            }
            c2344009Gk3.LJIIIIZZ("to_user_id", hashtagName);
            InterfaceC19597711lv interfaceC19597711lv = this.LLILZLL;
            if (interfaceC19597711lv == null || (strLIZ = interfaceC19597711lv.LIZ()) == null) {
                strLIZ = "";
            }
            InterfaceC19597711lv interfaceC19597711lv2 = this.LLILZLL;
            if (interfaceC19597711lv2 != null) {
                zIsConnected = interfaceC19597711lv2.isConnected();
            }
            c2344009Gk3.LJ(Boolean.valueOf(zIsConnected), strLIZ);
            InterfaceC19597711lv interfaceC19597711lv3 = this.LLILZLL;
            if (interfaceC19597711lv3 == null || (strLIZIZ = interfaceC19597711lv3.LIZIZ()) == null) {
                strLIZIZ = "";
            }
            InterfaceC19597711lv interfaceC19597711lv4 = this.LLILZLL;
            if (interfaceC19597711lv4 != null && (strLIZJ = interfaceC19597711lv4.LIZJ()) != null) {
                str14 = strLIZJ;
            }
            c2344009Gk3.LJIIIIZZ(strLIZIZ, str14);
            C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk3.LIZ);
            return;
        }
        if (interactStickerStruct.getType() == 9) {
            C2487409ou.LIZLLL(300L, new ARunnableS98S0200000_29(interactStickerStruct, this, 50));
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C2344009Gk c2344009Gk4 = new C2344009Gk();
            String str15 = "tag_prop";
            c2344009Gk4.LJIIIIZZ("enter_method", "tag_prop");
            C705930RmZ c705930RmZ9 = this.LLILLJJLI;
            if (c705930RmZ9 != null && (c0r605 = c705930RmZ9.LJIIZILJ) != null) {
                str = c0r605.LIZ;
            } else {
                str = null;
            }
            c2344009Gk4.LJIIIIZZ("enter_from", str);
            C705930RmZ c705930RmZ10 = this.LLILLJJLI;
            if (c705930RmZ10 != null && (c0r604 = c705930RmZ10.LJIIZILJ) != null) {
                str2 = c0r604.LIZJ;
            } else {
                str2 = null;
            }
            c2344009Gk4.LJIIIIZZ("author_id", str2);
            C705930RmZ c705930RmZ11 = this.LLILLJJLI;
            if (c705930RmZ11 != null && (c0r603 = c705930RmZ11.LJIIZILJ) != null) {
                str3 = c0r603.LIZLLL;
            } else {
                str3 = null;
            }
            c2344009Gk4.LJIIIIZZ("group_id", str3);
            C705930RmZ c705930RmZ12 = this.LLILLJJLI;
            if (c705930RmZ12 != null && (c0r602 = c705930RmZ12.LJIIZILJ) != null) {
                str4 = c0r602.LJ;
            } else {
                str4 = null;
            }
            c2344009Gk4.LJIIIIZZ("log_pb", str4);
            HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
            if (hashtagInfo != null) {
                hashtagId = hashtagInfo.getHashtagId();
            } else {
                hashtagId = null;
            }
            c2344009Gk4.LJIIIIZZ("tag_id", hashtagId);
            HashtagStruct hashtagInfo2 = interactStickerStruct.getHashtagInfo();
            if (hashtagInfo2 != null) {
                hashtagName = hashtagInfo2.getHashtagName();
            }
            c2344009Gk4.LJIIIIZZ("tag_name", hashtagName);
            C705930RmZ c705930RmZ13 = this.LLILLJJLI;
            if (c705930RmZ13 == null || (c0r60 = c705930RmZ13.LJIIZILJ) == null || (str5 = c0r60.LJFF) == null) {
                str5 = "post";
            }
            c2344009Gk4.LJIIIIZZ("story_type", str5);
            String attr = interactStickerStruct.getAttr();
            if (attr != null) {
                try {
                    HashMap map = (HashMap) GsonProtectorUtils.fromJson(C19598511m3.LIZ(), attr, new TypeToken<HashMap<String, String>>() { // from class: X.04Zb
                    }.getType());
                    if (map != null) {
                        if (Intrinsics.LJFF(map.get("is_text_hashtag"), "true")) {
                            str15 = "tag_text";
                        }
                    }
                } catch (l e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c2344009Gk4.LJIIIIZZ("enter_method", str15);
            C2344009Gk c2344009Gk5 = (C2344009Gk) c19651011uW.LJIIIZ(this.LLILLL, c2344009Gk4);
            this.LLILZIL.invoke(c2344009Gk5, this.LLILLL);
            C20684815ws.LJIILLIIL("enter_tag_detail", c2344009Gk5.LIZ);
            return;
        }
        if (interactStickerStruct.getType() != 106) {
            return;
        }
        C20684815ws.LJIILLIIL("visit_link_sticker_url_hint_click", new C2344009Gk().LIZ);
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LL, R.layout.acr, null);
        C197039127h c197039127h = (C197039127h) viewLJLLJ.findViewById(R.id.cuh);
        C197039127h c197039127h2 = (C197039127h) viewLJLLJ.findViewById(R.id.csc);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(444));
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZIZ;
        tuxSheet.LLJJIJIIJIL = true;
        C786410Ut5.U8(c197039127h, new ACListenerS131S0200000_29(this, tuxSheet, 25));
        C786410Ut5.U8(c197039127h2, new ACListenerS93S0300000_29(this, interactStickerStruct, tuxSheet, 4));
        C20684815ws.LJIILLIIL("external_website_security_pop_up_window_show", new C2344009Gk().LIZ);
        Context context = this.LL;
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return;
        }
        tuxSheet.show(supportFragmentManager, "");
    }

    public final void LIZJ(final C0P0T c0p0t) {
        int iHashCode;
        if (c0p0t == null) {
            return;
        }
        if (this.LLIZ) {
            C19597111lp.LIZIZ();
        }
        Context context = this.LL;
        if (context != null) {
            iHashCode = context.hashCode();
        } else {
            iHashCode = 0;
        }
        C487280J9a.LIZ(iHashCode, this);
        c0p0t.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.11lu
            @Override // X.InterfaceC1340660kzY
            public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                C487280J9a.LIZJ(this.LIZ);
                if (this.LIZ.LLIZ) {
                    C19597111lp.LIZ(c0p0t);
                }
            }
        });
        c0p0t.show();
        if (this.LLIZ) {
            synchronized (LLJ) {
                try {
                    LLJI = new WeakReference<>(c0p0t);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC19578611iq
    public final boolean onClick(InteractStickerStruct interactStickerStruct, PointF pointF) {
        String userId;
        String str;
        UrlModel avatarUrl;
        List<String> urlList;
        if (this.LL != null) {
            if (interactStickerStruct.getType() == 8 && interactStickerStruct.getMentionInfo() != null) {
                MentionStruct mentionInfo = interactStickerStruct.getMentionInfo();
                String nickname = null;
                if (mentionInfo != null && (userId = mentionInfo.getUserId()) != null && userId.length() != 0) {
                    MentionStruct mentionInfo2 = interactStickerStruct.getMentionInfo();
                    if (mentionInfo2 != null && (avatarUrl = mentionInfo2.getAvatarUrl()) != null && (urlList = avatarUrl.getUrlList()) != null && !urlList.isEmpty()) {
                        str = (String) ListProtector.get(urlList, 0);
                        if (str == null) {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        str = "";
                    }
                    ACListenerS131S0200000_29 aCListenerS131S0200000_29 = new ACListenerS131S0200000_29(this, interactStickerStruct, 31);
                    C20612915lH c20612915lH = C20612915lH.LIZIZ;
                    Context context = this.LL;
                    MentionStruct mentionInfo3 = interactStickerStruct.getMentionInfo();
                    if (mentionInfo3 != null) {
                        nickname = mentionInfo3.getNickname();
                    }
                    C0P0T c0p0tLJ = c20612915lH.LJ(context, pointF, nickname, str, aCListenerS131S0200000_29);
                    this.LLIZLLLIL = c0p0tLJ;
                    if (c0p0tLJ != null) {
                        c0p0tLJ.LJJII(true, aCListenerS131S0200000_29);
                    }
                    LIZ(interactStickerStruct);
                    LIZJ(this.LLIZLLLIL);
                    return false;
                }
            } else {
                if (interactStickerStruct.getType() == 9) {
                    HashtagStruct hashtagInfo = interactStickerStruct.getHashtagInfo();
                    if (hashtagInfo != null && hashtagInfo.getStatus() == 0) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZ);
                        c1389890mGx.LJIIJ(this.LL.getResources().getString(2131835568));
                        c1389890mGx.LJIIJJI();
                        return false;
                    }
                    C450860Hm8 c450860Hm8 = new C450860Hm8(this.LL);
                    c450860Hm8.LLILLJJLI.LIZLLL = EnumC1235690iGF.TOP;
                    c450860Hm8.LIZ((int) pointF.x, (int) pointF.y);
                    c450860Hm8.LJIIJ(new AwS395S0200000_29(this, interactStickerStruct, 71));
                    c450860Hm8.LJIIIZ(true, new ACListenerS131S0200000_29(this, interactStickerStruct, 27));
                    C0P0T c0p0tLIZIZ = c450860Hm8.LIZIZ();
                    this.LLIZLLLIL = c0p0tLIZIZ;
                    c0p0tLIZIZ.LJJII(true, new ACListenerS131S0200000_29(this, interactStickerStruct, 28));
                    LIZJ(this.LLIZLLLIL);
                    return false;
                }
                if (interactStickerStruct.getType() == 106) {
                    if (interactStickerStruct.getUrlLinkSticker() == null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLILZ);
                        c1389890mGx2.LJIIJ("empty link");
                        c1389890mGx2.LJIIJJI();
                        return false;
                    }
                    LIZ(interactStickerStruct);
                    LinkStickerStruct urlLinkSticker = interactStickerStruct.getUrlLinkSticker();
                    if (urlLinkSticker != null && urlLinkSticker.getSafetyConclusion() == 2) {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(this.LLILZ);
                        c1389890mGx3.LJIIIZ(2131824909);
                        c1389890mGx3.LJIIJJI();
                        return false;
                    }
                    C450860Hm8 c450860Hm82 = new C450860Hm8(this.LL);
                    c450860Hm82.LLILLJJLI.LIZLLL = EnumC1235690iGF.TOP;
                    c450860Hm82.LIZ((int) pointF.x, (int) pointF.y);
                    c450860Hm82.LJIIJ(new AwS372S0200000_6(this, interactStickerStruct, 49));
                    c450860Hm82.LJIIIZ(true, new ACListenerS131S0200000_29(this, interactStickerStruct, 29));
                    C0P0T c0p0tLIZIZ2 = c450860Hm82.LIZIZ();
                    this.LLIZLLLIL = c0p0tLIZIZ2;
                    c0p0tLIZIZ2.LJJII(true, new ACListenerS131S0200000_29(this, interactStickerStruct, 30));
                    C20684815ws.LJIILLIIL("visit_link_sticker_url_hint_show", new C2344009Gk().LIZ);
                    LIZJ(this.LLIZLLLIL);
                    IPlayerManagerService iPlayerManagerService = (IPlayerManagerService) PluggableExtentionKt.pluggableSpi$default(IPlayerManagerService.class, false, false, false, 14, null);
                    if (iPlayerManagerService != null) {
                        iPlayerManagerService.LIZ();
                    }
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        C0P0T c0p0t;
        C0P0T c0p0t2 = this.LLIZLLLIL;
        if (c0p0t2 != null) {
            c0p0t2.dismiss();
        }
        if (this.LLIZ && (c0p0t = this.LLIZLLLIL) != null) {
            C19597111lp.LIZ(c0p0t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19597211lq(Context context, C705930RmZ c705930RmZ, Aweme aweme, C19EG c19eg, Function2<? super C2344009Gk, ? super Aweme, Unit> function2, InterfaceC19597711lv interfaceC19597711lv, boolean z) {
        this.LL = context;
        this.LLILLJJLI = c705930RmZ;
        this.LLILLL = aweme;
        this.LLILZ = c19eg;
        this.LLILZIL = function2;
        this.LLILZLL = interfaceC19597711lv;
        this.LLIZ = z;
    }
}
