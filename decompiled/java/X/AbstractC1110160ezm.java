package X;

import X.AbstractC1136060ffY;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ezm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1110160ezm<MESSAGE extends AbstractC1136060ffY> extends AbstractC1110520f0M<MESSAGE> {
    public boolean LJJIJ;
    public C519870Ka9 LJJIJIIJI;

    public abstract String LLLII();

    public abstract int LLLIIII();

    public abstract boolean LLLIIIIL();

    public abstract void LLLIIL();

    @Override // X.AbstractC1110520f0M, X.AbstractC1110790f0n, X.InterfaceC1111840f2U
    public final void LJJIJIIJIL() {
        String str;
        super.LJJIJIIJIL();
        if (LLIIIILZ() != null && this.LJJIJ && LLLIIIIL()) {
            this.LJJIJ = false;
            int iLIZ = C1110350f05.LIZ(LLLIIII(), LLLII());
            ArrayList arrayList = new ArrayList();
            Iterator<EmoteWithIndex> it2 = LLJZ().iterator();
            while (it2.hasNext()) {
                EmoteModel emoteModel = it2.next().emoteModel;
                if (emoteModel != null && (str = emoteModel.emoteId) != null) {
                    arrayList.add(str);
                }
            }
            if (iLIZ != -1) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_privilege_emote_show");
                c474500IjALIZ.LJIJJLI(LLIIIILZ().LJIIIZ);
                c474500IjALIZ.LJJII("comment_area", "show_entrance");
                c474500IjALIZ.LJJII(String.valueOf(iLIZ), "show_type");
                c474500IjALIZ.LJJII(arrayList, "privilege_emotes_label");
                c474500IjALIZ.LIZ();
                if (this.LJIILJJIL.LIZJ == 1) {
                    DataChannel dataChannel = LLIIIILZ().LJIIIZ;
                    List<EmoteWithIndex> listLLJZ = LLJZ();
                    User user = getUser();
                    C498510Jgn.LIZ(dataChannel, false, null, listLLJZ, user != null ? user.getId() : 0L);
                }
            }
        }
    }

    public AbstractC1110160ezm(MESSAGE message) {
        super(message);
        this.LJJIJ = true;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public void LJJJJL(boolean z) {
        super.LJJJJL(z);
        this.LJJIJ = true;
        this.LJJIJIIJI = null;
    }

    @Override // X.AbstractC1110520f0M, X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public void LJJJJZ(C1109770ez9 c1109770ez9) {
        super.LJJJJZ(c1109770ez9);
        if (this.LJJIJIIJI == null) {
            this.LJJIJIIJI = new C519870Ka9();
        }
        LLLIIL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        if (X.C500260Jjc.LJJJI(r8) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d8, code lost:
    
        if (X.C500260Jjc.LJJJI(r8) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
    
        if (X.C500260Jjc.LJJJ(r4) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e0, code lost:
    
        if (r2 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        if (LLIIIILZ().LIZLLL != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ea, code lost:
    
        r3 = LLIIIILZ().LJIIIZ;
        r2 = X.C784440Upu.LIZ();
        r1 = new X.C0IF2(1);
        r1.LIZJ = new X.C766460U4u(r3, r5);
        r2.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0103, code lost:
    
        if (r3 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0105, code lost:
    
        r2 = (java.lang.Long) r3.gg0(com.bytedance.android.livesdk.dataChannel.AudienceShowOrientationBeginTime.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
    
        if (r2 == null) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010f, code lost:
    
        ((com.bytedance.android.live.definition.IDefinitionService) X.C1161920gLG.LIZJ(com.bytedance.android.live.definition.IDefinitionService.class)).vu2(1, 0, -1, r2.longValue(), java.lang.String.valueOf(r4.getId()), "click_game_emote");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0154, code lost:
    
        ((com.bytedance.android.livesdk.comp.api.game.service.IGameService) X.C1161920gLG.LIZJ(com.bytedance.android.livesdk.comp.api.game.service.IGameService.class)).lU0();
        r4 = X.C753430Tgz.LIZ;
        r3 = new java.util.HashMap();
        r3.put("guess_scroll_id", "reward");
        r3.put("open_page_time", r5);
        r4.LJIILIIL("public_screen", r3, LLIIIILZ().LJIIIZ, LLIIIILZ().LIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIIIL(com.bytedance.android.live.base.model.emoji.EmoteModel r18) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1110160ezm.LLLIIIL(com.bytedance.android.live.base.model.emoji.EmoteModel):void");
    }

    public final void LLLIILIL(String str, EmoteModel emoteModel, Room room) {
        ArrayList arrayList = new ArrayList();
        String str2 = emoteModel.emoteId;
        str2.toString();
        arrayList.add(str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guessing_emote");
        c474500IjALIZ.LJIJJLI(LLIIIILZ().LJIIIZ);
        c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(LLIIIILZ().LJIL), "anchor_id");
        c474500IjALIZ.LJJII(C354201Zc.LIZ(room.getStreamType()), "live_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(arrayList, "emotes_label");
        c474500IjALIZ.LIZ();
    }
}
