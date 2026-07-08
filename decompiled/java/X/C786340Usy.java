package X;

import com.bytedance.android.live.uikit.uisetting.MessageNotifyConfig;
import java.io.File;
import java.util.LinkedList;
import kotlin.Unit;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0Usy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786340Usy implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<File> c09aj) throws JSONException {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
        }
    }

    public C786340Usy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C786340Usy c786340Usy, C09AJ c09aj) throws JSONException {
        C1C7U.LIZ("BitmapFileUtil@a1e9.saveBitmapToFileAsyncV2$1");
        C0VSJ c0vsjLIZLLL = C207206166i.LIZLLL((C207207166j) c786340Usy.l0);
        C0UNC.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("config = ");
        sbLIZ.append((C207207166j) c786340Usy.l0);
        sbLIZ.append(" file = ");
        sbLIZ.append(c0vsjLIZLLL);
        C0UND.LIZ("BitmapFileUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsjLIZLLL != null && c0vsjLIZLLL.exists()) {
            c09aj.onNext(c0vsjLIZLLL);
        } else {
            c09aj.onError(new Throwable("the file isn't existing"));
        }
        c09aj.onComplete();
        C1C7U.LIZIZ("BitmapFileUtil@a1e9.saveBitmapToFileAsyncV2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void subscribe$1(C786340Usy c786340Usy, C09AJ c09aj) {
        C1C7U.LIZ("LiveMessageConfigManager@9df2.observeAvoidanceSetting$1");
        LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
        if (C782850UnL.LIZIZ()) {
            MessageNotifyConfig messageNotifyConfig = C782850UnL.LIZJ;
            if (messageNotifyConfig != null) {
                c09aj.onNext(messageNotifyConfig);
            } else {
                c09aj.onError(new Throwable("config is null"));
            }
        } else {
            ((C259800zU) c786340Usy.l0).element = c09aj;
            C782850UnL.LIZIZ.add(c09aj);
            C782850UnL.LIZJ();
        }
        C1C7U.LIZIZ("LiveMessageConfigManager@9df2.observeAvoidanceSetting$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void subscribe$2(C786340Usy c786340Usy, C09AJ c09aj) {
        C1C7U.LIZ("LiveMessageConfigManager@9df2.observeSettingInit$1");
        LinkedList<C09AJ<Unit>> linkedList = C782850UnL.LIZ;
        if (C782850UnL.LIZIZ()) {
            c09aj.onNext(Unit.LIZ);
        } else {
            ((C259800zU) c786340Usy.l0).element = c09aj;
            C782850UnL.LIZ.add(c09aj);
            C782850UnL.LIZJ();
        }
        C1C7U.LIZIZ("LiveMessageConfigManager@9df2.observeSettingInit$1");
    }
}
