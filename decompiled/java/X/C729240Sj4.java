package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS119S0101000_11;
import kotlin.jvm.internal.AwS125S1100000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS96S1200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729240Sj4 implements SocialPublishCallback, InterfaceC1593650rZb, InterfaceC729270Sj7 {
    public final C728210ShP LL;
    public final C729440SjO LLILLJJLI;

    @Override // X.InterfaceC727980Sh2
    public final List<C0SPF> LIZ() {
        return null;
    }

    @Override // X.InterfaceC1581360rFm
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1593650rZb
    public final InterfaceC1593660rZc LJ() {
        return null;
    }

    @Override // X.InterfaceC727980Sh2
    public final C0SPF LJIIJ(String str) {
        return null;
    }

    @Override // X.InterfaceC1581360rFm
    public final void LJIIL(String str) {
    }

    @Override // X.C0CWQ
    public final int LJIILJJIL(UserStory userStory) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReportPublish() {
    }

    @Override // X.InterfaceC1593650rZb
    public final boolean LJIIIIZZ() {
        return this.LLILLJJLI.LJIIIIZZ();
    }

    @Override // X.InterfaceC727980Sh2
    public final List<Aweme> LJIIIZ() {
        return new ArrayList();
    }

    @Override // X.InterfaceC727980Sh2
    public final List<Aweme> LJIILL() {
        return new ArrayList();
    }

    @Override // X.InterfaceC1581360rFm
    public final boolean isPublishing() {
        return this.LLILLJJLI.LLILZIL;
    }

    @Override // X.InterfaceC1593650rZb
    public final boolean LIZIZ(PublishModel publishModel) {
        this.LLILLJJLI.getClass();
        return publishModel.isStoryPublish;
    }

    @Override // X.InterfaceC727980Sh2
    public final C729450SjP LIZLLL(String str) {
        C0SPF next;
        Iterator<C0SPF> it2 = this.LL.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ.creationId, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C0SPF c0spf = next;
        if (c0spf == null) {
            return null;
        }
        return c0spf.LIZIZ;
    }

    @Override // X.InterfaceC1581360rFm
    public final EnumC696090RSd LJFF(String str) {
        EnumC696090RSd enumC696090RSdLJFF;
        C729440SjO c729440SjO = this.LLILLJJLI;
        if (c729440SjO == null || (enumC696090RSdLJFF = c729440SjO.LJFF(str)) == null) {
            return EnumC696090RSd.DEFAULT;
        }
        return enumC696090RSdLJFF;
    }

    @Override // X.C0CWQ
    public final void LJIILIIL(String str) {
        C729440SjO c729440SjO = this.LLILLJJLI;
        if (c729440SjO != null) {
            c729440SjO.LJIILIIL(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
        if (publishModel == null) {
            return;
        }
        new AwS590S0100000_11(publishModel, 439).invoke(this.LLILLJJLI);
    }

    public C729240Sj4(C728210ShP c728210ShP, C729300SjA c729300SjA) {
        this.LL = c728210ShP;
        this.LLILLJJLI = new C729440SjO(c728210ShP, c729300SjA);
    }

    @Override // X.C0CWQ
    public final void LJI(String str, boolean z) {
        C729440SjO c729440SjO;
        if (str != null && (c729440SjO = this.LLILLJJLI) != null) {
            c729440SjO.LJI(str, z);
        }
    }

    @Override // X.InterfaceC1581360rFm
    public final void LJII(Object obj, InterfaceC729460SjQ interfaceC729460SjQ) {
        this.LLILLJJLI.LJII(obj, interfaceC729460SjQ);
    }

    @Override // X.C0CWQ
    public final void LJIIJJI(Context context, InterfaceC497601wk interfaceC497601wk) {
        this.LLILLJJLI.LJIIJJI(context, interfaceC497601wk);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
        String str;
        PublishModel publishModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishProgress, publishModel = ");
        if (c1434900nRY != null && (publishModel = c1434900nRY.LIZJ) != null) {
            str = publishModel.creationId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1434900nRY != null && c1434900nRY.LIZJ != null) {
            new AwS119S0101000_11(i, c1434900nRY, 7).invoke(this.LLILLJJLI);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPublishSuccess, publish id: ");
        if (publishModel != null) {
            str = publishModel.publishId;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", aweme id: ");
        sbLIZ.append(createAwemeResponse.aweme.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        if (publishModel == null) {
            return;
        }
        new AwS377S0200000_11(publishModel, createAwemeResponse, 119).invoke(this.LLILLJJLI);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthesisSuccess(PublishModel publishModel, String str) {
        if (publishModel == null) {
            return;
        }
        new AwS125S1100000_11(publishModel, str, 10).invoke(this.LLILLJJLI);
    }

    @Override // X.InterfaceC1441160nbe
    public final void updatePreviewCoverPath(String str, String str2) {
        ((ConcurrentHashMap) this.LL.LJFF.getValue()).put(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
        if (publishModel == null) {
            return;
        }
        new AwS96S1200000_11(publishModel, c1434650nR9, str, 8).invoke(this.LLILLJJLI);
    }
}
