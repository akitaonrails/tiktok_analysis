package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0OAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.addyours.ui.fragment.AddYoursDetailAwemeListFragment$toInvite$1$1", f = "AddYoursDetailAwemeListFragment.kt", l = {}, m = "invokeSuspend")
public final class C615080OAo extends C09AX implements InterfaceC1631620sYq<List<? extends UserInvitee>, List<? extends UserInvitee>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AddYoursTopic LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C615080OAo(AddYoursTopic addYoursTopic, InterfaceC1364105Vn<? super C615080OAo> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLJJLI = addYoursTopic;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddYoursDetailAwemeListFragment@47c.toInvite$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<UserInvitee> list = (List) this.LL;
        AddYoursTopic addYoursTopic = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (UserInvitee userInvitee : list) {
            Long lLJIILIIL = C2095008Iq.LJIILIIL(userInvitee.getUid());
            UrlModel avatarModel = userInvitee.getAvatarModel();
            if (avatarModel == null) {
                avatarModel = C0OD6.LIZLLL(userInvitee.getAvatarUrl());
            }
            arrayList.add(new AddYoursAvatar(lLJIILIIL, avatarModel, userInvitee.getUserName()));
        }
        C1440005kM.LIZ(new C0NKE(addYoursTopic.copy(addYoursTopic.topicId, addYoursTopic.text, addYoursTopic.inviterAvatars, addYoursTopic.inviterCount, arrayList, addYoursTopic.videoCount, addYoursTopic.video, addYoursTopic.fromQuestion, addYoursTopic.collectStatus, addYoursTopic.viewerInvited, addYoursTopic.eoyCampaign, addYoursTopic.eoyCampaignSchema, addYoursTopic.topicType), EnumC615090OAp.INVITE_UPDATE_AVATARS));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddYoursDetailAwemeListFragment@47c.toInvite$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends UserInvitee> list, List<? extends UserInvitee> list2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C615080OAo c615080OAo = new C615080OAo(this.LLILLJJLI, interfaceC1364105Vn);
        c615080OAo.LL = list2;
        return c615080OAo.invokeSuspend(Unit.LIZ);
    }
}
