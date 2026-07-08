package X;

import Y.AObserverS236S0100000_34;
import android.app.Activity;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.share.linkshare.model.LinkShareIntentModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1B4a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198861B4a {
    public final Activity LIZ;
    public final List<String> LIZIZ;
    public final C09O8 LIZJ;
    public final C1402840mbq LIZLLL;
    public final CreativeInfo LJ;
    public final C1B4P LJI;
    public final C1B4B LJII;
    public WeakReference<InterfaceC2198961B4k> LJFF = new WeakReference<>(null);
    public final AObserverS236S0100000_34 LJIIIIZZ = new AObserverS236S0100000_34(this, 32);
    public final AObserverS236S0100000_34 LJIIIZ = new AObserverS236S0100000_34(this, 33);

    public final void LIZ(LinkShareIntentModel linkShareIntentModel, Function2<? super List<? extends EnumC1850560yFy>, ? super Exception, Unit> function2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1B4Y(this, linkShareIntentModel, function2, null), 3);
    }

    public final void LIZIZ(boolean z, MusicModel musicModel, String str) {
        C1B4B c1b4b = this.LJII;
        C1B4B.LIZJ(c1b4b, this.LIZ, this.LIZLLL, str, musicModel, z, 32);
        c1b4b.LJ.observeForever(this.LJIIIIZZ);
        c1b4b.LJI.observeForever(this.LJIIIZ);
    }

    public C2198861B4a(Activity activity, List<String> list, C09O8 c09o8, C1402840mbq c1402840mbq, CreativeInfo creativeInfo) {
        int i;
        int i2;
        this.LIZ = activity;
        this.LIZIZ = list;
        this.LIZJ = c09o8;
        this.LIZLLL = c1402840mbq;
        this.LJ = creativeInfo;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            String next = it2.next();
            Uri uri = UriProtector.parse(next);
            if (u.LJIJI("content", uri.getScheme(), true) || u.LJIJI("file", uri.getScheme(), true)) {
                C2360509Mt c2360509Mt = C2360509Mt.LIZ;
                Activity activity2 = this.LIZ;
                CreativeInfo creativeInfo2 = this.LJ;
                c2360509Mt.getClass();
                next = C2360509Mt.LJ(activity2, uri, creativeInfo2, false);
                if (next == null) {
                    next = "";
                }
            }
            arrayList.add(next);
        }
        C1B4P c1b4p = new C1B4P();
        this.LJI = c1b4p;
        C09O8 c09o82 = this.LIZJ;
        int[] iArr = C2198901B4e.LIZ;
        int i3 = iArr[c09o82.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                if (this.LIZIZ.size() == 1) {
                    i2 = 1;
                } else {
                    i2 = 3;
                }
            } else {
                throw new C1954807lC();
            }
        } else if (this.LIZIZ.size() == 1) {
            i2 = 2;
        } else {
            i2 = 4;
        }
        c1b4p.LIZ = i2;
        c1b4p.LIZIZ = arrayList;
        C1402840mbq c1402840mbq2 = this.LIZLLL;
        int i4 = iArr[this.LIZJ.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                throw new C1954807lC();
            }
        } else {
            i = 2;
        }
        c1402840mbq2.mShareMediaType = i;
        this.LJII = new C1B4B(c1b4p, this.LJ.getCreationId(), this.LIZLLL.mCallerPackage);
    }
}
