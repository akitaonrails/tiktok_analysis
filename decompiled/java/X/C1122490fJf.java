package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.servicerouting.ServiceRoutingDetector;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fJf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122490fJf extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ ServiceRoutingDetector LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122490fJf(ServiceRoutingDetector serviceRoutingDetector) {
        super(1);
        this.LL = serviceRoutingDetector;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        ServiceRoutingDetector serviceRoutingDetector;
        C1122470fJd c1122470fJd;
        String str2 = str;
        if (this.LL.LLILZ) {
            this.LL.D1("comment_entry");
            if (this.LL.x1("comment.check") && (c1122470fJd = (serviceRoutingDetector = this.LL).LLJJJ) != null) {
                Room room = serviceRoutingDetector.LL;
                String string = a0.LJLIIIL(str2).toString();
                if (room == null) {
                    C051E.LIZ("comment.check.skip", new Pair("reason", "room_null"), new Pair("comment_length", Integer.valueOf(string.length())));
                } else {
                    C051E.LIZ("comment.check", new Pair("room_id", Long.valueOf(room.getId())), new Pair("comment_length", Integer.valueOf(string.length())), new Pair("client_model_ready", Boolean.valueOf(c1122470fJd.LJI instanceof C1122740fK4)));
                    if (c1122470fJd.LJI instanceof C1122740fK4) {
                        c1122470fJd.LIZLLL.ok1(new C09GH(string, new C1122300fJM(c1122470fJd, string, room)));
                    } else {
                        c1122470fJd.LIZIZ(room, string);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
