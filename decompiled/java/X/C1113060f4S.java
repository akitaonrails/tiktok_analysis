package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113060f4S extends AbstractC1113150f4b {
    public int LJJZZIII;
    public int LJL;
    public long LJLI;
    public int LJLIIIL;
    public int LJLIIL;
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public long LJLJJL;
    public int LJLJJLL;
    public long LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public int LLFII;
    public int LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public int LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public int LLIILII;
    public int LLIILZL;
    public int LLIIZ;
    public int LLIL;
    public int LLILII;
    public int LLILIL;
    public int LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public long LLJILJIL;

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJFF() {
        this.LJLJJLL++;
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void Cr() {
        super.Cr();
        if (this.LJLJL == 0) {
            this.LJLJL = SystemClock.uptimeMillis();
        }
        this.LJLJLJ += LJJJJIZL().LJIIJJI.LJJ();
        this.LJLJLLL += LJJJJIZL().LJIIJJI.LJJIIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.InterfaceC1112060f2q r3) {
        /*
            r2 = this;
            super.LJ(r3)
            X.0f0w r0 = r3.LJJJZ()
            int r0 = r0.LJIIJ
            r1 = 1
            if (r0 != r1) goto L4f
            boolean r0 = r3 instanceof X.C180400mg
            if (r0 == 0) goto L50
            int r0 = r2.LLIIZ
            int r0 = r0 + 1
            r2.LLIIZ = r0
        L16:
            boolean r0 = r3 instanceof X.AbstractC1110520f0M
            if (r0 == 0) goto L41
            int r0 = r2.LLIIL
            int r0 = r0 + 1
            r2.LLIIL = r0
            boolean r0 = r3 instanceof X.C1110310f01
            if (r0 == 0) goto L37
            r0 = r3
            X.0f0o r0 = (X.AbstractC1110800f0o) r0
            MESSAGE extends X.0ffY r0 = r0.LJIL
            com.bytedance.android.livesdk.model.message.ChatMessage r0 = (com.bytedance.android.livesdk.model.message.ChatMessage) r0
            boolean r0 = r0.LIZIZ()
            if (r0 == 0) goto L37
            int r0 = r2.LLIILZL
            int r0 = r0 + 1
            r2.LLIILZL = r0
        L37:
            boolean r0 = r3 instanceof X.C1110320f02
            if (r0 == 0) goto L41
            int r0 = r2.LLIILII
            int r0 = r0 + 1
            r2.LLIILII = r0
        L41:
            X.0f0z r0 = r3.LJLIIL()
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L95
            int r0 = r2.LLILL
            int r0 = r0 + 1
            r2.LLILL = r0
        L4f:
            return
        L50:
            boolean r0 = r3 instanceof X.C1111000f18
            if (r0 == 0) goto L5b
            int r0 = r2.LLIL
            int r0 = r0 + 1
            r2.LLIL = r0
            goto L16
        L5b:
            boolean r0 = r3 instanceof X.C239500wD
            if (r0 == 0) goto L7f
            r0 = r3
            X.00wD r0 = (X.C239500wD) r0
            boolean r0 = r0.LLJLILLLLZIIL()
            if (r0 == 0) goto L6f
            int r0 = r2.LLILII
            int r0 = r0 + 1
            r2.LLILII = r0
            goto L16
        L6f:
            r0 = r3
            X.00wD r0 = (X.C239500wD) r0
            boolean r0 = r0.LLJLIL()
            if (r0 == 0) goto L7f
            int r0 = r2.LLILIL
            int r0 = r0 + 1
            r2.LLILIL = r0
            goto L16
        L7f:
            boolean r0 = r3 instanceof X.C234500vP
            if (r0 == 0) goto L16
            r0 = r3
            X.0f0o r0 = (X.AbstractC1110800f0o) r0
            MESSAGE extends X.0ffY r0 = r0.LJIL
            com.bytedance.android.livesdk.model.message.MemberMessage r0 = (com.bytedance.android.livesdk.model.message.MemberMessage) r0
            int r0 = r0.action
            if (r0 != r1) goto L16
            int r0 = r2.LLILLJJLI
            int r0 = r0 + 1
            r2.LLILLJJLI = r0
            goto L16
        L95:
            int r0 = r2.LLILLIZIL
            int r0 = r0 + 1
            r2.LLILLIZIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113060f4S.LJ(X.0f2q):void");
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIIIIZZ(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (!(interfaceC1112060f2q instanceof AbstractC1110800f0o)) {
            return;
        }
        MESSAGE message = ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL;
        if (message instanceof LikeMessage) {
            this.LLF++;
            return;
        }
        if (message instanceof GiftMessage) {
            this.LLFF++;
            return;
        }
        if (message instanceof SocialMessage) {
            if (((int) ((SocialMessage) message).action) == 3) {
                this.LLFFF++;
                return;
            } else if (((int) ((SocialMessage) message).action) == 1) {
                this.LLFII++;
                return;
            }
        }
        if (!(message instanceof MemberMessage) || ((MemberMessage) message).action != 1) {
            return;
        }
        this.LLFZ++;
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILJJIL(AbstractC1136060ffY abstractC1136060ffY) {
        super.LJIILJJIL(abstractC1136060ffY);
        this.LJJZZIII++;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010f  */
    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(X.InterfaceC1112060f2q r5) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113060f4S.LJIIZILJ(X.0f2q):void");
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJIIJ(AbstractC1136060ffY abstractC1136060ffY) {
        this.LJL++;
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJIJLIJ(InterfaceC1112060f2q interfaceC1112060f2q) {
        if (!(interfaceC1112060f2q instanceof AbstractC1110800f0o)) {
            return;
        }
        MESSAGE message = ((AbstractC1110800f0o) interfaceC1112060f2q).LJIL;
        if (message instanceof ChatMessage) {
            this.LJLZ++;
            return;
        }
        if (message instanceof LikeMessage) {
            this.LJZ++;
            return;
        }
        if (message instanceof GiftMessage) {
            this.LJZI++;
            return;
        }
        if (message instanceof SocialMessage) {
            if (((int) ((SocialMessage) message).action) == 3) {
                this.LJZL++;
                return;
            } else if (((int) ((SocialMessage) message).action) == 1) {
                this.LL++;
                return;
            }
        }
        if (!(message instanceof MemberMessage) || ((MemberMessage) message).action != 1) {
            return;
        }
        this.LLD++;
    }

    @Override // X.AbstractC1113070f4T
    public final void LJJJJLI(boolean z) {
        String str;
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_public_screen_message_metrics")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("room_id", LJJJJIZL().LJIIZILJ);
                jSONObject.put("anchor_id", LJJJJIZL().LJIL);
                jSONObject.put("msg_comment_cnt", this.LJIILL);
                jSONObject.put("msg_quick_comment_cnt", this.LJIIZILJ);
                jSONObject.put("msg_emote_comment_cnt", this.LJIILLIIL);
                jSONObject.put("msg_comment_chathead_loaded", this.LJJIIZI);
                jSONObject.put("admin_type", LJJJJJ());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jSONObject.put("hot_duration", timeUnit.toSeconds(this.LJJLJ));
                jSONObject.put("folded_show_msg_cnt", this.LJJIJIIJI);
                jSONObject.put("unfolded_show_msg_cnt", this.LJJIJIIJIL);
                jSONObject.put("show_msg_cnt", this.LJJIJIIJI + this.LJJIJIIJIL);
                jSONObject.put("msg_like_cnt", this.LJIJ);
                jSONObject.put("msg_gift_cnt", this.LJIJI);
                jSONObject.put("msg_share_cnt", this.LJIJJ);
                jSONObject.put("msg_follow_cnt", this.LJIJJLI);
                jSONObject.put("drop_like_cnt", this.LJJ);
                jSONObject.put("drop_gift_cnt", this.LJJI);
                jSONObject.put("drop_share_cnt", this.LJJIFFI);
                jSONObject.put("drop_follow_cnt", this.LJJII);
                jSONObject.put("drop_comment_cnt", this.LJJIIJ);
                jSONObject.put("drop_quick_comment_cnt", this.LJJIIZ);
                jSONObject.put("drop_emote_comment_cnt", this.LJJIIJZLJL);
                jSONObject.put("msg_received_total_cnt", this.LJJZZIII);
                jSONObject.put("msg_create_total_cnt", this.LJLLLLLL);
                jSONObject.put("msg_filtered_total_cnt", this.LJL);
                jSONObject.put("model_convert_total_cnt", this.LJJLIIIJLLLLLLLZ);
                jSONObject.put("msg_bind_total_duration", this.LJLI);
                jSONObject.put("msg_bind_total_cnt", this.LJLIIIL);
                jSONObject.put("msg_member_enter_cnt", this.LJJIJIL);
                jSONObject.put("unfolded_ai_summary_cnt", this.LJJJLL);
                jSONObject.put("drop_member_enter_cnt", this.LJJIJL);
                jSONObject.put("drop_total_cnt", this.LJLIIL);
                jSONObject.put("drop_anchor_msg_cnt", this.LJLIL);
                jSONObject.put("drop_anchor_comment_cnt", this.LJLILLLLZI);
                jSONObject.put("drop_following_user_msg_cnt", this.LJLJI);
                jSONObject.put("drop_following_user_comment_cnt", this.LJLJJI);
                jSONObject.put("msg_buffer_total_duration", this.LJLJJL);
                jSONObject.put("msg_others_buffer_cnt", 0);
                jSONObject.put("msg_fold_buffer_cnt", 0);
                jSONObject.put("msg_buffer_total_cnt", this.LJLJJLL);
                jSONObject.put("receive_comment_cnt", this.LJ);
                jSONObject.put("receive_quick_comment_cnt", this.LJI);
                jSONObject.put("receive_emote_comment_cnt", this.LJFF);
                jSONObject.put("receive_like_cnt", this.LJII);
                jSONObject.put("receive_gift_cnt", this.LJIIIIZZ);
                jSONObject.put("receive_share_cnt", this.LJIIIZ);
                jSONObject.put("receive_follow_cnt", this.LJIIJ);
                jSONObject.put("receive_member_enter_cnt", this.LJIIJJI);
                jSONObject.put("create_comment_cnt", this.LJLL);
                jSONObject.put("create_like_cnt", this.LJLLI);
                jSONObject.put("create_gift_cnt", this.LJLLILLLL);
                jSONObject.put("create_share_cnt", this.LJLLJ);
                jSONObject.put("create_follow_cnt", this.LJLLL);
                jSONObject.put("create_member_enter_cnt", this.LJLLLL);
                jSONObject.put("unconsume_comment_cnt", this.LJLZ);
                jSONObject.put("unconsume_like_cnt", this.LJZ);
                jSONObject.put("unconsume_gift_cnt", this.LJZI);
                jSONObject.put("unconsume_share_cnt", this.LJZL);
                jSONObject.put("unconsume_follow_cnt", this.LL);
                jSONObject.put("unconsume_member_enter_cnt", this.LLD);
                jSONObject.put("unshow_like_cnt", this.LLF);
                jSONObject.put("unshow_gift_cnt", this.LLFF);
                jSONObject.put("unshow_share_cnt", this.LLFFF);
                jSONObject.put("unshow_follow_cnt", this.LLFII);
                jSONObject.put("unshow_member_enter_cnt", this.LLFZ);
                jSONObject.put("msg_comment_effective_cnt", this.LJJJJI);
                jSONObject.put("msg_member_enter_effective_cnt", this.LJJLIIIIJ);
                jSONObject.put("folded_msg_social_link_sharer_enter_cnt", this.LJIILIIL);
                jSONObject.put("folded_msg_social_link_receiver_enter_cnt", this.LJIILJJIL);
                jSONObject.put("msg_follow_effective_cnt", this.LJJJJLL);
                jSONObject.put("msg_share_effective_cnt", this.LJJJJLI);
                jSONObject.put("msg_gift_effective_cnt", this.LJJJJL);
                jSONObject.put("msg_like_effective_cnt", this.LJJJJJL);
                jSONObject.put("show_msg_effective_cnt", this.LJJJJZ + this.LJJJJZI);
                jSONObject.put("folded_show_msg_effective_cnt", this.LJJJJZ);
                jSONObject.put("unfolded_show_msg_effective_cnt", this.LJJJJZI);
                jSONObject.put("msg_quick_comment_effective_cnt", this.LJJJJJ);
                jSONObject.put("msg_emote_comment_effective_cnt", this.LJJJJIZL);
                jSONObject.put("msg_comment_effective_u_cnt", this.LLIIL);
                jSONObject.put("msg_member_enter_effective_u_cnt", this.LLILLJJLI);
                jSONObject.put("msg_follow_effective_u_cnt", this.LLILIL);
                jSONObject.put("msg_share_effective_u_cnt", this.LLILII);
                jSONObject.put("msg_gift_effective_u_cnt", this.LLIL);
                jSONObject.put("msg_like_effective_u_cnt", this.LLIIZ);
                jSONObject.put("show_msg_effective_u_cnt", this.LLILL + this.LLILLIZIL);
                jSONObject.put("folded_show_msg_effective_u_cnt", this.LLILL);
                jSONObject.put("unfolded_show_msg_effective_u_cnt", this.LLILLIZIL);
                jSONObject.put("msg_quick_comment_effective_u_cnt", this.LLIILZL);
                jSONObject.put("msg_emote_comment_effective_u_cnt", this.LLIILII);
                jSONObject.put("msg_comment_u_cnt", this.LLI);
                jSONObject.put("msg_member_enter_u_cnt", this.LLIIJLIL);
                jSONObject.put("msg_follow_u_cnt", this.LLIIIL);
                jSONObject.put("msg_share_u_cnt", this.LLIIIJ);
                jSONObject.put("msg_gift_u_cnt", this.LLIIIILZ);
                jSONObject.put("msg_like_u_cnt", this.LLIIII);
                jSONObject.put("show_msg_u_cnt", this.LLIIIZ + this.LLIIJI);
                jSONObject.put("folded_show_msg_u_cnt", this.LLIIIZ);
                jSONObject.put("unfolded_show_msg_u_cnt", this.LLIIJI);
                jSONObject.put("msg_quick_comment_u_cnt", this.LLII);
                jSONObject.put("msg_emote_comment_u_cnt", this.LLIFFJFJJ);
                jSONObject.put("msg_comment_duration", this.LLILLL);
                jSONObject.put("msg_member_enter_duration", this.LLJILJIL);
                jSONObject.put("msg_follow_duration", this.LLJ);
                jSONObject.put("msg_share_duration", this.LLIZLLLIL);
                jSONObject.put("msg_gift_duration", this.LLIZ);
                jSONObject.put("msg_like_duration", this.LLILZLL);
                jSONObject.put("show_msg_duration", this.LLJI + this.LLJIJIL);
                jSONObject.put("folded_show_msg_duration", this.LLJI);
                jSONObject.put("unfolded_show_msg_duration", this.LLJIJIL);
                jSONObject.put("msg_quick_comment_duration", this.LLILZIL);
                jSONObject.put("msg_emote_comment_duration", this.LLILZ);
                if (LJJJJIZL().LJJ) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("is_extended_comment_filed", str);
                long seconds = timeUnit.toSeconds(SystemClock.uptimeMillis() - this.LJLJL);
                jSONObject.put("msg_others_buffer_avg_cnt", ((long) this.LJLJLJ) / seconds);
                jSONObject.put("msg_fold_buffer_avg_cnt", ((long) this.LJLJLLL) / seconds);
                jSONObject.put("fold_msg_max_buffer_size", LJJJJIZL().LJJIIJZLJL);
                jSONObject.put("fold_msg_consume_interval", (long) (r0.LJJIIZ * LJJJJIZL().LJJIII));
                jSONObject.put("msg_comment_avatar_preload_cnt", this.LJJIJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1CC2.LJI("ttlive_public_screen_message_metrics", new JSONObject(), null, jSONObject);
        }
        this.LJJZZIII = 0;
        this.LJL = 0;
        this.LJLI = 0L;
        this.LJLIIL = 0;
        this.LJLIL = 0;
        this.LJLILLLLZI = 0;
        this.LJLJI = 0;
        this.LJLJJI = 0;
        this.LJLJJL = 0L;
        this.LJLIIIL = 0;
        this.LJLJL = 0L;
        this.LJLJLJ = 0;
        this.LJLJLLL = 0;
        this.LJLJJLL = 0;
        this.LJLL = 0;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
        this.LJLLL = 0;
        this.LJLLLL = 0;
        this.LJLLLLLL = 0;
        this.LJLZ = 0;
        this.LJZ = 0;
        this.LJZI = 0;
        this.LJZL = 0;
        this.LL = 0;
        this.LLD = 0;
        this.LLF = 0;
        this.LLFF = 0;
        this.LLFFF = 0;
        this.LLFII = 0;
        this.LLFZ = 0;
        this.LLI = 0;
        this.LLIFFJFJJ = 0;
        this.LLII = 0;
        this.LLIIII = 0;
        this.LLIIIILZ = 0;
        this.LLIIIJ = 0;
        this.LLIIIL = 0;
        this.LLIIIZ = 0;
        this.LLIIJI = 0;
        this.LLIIJLIL = 0;
        this.LLIIL = 0;
        this.LLIILII = 0;
        this.LLIILZL = 0;
        this.LLIIZ = 0;
        this.LLIL = 0;
        this.LLILII = 0;
        this.LLILIL = 0;
        this.LLILL = 0;
        this.LLILLIZIL = 0;
        this.LLILLJJLI = 0;
        this.LLILLL = 0L;
        this.LLILZ = 0L;
        this.LLILZIL = 0L;
        this.LLILZLL = 0L;
        this.LLIZ = 0L;
        this.LLIZLLLIL = 0L;
        this.LLJ = 0L;
        this.LLJI = 0L;
        this.LLJIJIL = 0L;
        this.LLJILJIL = 0L;
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIIIZ(InterfaceC1112060f2q interfaceC1112060f2q, boolean z) {
        super.LJIIIZ(interfaceC1112060f2q, z);
        if (interfaceC1112060f2q instanceof AbstractC1110800f0o) {
            AbstractC1110790f0n abstractC1110790f0n = (AbstractC1110790f0n) interfaceC1112060f2q;
            if (abstractC1110790f0n.LLIILZL()) {
                this.LJLIL++;
                if (interfaceC1112060f2q instanceof C1110310f01) {
                    this.LJLILLLLZI++;
                }
            }
            User user = abstractC1110790f0n.getUser();
            if (user != null && user.isFollowing) {
                this.LJLJI++;
                if (interfaceC1112060f2q instanceof C1110310f01) {
                    this.LJLJJI++;
                }
            }
        }
        this.LJLIIL++;
    }

    @Override // X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        if (interfaceC1112060f2q.LJJJJI().LIZ) {
            this.LJLJJL += interfaceC1112060f2q.LJJJJI().LIZJ - interfaceC1112060f2q.LJJJJI().LIZIZ;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    @Override // X.AbstractC1113150f4b, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIL(long r7, X.InterfaceC1112060f2q r9) {
        /*
            r6 = this;
            super.LJJIJIL(r7, r9)
            boolean r0 = r9 instanceof X.AbstractC1110800f0o
            if (r0 != 0) goto L8
            return
        L8:
            X.0f0o r9 = (X.AbstractC1110800f0o) r9
            MESSAGE extends X.0ffY r5 = r9.LJIL
            boolean r0 = r5 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            r4 = 1
            if (r0 == 0) goto L1e
            int r0 = r6.LJLL
            int r0 = r0 + 1
            r6.LJLL = r0
        L17:
            int r0 = r6.LJLLLLLL
            int r0 = r0 + 1
            r6.LJLLLLLL = r0
            return
        L1e:
            boolean r0 = r5 instanceof com.bytedance.android.livesdk.model.message.LikeMessage
            if (r0 == 0) goto L29
            int r0 = r6.LJLLI
            int r0 = r0 + 1
            r6.LJLLI = r0
            goto L17
        L29:
            boolean r0 = r5 instanceof com.bytedance.android.livesdk.model.message.GiftMessage
            if (r0 == 0) goto L34
            int r0 = r6.LJLLILLLL
            int r0 = r0 + 1
            r6.LJLLILLLL = r0
            goto L17
        L34:
            boolean r0 = r5 instanceof com.bytedance.android.livesdk.model.message.SocialMessage
            if (r0 == 0) goto L57
            r0 = r5
            com.bytedance.android.livesdk.model.message.SocialMessage r0 = (com.bytedance.android.livesdk.model.message.SocialMessage) r0
            long r2 = r0.action
            int r1 = (int) r2
            r0 = 3
            if (r1 != r0) goto L48
            int r0 = r6.LJLLJ
            int r0 = r0 + 1
            r6.LJLLJ = r0
            goto L17
        L48:
            r0 = r5
            com.bytedance.android.livesdk.model.message.SocialMessage r0 = (com.bytedance.android.livesdk.model.message.SocialMessage) r0
            long r1 = r0.action
            int r0 = (int) r1
            if (r0 != r4) goto L57
            int r0 = r6.LJLLL
            int r0 = r0 + 1
            r6.LJLLL = r0
            goto L17
        L57:
            boolean r0 = r5 instanceof com.bytedance.android.livesdk.model.message.MemberMessage
            if (r0 == 0) goto L17
            com.bytedance.android.livesdk.model.message.MemberMessage r5 = (com.bytedance.android.livesdk.model.message.MemberMessage) r5
            int r0 = r5.action
            if (r0 != r4) goto L17
            int r0 = r6.LJLLLL
            int r0 = r0 + 1
            r6.LJLLLL = r0
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113060f4S.LJJIJIL(long, X.0f2q):void");
    }

    @Override // X.AbstractC1113150f4b, X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJJIL(long j, InterfaceC1112060f2q interfaceC1112060f2q) {
        super.LJJIL(j, interfaceC1112060f2q);
        this.LJLI += interfaceC1112060f2q.LJJJZ().LJ - interfaceC1112060f2q.LJJJZ().LIZLLL;
        this.LJLIIIL++;
        if (j != 0 || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_public_screen_metrics", 0.2d)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_id", LJJJJIZL().LJIIZILJ);
            jSONObject.put("anchor_id", LJJJJIZL().LJIL);
            jSONObject.put("admin_type", LJJJJJ());
            if (LJJJJIZL().LJI) {
                Long lLM = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).lM(LJJJJIZL().LJIIZILJ);
                if (lLM != null) {
                    long jLongValue = lLM.longValue();
                    DataChannel dataChannel = LJJJJIZL().LJIIIZ;
                    if (dataChannel != null) {
                        dataChannel.SX0(C753940Tho.class, Long.valueOf(this.LJJLL - jLongValue));
                    }
                    jSONObject.put("public_screen_load_duration", this.LJJLL - jLongValue);
                    jSONObject.put("public_screen_first_message_total_duration", this.LJJZZI - jLongValue);
                }
            } else {
                EnterRoomConfig.TimeStamp timeStamp = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.timeStamps;
                if (timeStamp != null) {
                    long j2 = timeStamp.enterRoomStarTime;
                    jSONObject.put("public_screen_load_duration", this.LJJLL - j2);
                    DataChannel dataChannel2 = LJJJJIZL().LJIIIZ;
                    if (dataChannel2 != null) {
                        dataChannel2.SX0(C753940Tho.class, Long.valueOf(this.LJJLL - j2));
                    }
                    jSONObject.put("public_screen_first_message_total_duration", this.LJJZZI - j2);
                }
            }
            jSONObject.put("public_screen_first_message_receive_duration", this.LJJZ - this.LJJLL);
            jSONObject.put("public_screen_first_message_show_duration", this.LJJZZI - this.LJJZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!LJJJJIZL().LJJ) {
            C1CC2.LJI("ttlive_public_screen_metrics", new JSONObject(), null, jSONObject);
        }
    }

    @Override // X.AbstractC1113070f4T, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    public final void LJIILLIIL(AbstractC1136060ffY abstractC1136060ffY, AbstractC1111980f2i abstractC1111980f2i, boolean z, User user) {
        super.LJIILLIIL(abstractC1136060ffY, abstractC1111980f2i, z, user);
        User userLIZ = abstractC1111980f2i.LIZ(user, abstractC1136060ffY);
        if (userLIZ != null) {
            long id = userLIZ.getId();
            if (user != null && id == user.getId()) {
                this.LJLIL++;
                if (abstractC1136060ffY instanceof ChatMessage) {
                    this.LJLILLLLZI++;
                }
            }
        }
        User userLIZ2 = abstractC1111980f2i.LIZ(user, abstractC1136060ffY);
        if (userLIZ2 != null && userLIZ2.isFollowing) {
            this.LJLJI++;
            if (abstractC1136060ffY instanceof ChatMessage) {
                this.LJLJJI++;
            }
        }
        this.LJLIIL++;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // X.AbstractC1113150f4b, X.AbstractC1096380edY, X.InterfaceC1112020f2m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJI(X.AbstractC1136060ffY r6, X.AbstractC1111980f2i<X.AbstractC1136060ffY> r7, long r8, boolean r10, com.bytedance.android.live.base.model.user.User r11) {
        /*
            r5 = this;
            super.LJJIJIIJI(r6, r7, r8, r10, r11)
            boolean r0 = r6 instanceof com.bytedance.android.livesdk.model.message.ChatMessage
            r4 = 1
            if (r0 == 0) goto L15
            int r0 = r5.LJLL
            int r0 = r0 + 1
            r5.LJLL = r0
        Le:
            int r0 = r5.LJLLLLLL
            int r0 = r0 + 1
            r5.LJLLLLLL = r0
            return
        L15:
            boolean r0 = r6 instanceof com.bytedance.android.livesdk.model.message.LikeMessage
            if (r0 == 0) goto L20
            int r0 = r5.LJLLI
            int r0 = r0 + 1
            r5.LJLLI = r0
            goto Le
        L20:
            boolean r0 = r6 instanceof com.bytedance.android.livesdk.model.message.GiftMessage
            if (r0 == 0) goto L2b
            int r0 = r5.LJLLILLLL
            int r0 = r0 + 1
            r5.LJLLILLLL = r0
            goto Le
        L2b:
            boolean r0 = r6 instanceof com.bytedance.android.livesdk.model.message.SocialMessage
            if (r0 == 0) goto L4e
            r0 = r6
            com.bytedance.android.livesdk.model.message.SocialMessage r0 = (com.bytedance.android.livesdk.model.message.SocialMessage) r0
            long r2 = r0.action
            int r1 = (int) r2
            r0 = 3
            if (r1 != r0) goto L3f
            int r0 = r5.LJLLJ
            int r0 = r0 + 1
            r5.LJLLJ = r0
            goto Le
        L3f:
            r0 = r6
            com.bytedance.android.livesdk.model.message.SocialMessage r0 = (com.bytedance.android.livesdk.model.message.SocialMessage) r0
            long r1 = r0.action
            int r0 = (int) r1
            if (r0 != r4) goto L4e
            int r0 = r5.LJLLL
            int r0 = r0 + 1
            r5.LJLLL = r0
            goto Le
        L4e:
            boolean r0 = r6 instanceof com.bytedance.android.livesdk.model.message.MemberMessage
            if (r0 == 0) goto Le
            com.bytedance.android.livesdk.model.message.MemberMessage r6 = (com.bytedance.android.livesdk.model.message.MemberMessage) r6
            int r0 = r6.action
            if (r0 != r4) goto Le
            int r0 = r5.LJLLLL
            int r0 = r0 + 1
            r5.LJLLLL = r0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1113060f4S.LJJIJIIJI(X.0ffY, X.0f2i, long, boolean, com.bytedance.android.live.base.model.user.User):void");
    }
}
