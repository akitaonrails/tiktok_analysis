package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiParserSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969170bKN {
    public static final C969170bKN LIZ = new C969170bKN();

    public static InterfaceC926480aDW LIZ(final Function1 function1) {
        LiveSeiParserSetting liveSeiParserSetting = LiveSeiParserSetting.INSTANCE;
        int iSeiParserType = liveSeiParserSetting.seiParserType();
        if (iSeiParserType != 1) {
            if (iSeiParserType != 2) {
                return new InterfaceC926480aDW(function1) { // from class: X.0bKO
                    public final Function1<C945320ahu, Unit> LIZ;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LIZ = function1;
                    }

                    @Override // X.InterfaceC926480aDW
                    public final void LIZIZ(C945320ahu c945320ahu) {
                        this.LIZ.invoke(c945320ahu);
                    }
                };
            }
            final int iSeiParserInterval = liveSeiParserSetting.seiParserInterval();
            return new InterfaceC926480aDW(iSeiParserInterval, function1) { // from class: X.0bKM
                public final Function1<C945320ahu, Unit> LIZ;
                public final int LIZIZ;
                public long LIZJ;

                @Override // X.InterfaceC926480aDW
                public final void LIZIZ(C945320ahu c945320ahu) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - this.LIZJ > this.LIZIZ) {
                        this.LIZJ = jCurrentTimeMillis;
                        this.LIZ.invoke(c945320ahu);
                        return;
                    }
                    C1AZW c1azw = C1AZW.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(EnumC1303240k1C.LAYOUT.getValue());
                    sbLIZ.append("_LinkMicSDK_LayoutManager_");
                    sbLIZ.append(84);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c1azw.getClass();
                    C1AZW.LIZ(strLIZIZ, "drop sei when duration is unavailable.", null, null);
                }

                {
                    this.LIZ = function1;
                    this.LIZIZ = iSeiParserInterval;
                }
            };
        }
        return new AnonymousClass1504(function1);
    }
}
