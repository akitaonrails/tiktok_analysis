package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.PreviewBulletinEditWidget;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817560xOk extends C09AY implements Function1<C1817550xOj, Unit> {
    public final /* synthetic */ PreviewBulletinEditWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817560xOk(PreviewBulletinEditWidget previewBulletinEditWidget) {
        super(1);
        this.LL = previewBulletinEditWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1817550xOj c1817550xOj) {
        String str;
        boolean z;
        String str2;
        String str3;
        HashMap<String, String> map;
        C1817550xOj c1817550xOj2 = c1817550xOj;
        C1817550xOj c1817550xOj3 = (C1817550xOj) this.LL.LLJI.getValue();
        c1817550xOj3.LIZ.clear();
        if (c1817550xOj2 != null && (map = c1817550xOj2.LIZ) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c1817550xOj3.LIZ.put(entry.getKey(), entry.getValue());
            }
        }
        String str4 = "";
        if (c1817550xOj2 == null || (str = c1817550xOj2.LIZIZ) == null) {
            str = "";
        }
        c1817550xOj3.LIZIZ = str;
        if (c1817550xOj2 != null && (str3 = c1817550xOj2.LIZJ) != null) {
            str4 = str3;
        }
        c1817550xOj3.LIZJ = str4;
        if (c1817550xOj2 != null) {
            z = c1817550xOj2.LIZLLL;
        } else {
            z = false;
        }
        c1817550xOj3.LIZLLL = z;
        PreviewBulletinEditWidget previewBulletinEditWidget = this.LL;
        HashMap<String, String> map2 = ((C1817550xOj) previewBulletinEditWidget.LLJI.getValue()).LIZ;
        if (map2 == null || (str2 = map2.get("decoration_entrance")) == null) {
            str2 = "live_take_page";
        }
        previewBulletinEditWidget.LLJ = str2;
        return Unit.LIZ;
    }
}
