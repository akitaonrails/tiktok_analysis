package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetector;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122460fJc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ HighIntentCommentDetector LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122460fJc(HighIntentCommentDetector highIntentCommentDetector, Room room, String str, String str2, Map<String, String> map, String str3) {
        super(0);
        this.LL = highIntentCommentDetector;
        this.LLILLJJLI = room;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20441214yg.LIZIZ("DM_guidance", "showDmCreatorTooltip onClick");
        Context context = this.LL.context;
        if (context != null) {
            C206200qq.LIZIZ(this.LLILLJJLI, "click", this.LLILLL, this.LLILZ, this.LLILZIL);
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, this.LLILZLL);
            HighIntentCommentDetector highIntentCommentDetector = this.LL;
            User owner = this.LLILLJJLI.getOwner();
            String strValueOf = String.valueOf(owner != null ? owner.getSecUid() : null);
            EnumC1123040fKY enumC1123040fKY = EnumC1123040fKY.DM;
            highIntentCommentDetector.getClass();
            if (strValueOf.length() != 0 && !((Boolean) highIntentCommentDetector.LLILZLL.getValue()).booleanValue()) {
                C1107060eum.LIZ(strValueOf, enumC1123040fKY.getValue(), EnumC993080bww.CLICK.getValue(), highIntentCommentDetector.LLILZ, 0);
            }
        }
        return Unit.LIZ;
    }
}
