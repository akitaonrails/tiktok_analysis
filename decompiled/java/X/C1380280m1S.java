package X;

import android.text.TextUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.comment.poll.CommentPollReportHelper$report$1$3;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m1S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380280m1S extends C09AY implements Function1<InterfaceC1381130m2p, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ n LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C013C LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1380280m1S(String str, String str2, n nVar, String str3, int i, String str4, Integer num, String str5, C013C c013c, AwS422S0200000_21 awS422S0200000_21) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = nVar;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = str4;
        this.LLIZ = num;
        this.LLIZLLLIL = str5;
        this.LLJ = c013c;
        this.LLJI = awS422S0200000_21;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1381130m2p interfaceC1381130m2p) {
        InterfaceC1381130m2p interfaceC1381130m2p2 = interfaceC1381130m2p;
        interfaceC1381130m2p2.LJIIJJI("comment_poll");
        interfaceC1381130m2p2.LJIIJ(this.LL);
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        interfaceC1381130m2p2.LJIIIIZZ(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str2 = this.LLILZ;
        int i = this.LLILZIL;
        String str3 = this.LLILZLL;
        Integer num = this.LLIZ;
        String str4 = this.LLIZLLLIL;
        if (str2 != null) {
            linkedHashMap.put("video_owner_id", str2);
        }
        linkedHashMap.put("half_screen_height", String.valueOf(i));
        if (str3 != null) {
            linkedHashMap.put("cmt_poll_id", str3);
        }
        if (num != null) {
            linkedHashMap.put("is_cmt_poll_card_show", String.valueOf(num.intValue()));
        }
        if (str4 != null) {
            linkedHashMap.put("cmt_poll_card_show_option", str4);
        }
        interfaceC1381130m2p2.LJIIL(linkedHashMap);
        interfaceC1381130m2p2.setExtra(C2097608Jq.LJIIJ(new Pair("extra", C08JS.LIZLLL(this.LLILLL))));
        final String str5 = this.LL;
        final C013C c013c = this.LLJ;
        interfaceC1381130m2p2.LJI(new InterfaceC1381790m3t() { // from class: X.0T8w
            @Override // X.InterfaceC1381790m3t
            public final void LIZ(String str6, Map<String, ? extends Object> map) {
                Object obj;
                C742050T8x c742050T8x = C742050T8x.LIZ;
                String str7 = str5;
                c742050T8x.getClass();
                if (TextUtils.equals("commentReportSuccess", str6)) {
                    if (map != null) {
                        obj = map.get("object_id");
                    } else {
                        obj = null;
                    }
                    if (Intrinsics.LJFF(str7, obj)) {
                        c013c.element = true;
                    }
                }
            }
        });
        interfaceC1381130m2p2.LIZJ(new CommentPollReportHelper$report$1$3(this.LLJ, this.LLJI));
        return Unit.LIZ;
    }
}
