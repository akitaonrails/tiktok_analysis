package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Build;
import android.provider.MediaStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13zE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20189813zE extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Function1<List<C1852750yJV>, Unit> LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20189813zE(int i, Activity activity, Function1 function1) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = function1;
        this.LLILLL = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            int i = this.LL;
            C118300cf c118300cf = new C118300cf();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 33) {
                int pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                if (i < 1) {
                    i = 1;
                }
                c118300cf.element = i;
                if (i > pickImagesMaxLimit) {
                    c118300cf.element = pickImagesMaxLimit;
                }
            } else {
                c118300cf.element = 1;
            }
            int i3 = c118300cf.element;
            if (i2 >= 33) {
                intent = new Intent("android.provider.action.PICK_IMAGES");
                if (i3 > 1) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", i3);
                }
            } else {
                intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            }
            intent.setType("image/*");
            C2429209fW.LIZ().appendDataFlowId(intent, 1207965186);
            try {
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C20189913zF(this.LLILLL, this.LLILLJJLI, intent, null), 3);
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLILLJJLI.invoke(Collections.singletonList(new C1852750yJV(-2, null)));
            }
        } else {
            this.LLILLJJLI.invoke(Collections.singletonList(new C1852750yJV(-1, null)));
        }
        return Unit.LIZ;
    }
}
