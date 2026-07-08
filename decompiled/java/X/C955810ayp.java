package X;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0ayp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955810ayp extends C955590ayT {
    public final int LJIL;
    public final String LJJ;
    public final long LJJI;
    public final String LJJIFFI;
    public final long LJJII;
    public final String LJJIII;
    public final long LJJIIJ;
    public final String LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;

    public C955810ayp(Room room, RivalExtraInfo rivalExtraInfo, int i, String str, long j, String str2, String str3) {
        super(room, RivalsListsData.TopHostInfo.LIZ, C955540ayO.LJJIJIIJIL, rivalExtraInfo, "", EnumC961080b7K.IDLE, false);
        this.LJIL = i;
        this.LJJ = str;
        this.LJJI = j;
        this.LJJIFFI = str2;
        this.LJJII = -1L;
        this.LJJIII = "";
        this.LJJIIJ = -1L;
        this.LJJIIJZLJL = str3;
    }
}
