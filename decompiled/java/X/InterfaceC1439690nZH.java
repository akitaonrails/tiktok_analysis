package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;

/* JADX INFO: renamed from: X.0nZH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC1439690nZH {
    void LIZ();

    boolean LIZIZ(C19EG c19eg, PublishModel publishModel);

    List<InterfaceC1413210msZ> LIZJ();

    List<C0WIY<Class<?>, IAVPublishExtension<?>>> LIZLLL(AVPublishContentType aVPublishContentType, boolean z, String str);

    void LJ(AbstractC1387200mCc abstractC1387200mCc, String str);

    MainActivityCallback LJFF(PublishModel publishModel, String str);

    boolean LJI(C19EG c19eg, Intent intent, Boolean bool);

    void LJII(C19EG c19eg, BaseShortVideoContext baseShortVideoContext);

    void LJIIIIZZ(boolean z, boolean z2);

    int LJIIIZ();

    boolean LJIIJ(AbstractC1387200mCc abstractC1387200mCc, String str, Boolean bool);
}
