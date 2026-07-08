package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;

/* JADX INFO: renamed from: X.0OPH, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OPH extends AbstractC624280OeA<C0OPH> {
    public final C0OPG LJI;
    public final C0OPG LJII;
    public BulletinBaseItem LJIIIIZZ;
    public BulletinBaseItem LJIIIZ;
    public Integer LJIIJ;
    public Integer LJIIJJI;
    public String LJIIL;

    public C0OPH() {
        super("post_bulletin_perf");
        this.LJI = new C0OPG();
        this.LJII = new C0OPG();
    }

    @Override // X.AbstractC624280OeA
    public final void LJII() {
        EnumC618810OOx enumC618810OOxLIZLLL;
        Long lLJJJ;
        String string;
        String str;
        String aid;
        C0OOO c0ooo;
        Aweme aweme;
        String str2 = this.LIZ;
        C2241008qG c2241008qG = new C2241008qG();
        BulletinBaseItem bulletinBaseItem = this.LJIIIIZZ;
        if (bulletinBaseItem == null || (enumC618810OOxLIZLLL = bulletinBaseItem.LIZLLL()) == null) {
            enumC618810OOxLIZLLL = EnumC618810OOx.NONE;
        }
        c2241008qG.LIZLLL("content_type", enumC618810OOxLIZLLL.getNameString());
        BulletinBaseItem bulletinBaseItem2 = this.LJIIIIZZ;
        if ((bulletinBaseItem2 != null ? bulletinBaseItem2.LIZLLL() : null) == EnumC618810OOx.LINK) {
            c2241008qG.LIZLLL("is_link", "1");
        } else {
            if ((bulletinBaseItem2 != null ? bulletinBaseItem2.LIZLLL() : null) == EnumC618810OOx.TEXT) {
                c2241008qG.LIZLLL("is_link", CardStruct.IStatusCode.DEFAULT);
            }
        }
        BulletinBaseItem bulletinBaseItem3 = this.LJIIIIZZ;
        String str3 = "";
        if ((bulletinBaseItem3 != null ? bulletinBaseItem3.LIZLLL() : null) == EnumC618810OOx.FORWARD) {
            if (!(bulletinBaseItem3 instanceof C0OOO) || (c0ooo = (C0OOO) bulletinBaseItem3) == null || (aweme = c0ooo.LLJI) == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            c2241008qG.LIZLLL("group_id", aid);
        }
        BulletinBaseItem bulletinBaseItem4 = this.LJIIIIZZ;
        if (bulletinBaseItem4 != null && (str = bulletinBaseItem4.LJJIFFI().get("has_edited")) != null) {
            c2241008qG.LIZLLL("has_edited", str);
        }
        c2241008qG.LIZIZ(this.LJIIJJI, "send_status");
        c2241008qG.LIZLLL("channel_id", this.LJIIL);
        BulletinBaseItem bulletinBaseItem5 = this.LJIIIZ;
        Integer num = this.LJIIJJI;
        if (num != null && num.intValue() == 1) {
            if (bulletinBaseItem5 != null && (lLJJJ = bulletinBaseItem5.LJJJ()) != null && (string = lLJJJ.toString()) != null) {
                str3 = string;
            }
            c2241008qG.LIZLLL("message_id", str3);
        }
        c2241008qG.LIZIZ(this.LJIIJ, "is_resend");
        c2241008qG.LIZJ(Long.valueOf(this.LJII.LIZ()), "post_mock_bulletin_total_time");
        c2241008qG.LIZJ(Long.valueOf(this.LJI.LIZ()), "post_total_time");
        C20684815ws.LJIJ(str2, c2241008qG.LJ());
    }

    @Override // X.AbstractC624280OeA
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        this.LJI.LIZLLL();
        this.LJII.LIZLLL();
        this.LJIIIIZZ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIIJ = null;
    }
}
