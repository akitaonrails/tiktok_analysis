package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C720260SNc implements InterfaceC720270SNd {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(339));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(338));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(337));

    public final int LIZIZ() {
        return ((Number) this.LIZ.getValue()).intValue();
    }

    @Override // X.InterfaceC720270SNd
    public C0SL3 LIZ(FeedContentLayoutInfo feedContentLayoutInfo, int i, int i2, int i3, int i4, int i5, int i6, boolean z, C0SN0 c0sn0) {
        boolean z2;
        boolean z3;
        int i7;
        float f;
        int i8;
        Rect rect;
        LinkedHashMap linkedHashMap;
        float f2;
        Bitmap bitmap = C720310SNh.LIZ;
        float fLIZ = C720310SNh.LIZ(Integer.valueOf(i), Integer.valueOf(i2));
        float f3 = i4 - feedContentLayoutInfo.totalHeight;
        float f4 = i3;
        float f5 = f4 / fLIZ;
        if (f5 / f3 < 0.85d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fLIZ > 0.75f && z2 && f3 > 0.0f) {
            float f6 = f4 * 1.3333334f;
            if (f3 > f5) {
                f2 = f5;
            } else {
                f2 = f3;
            }
            float f7 = (i4 - f2) / 4;
            float f8 = f3 - f2;
            if (f7 > f8) {
                f7 = f8;
            }
            float f9 = f7 - ((f6 - f2) / 8);
            if (f9 < 0.0f) {
                f9 = 0.0f;
            }
            f3 += f9;
        }
        int i9 = (int) f3;
        ImageView.ScaleType scaleTypeLJFF = C720310SNh.LJFF(i9, i2, i, i3);
        int i10 = feedContentLayoutInfo.titleLines + feedContentLayoutInfo.descriptionLines;
        if (fLIZ <= 0.5625f && i10 <= 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            f = f3 / i4;
            i7 = i9;
        } else {
            i7 = i4;
            f = 1.0f;
        }
        if (C340260DVo.LIZ[scaleTypeLJFF.ordinal()] == 1) {
            rect = new Rect(0, 0, i3, i9);
        } else {
            if (f5 - f3 > 0.0f) {
                i8 = i6;
            } else {
                i8 = (int) ((f3 - f5) / 2);
            }
            rect = new Rect(0, i8, i3, ((int) f5) + i8);
        }
        if (c0sn0 != null && c0sn0.LIZJ == 0) {
            linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("container_view_type", "online");
            linkedHashMap.put("container_height", String.valueOf(i4));
            linkedHashMap.put("container_width", String.valueOf(i3));
            linkedHashMap.put("target_container_height", String.valueOf(i4));
            linkedHashMap.put("target_container_width", String.valueOf(i3));
            if (f >= 1.0f) {
                i9 = i4;
            }
            linkedHashMap.put("video_container_height", String.valueOf(i9));
            linkedHashMap.put("video_container_width", String.valueOf(i3));
            linkedHashMap.put("video_view_height", String.valueOf((int) f5));
            linkedHashMap.put("video_view_width", String.valueOf(i3));
        } else {
            linkedHashMap = null;
        }
        if (!C0SKM.LJIIIIZZ().enable && C0SKM.LJIIIIZZ().enablePerf && 1 != 0) {
            ((C720260SNc) this.LIZJ.getValue()).LIZ(feedContentLayoutInfo, i, i2, i3, i4, i5, i6, z, c0sn0);
        }
        return new C0SL3(scaleTypeLJFF, f, i7, i7, rect, 0.0f, null, 0.0f, 0.0f, 0, null, linkedHashMap, 8160);
    }
}
