package X;

import android.os.Message;
import com.ss.android.ugc.aweme.music.model.CollectMusicResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0P4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638960P4k implements InterfaceC2385309Wh {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C638960P4k c638960P4k, C15O7 c15o7) {
        C616450OFv c616450OFv = (C616450OFv) c638960P4k.l1;
        String str = c638960P4k.s0;
        c616450OFv.getClass();
        C1C7U.LIZ("CollectActionPresenter@ad76.<init>$1$sendRequest$1L");
        if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
            CollectMusicResponse collectMusicResponse = (CollectMusicResponse) c15o7.LJIIL();
            collectMusicResponse.action = c616450OFv.LL.LLILZ;
            Message message = new Message();
            message.obj = collectMusicResponse;
            c616450OFv.handleMsg(message);
            int i = 1;
            if (c616450OFv.LL.LLILZ != 1) {
                i = 0;
            }
            C1440005kM.LIZ(new C0OGJ(str, i, false));
        } else {
            c616450OFv.LL.onFailed(c15o7.LJIIJJI());
        }
        C1C7U.LIZIZ("CollectActionPresenter@ad76.<init>$1$sendRequest$1L");
        return null;
    }

    public static final Object then$1(C638960P4k c638960P4k, C15O7 c15o7) {
        List list = (List) c638960P4k.l1;
        String str = c638960P4k.s0;
        C1C7U.LIZ("FeedFetchModel@3835.checkStatisticsInfo$1L");
        C1387100mCS.LIZ(str, list);
        C1C7U.LIZIZ("FeedFetchModel@3835.checkStatisticsInfo$1L");
        return null;
    }

    public C638960P4k(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
