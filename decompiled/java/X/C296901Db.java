package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C296901Db extends C09AY implements Function2<Long, Throwable, Unit> {
    public final /* synthetic */ RichTextPreviewView LL;
    public final /* synthetic */ BoardItem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C296901Db(RichTextPreviewView richTextPreviewView, BoardItem boardItem) {
        super(2);
        this.LL = richTextPreviewView;
        this.LLILLJJLI = boardItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, Throwable th) {
        int i;
        String str;
        String str2;
        long jLongValue = l.longValue();
        Throwable th2 = th;
        RichTextPreviewView richTextPreviewView = this.LL;
        long j = this.LLILLJJLI.id;
        C1814980xKa c1814980xKa = richTextPreviewView.LLIZLLLIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_image_load");
        c474500IjALIZ.LJJII("overlay_image", "image_kind");
        if (th2 == null) {
            i = 0;
        } else {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "result");
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "duration_ms");
        String string = null;
        if (c1814980xKa != null) {
            string = Long.valueOf(c1814980xKa.LIZ).toString();
        }
        String str3 = "";
        if (string == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "decoration_set_id");
        if (c1814980xKa == null || (str = c1814980xKa.LIZJ) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(j), "item_id");
        if (c1814980xKa == null || (str2 = c1814980xKa.LJIIIZ) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, Scene.SCENE_SERVICE);
        if (th2 != null) {
            c474500IjALIZ.LJJII(-1, "error_code");
            String message = th2.getMessage();
            if (message != null) {
                str3 = message;
            }
            c474500IjALIZ.LJJII(str3, "error_msg");
        }
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
