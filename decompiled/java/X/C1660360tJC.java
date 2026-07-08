package X;

import com.ss.android.ugc.aweme.social.creation.edit.component.toolbar.StoryEditToolbarComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tJC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1660360tJC extends C2217421BqW implements Function1<C1661820tLY, Unit> {
    public C1660360tJC(Object obj) {
        super(1, obj, StoryEditToolbarComponent.class, "onNewState", "onNewState(Lcom/ss/android/ugc/aweme/social/creation/edit/uiview/EditToolbarState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1661820tLY c1661820tLY) {
        ((StoryEditToolbarComponent) this.receiver).i3(c1661820tLY);
        return Unit.LIZ;
    }
}
