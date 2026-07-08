package X;

import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import java.util.List;

/* JADX INFO: renamed from: X.129t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197103129t {
    public final String LIZ;
    public final String LIZIZ;
    public final List<CardContent> LIZJ;
    public final CardContent LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final Integer LJI;
    public final Drawable LJII;

    public C197103129t() {
        this(0);
    }

    public /* synthetic */ C197103129t(int i) {
        this(null, null, null, null, null, false, 0, null);
    }

    public C197103129t(String str, String str2, List<CardContent> list, CardContent cardContent, String str3, boolean z, Integer num, Drawable drawable) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = cardContent;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = num;
        this.LJII = drawable;
    }

    public static C197103129t LIZ(C197103129t c197103129t, String str, String str2, List list, String str3, boolean z, Integer num, Drawable drawable, int i) {
        CardContent cardContent;
        Drawable drawable2 = drawable;
        Integer num2 = num;
        boolean z2 = z;
        String str4 = str3;
        List list2 = list;
        String str5 = str2;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = c197103129t.LIZ;
        }
        if ((i & 2) != 0) {
            str5 = c197103129t.LIZIZ;
        }
        if ((i & 4) != 0) {
            list2 = c197103129t.LIZJ;
        }
        if ((i & 8) != 0) {
            cardContent = c197103129t.LIZLLL;
        } else {
            cardContent = null;
        }
        if ((i & 16) != 0) {
            str4 = c197103129t.LJ;
        }
        if ((i & 32) != 0) {
            z2 = c197103129t.LJFF;
        }
        if ((i & 64) != 0) {
            num2 = c197103129t.LJI;
        }
        if ((i & 128) != 0) {
            drawable2 = c197103129t.LJII;
        }
        return new C197103129t(str6, str5, list2, cardContent, str4, z2, num2, drawable2);
    }
}
