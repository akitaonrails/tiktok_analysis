package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.story.BackgroundModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.11GW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.utils.StoryNoteBackgroundHelper$preload$1", f = "StoryNoteBackgroundHelper.kt", l = {}, m = "invokeSuspend")
public final class C11GW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C11GW(InterfaceC1364105Vn<? super C11GW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C11GW(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryNoteBackgroundHelper@8b57.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List listLJLI = C13LQ.LJLI(C11GX.LIZ());
        if (C298590Bn7.LIZ()) {
            C19719612Di.LJJII(listLJLI, C11GY.LIZ());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) listLJLI) {
            if (((BackgroundModel) obj2).backgroundType == 3) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = ((BackgroundModel) it2.next()).backgroundImgUrl;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (((String) obj3).length() > 0) {
                arrayList3.add(obj3);
            }
        }
        for (final String str2 : arrayList3) {
            final Uri uri = UriProtector.parse(str2);
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIZ.LJJIIJ(new InterfaceC1331910klR() { // from class: X.11GV
                @Override // X.InterfaceC1331910klR
                public final void onCanceled() {
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC1331910klR
                public final void onProgress(float f) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    C1331660kl2.LIZJ().LJI(bitmap, uri);
                    C11GZ.LIZJ.add(str2);
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryNoteBackgroundHelper@8b57.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C11GW(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
