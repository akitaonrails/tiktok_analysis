package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528920Kok extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C529210KpD LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C528920Kok(Context context, int i, int i2, int i3, C529210KpD c529210KpD) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = c529210KpD;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        String string;
        Activity activityLIZ;
        Context context = this.LL;
        if (context != null) {
            switch (this.LLILLJJLI) {
                case -11:
                case -1:
                    if (this.LLILLL != -1) {
                        Resources resources = context.getResources();
                        if (resources != null) {
                            string = resources.getString(2131857944, Integer.valueOf(this.LLILLL / LSPassThroughRecordSizeConfig.DEFAULT));
                            if (string != null && (activityLIZ = C1388190mED.LIZ(this.LL)) != null) {
                                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                creativeToastBuilder.message(string);
                                creativeToastBuilder.isTuxToastLegacy(true);
                                C1390380mHk.LIZ(activityLIZ, 3047, creativeToastBuilder);
                            }
                        } else {
                            string = null;
                        }
                        C530000KqU.LIZIZ("TikTok-CreativeMediaSelector", new C529020Kou(this.LLILLJJLI, this.LLILZIL, this.LLILLL, string));
                    } else {
                        Activity activityLIZ2 = C1388190mED.LIZ(context);
                        if (activityLIZ2 != null) {
                            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                            creativeToastBuilder2.messageRes(2131857940);
                            creativeToastBuilder2.isTuxToastLegacy(true);
                            C1390380mHk.LIZ(activityLIZ2, 3047, creativeToastBuilder2);
                        }
                    }
                    break;
                case -10:
                    Activity activityLIZ3 = C1388190mED.LIZ(context);
                    if (activityLIZ3 != null) {
                        CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                        creativeToastBuilder3.messageRes(2131826592);
                        creativeToastBuilder3.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLIZ3, 3047, creativeToastBuilder3);
                    }
                    break;
                case -9:
                default:
                    Activity activityLIZ4 = C1388190mED.LIZ(context);
                    if (activityLIZ4 != null) {
                        CreativeToastBuilder creativeToastBuilder4 = new CreativeToastBuilder();
                        creativeToastBuilder4.messageRes(2131857943);
                        creativeToastBuilder4.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLIZ4, 3047, creativeToastBuilder4);
                    }
                    break;
                case -8:
                    Activity activityLIZ5 = C1388190mED.LIZ(context);
                    if (activityLIZ5 != null) {
                        CreativeToastBuilder creativeToastBuilder5 = new CreativeToastBuilder();
                        creativeToastBuilder5.messageRes(2131857934);
                        creativeToastBuilder5.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLIZ5, 3047, creativeToastBuilder5);
                    }
                    break;
                case -7:
                    Activity activityLIZ6 = C1388190mED.LIZ(context);
                    if (activityLIZ6 != null) {
                        CreativeToastBuilder creativeToastBuilder6 = new CreativeToastBuilder();
                        creativeToastBuilder6.messageRes(2131857935);
                        creativeToastBuilder6.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLIZ6, 3047, creativeToastBuilder6);
                    }
                    break;
                case -6:
                    int i = this.LLILZ;
                    if (i == -1) {
                        Activity activityLIZ7 = C1388190mED.LIZ(context);
                        if (activityLIZ7 != null) {
                            CreativeToastBuilder creativeToastBuilder7 = new CreativeToastBuilder();
                            creativeToastBuilder7.messageRes(2131837609);
                            creativeToastBuilder7.isTuxToastLegacy(true);
                            C1390380mHk.LIZ(activityLIZ7, 3047, creativeToastBuilder7);
                        }
                    } else if (i <= 600000) {
                        Activity activityLIZ8 = C1388190mED.LIZ(context);
                        if (activityLIZ8 != null) {
                            CreativeToastBuilder creativeToastBuilder8 = new CreativeToastBuilder();
                            creativeToastBuilder8.message(C786410Ut5.j4(this.LL.getString(2131831026), Arrays.copyOf(new Object[]{Integer.valueOf(this.LLILZ / LSPassThroughRecordSizeConfig.DEFAULT)}, 1)));
                            creativeToastBuilder8.isTuxToastLegacy(true);
                            C1390380mHk.LIZ(activityLIZ8, 3047, creativeToastBuilder8);
                        }
                    } else {
                        Activity activityLIZ9 = C1388190mED.LIZ(context);
                        if (activityLIZ9 != null) {
                            CreativeToastBuilder creativeToastBuilder9 = new CreativeToastBuilder();
                            creativeToastBuilder9.messageRes(2131832055);
                            creativeToastBuilder9.isTuxToastLegacy(true);
                            C1390380mHk.LIZ(activityLIZ9, 3047, creativeToastBuilder9);
                        }
                    }
                    break;
                case -5:
                    Activity activityLIZ10 = C1388190mED.LIZ(context);
                    if (activityLIZ10 != null) {
                        CreativeToastBuilder creativeToastBuilder10 = new CreativeToastBuilder();
                        creativeToastBuilder10.messageRes(2131857936);
                        creativeToastBuilder10.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLIZ10, 3047, creativeToastBuilder10);
                    }
                    break;
                case -4:
                    Activity activityLIZ11 = C1388190mED.LIZ(context);
                    if (activityLIZ11 != null) {
                        CreativeToastBuilder creativeToastBuilder11 = new CreativeToastBuilder();
                        creativeToastBuilder11.messageRes(2131835666);
                        creativeToastBuilder11.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLIZ11, 3047, creativeToastBuilder11);
                    }
                    break;
                case -3:
                    Activity activityLIZ12 = C1388190mED.LIZ(context);
                    if (activityLIZ12 != null) {
                        CreativeToastBuilder creativeToastBuilder12 = new CreativeToastBuilder();
                        creativeToastBuilder12.messageRes(2131857942);
                        creativeToastBuilder12.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLIZ12, 3047, creativeToastBuilder12);
                    }
                    break;
                case -2:
                    Activity activityLIZ13 = C1388190mED.LIZ(context);
                    if (activityLIZ13 != null) {
                        CreativeToastBuilder creativeToastBuilder13 = new CreativeToastBuilder();
                        creativeToastBuilder13.messageRes(2131857941);
                        creativeToastBuilder13.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activityLIZ13, 3047, creativeToastBuilder13);
                    }
                    break;
            }
        }
        return Unit.LIZ;
    }
}
