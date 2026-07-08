package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlaybookImageWidthHeightConfigSetting;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.020E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020E extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020E c020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("assembleCell  assemble, assem:");
        sbLIZ.append((C13IQ) c020e.l2);
        sbLIZ.append(", assemTag:");
        sbLIZ.append(c020e.s0);
        sbLIZ.append(", cellHierarchyDataKey:");
        sbLIZ.append(c020e.s1);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(C020E c020e) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addMethodPoint skip ");
        sbLIZ.append(c020e.s0);
        sbLIZ.append(' ');
        sbLIZ.append(c020e.s1);
        sbLIZ.append(": ");
        sbLIZ.append((Long) c020e.l2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(C020E c020e) {
        float f;
        T tLIZIZ;
        String path;
        String str = c020e.s0;
        String str2 = null;
        if (str != null) {
            PlaybookImageWidthHeightConfigSetting playbookImageWidthHeightConfigSetting = PlaybookImageWidthHeightConfigSetting.INSTANCE;
            int width = playbookImageWidthHeightConfigSetting.getWidth();
            int height = playbookImageWidthHeightConfigSetting.getHeight();
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            try {
                Bitmap bitmapDecodeBitmap = BitmapUtils.decodeBitmap(new C0VSJ(str));
                if (bitmapDecodeBitmap != null) {
                    int width2 = bitmapDecodeBitmap.getWidth();
                    int height2 = bitmapDecodeBitmap.getHeight();
                    if (width2 > 0 && height2 > 0 && width > 0 && height > 0) {
                        float f2 = width2;
                        float f3 = height2;
                        float f4 = width;
                        float f5 = height;
                        if (f2 / f3 > f4 / f5) {
                            f = f5 / f3;
                        } else {
                            f = f4 / f2;
                        }
                        int i = (int) (f2 * f);
                        int i2 = (int) (f3 * f);
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeBitmap, i, i2, true);
                        int i3 = i - width;
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        int i4 = i3 / 2;
                        int i5 = i2 - height;
                        if (i5 < 0) {
                            i5 = 0;
                        }
                        int i6 = i5 / 2;
                        if (width > i) {
                            width = i;
                        }
                        if (height > i2) {
                            height = i2;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap, i4, i6, width, height);
                        Context contextLIZ = C176600m4.LIZ();
                        if (contextLIZ != null && (path = C2355009Kq.LJIIIZ(contextLIZ, "play_save_img").getPath()) != null && path.length() > 0 && BitmapUtils.saveBitmapToSD(bitmapCreateBitmap, path, "cover")) {
                            C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                            C786410Ut5.LJJJJ(bitmapCreateBitmap);
                            bitmapDecodeBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeBitmap);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(path);
                            sbLIZ.append(File.separator);
                            sbLIZ.append("cover");
                            tLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            C786410Ut5.LJJJJ(bitmapCreateScaledBitmap);
                            C786410Ut5.LJJJJ(bitmapCreateBitmap);
                            bitmapDecodeBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapDecodeBitmap);
                            tLIZIZ = "";
                        }
                        c259800zU.element = tLIZIZ;
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            str2 = (String) c259800zU.element;
        }
        PlaybookContent playbookContent = (PlaybookContent) c020e.l2;
        if (playbookContent != null) {
            String str3 = c020e.s1;
            if (str2 != null && str2.length() != 0) {
                playbookContent.coverUri = "";
                playbookContent.coverUrl = str2;
            }
            playbookContent.flowStr = str3;
            InterfaceC1106030et7.R8.LIZJ(GsonProtectorUtils.toJson(C293501Bt.LIZ(), playbookContent, PlaybookContent.class));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020E(String str, String str2, C13IQ c13iq, int i) {
        super(0);
        this.$t = i;
        this.l2 = c13iq;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020E(String str, String str2, Long l, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020E(String str, PlaybookContent playbookContent, String str2, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l2 = playbookContent;
        this.s1 = str2;
    }
}
