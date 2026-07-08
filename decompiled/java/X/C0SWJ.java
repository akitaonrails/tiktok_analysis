package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleAvatarCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleEditCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleExpandCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.TaggedPeopleFoldCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0SWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SWJ extends FrameLayout implements Observer<C0RD4> {
    public final C451170Hmd LL;
    public final TuxTextView LLILLJJLI;
    public final List<C0SQC> LLILLL;
    public Aweme LLILZ;
    public DataCenter LLILZIL;
    public C0SWK LLILZLL;
    public final int LLIZ;
    public final Set<String> LLIZLLLIL;

    public final void LIZIZ(boolean z) {
        C0SPY mobParams;
        C0SPY mobParams2;
        C0SPY mobParams3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentTaggedPeopleView: updateDataList ");
        sbLIZ.append(z);
        C1344030l4z.LIZJ("CommentTaggedPeopleView", C2188811AlT.LIZIZ(sbLIZ));
        C0SWK c0swk = this.LLILZLL;
        if (c0swk != null) {
            c0swk.setTaggedPeopleFold(z);
        }
        if (z) {
            if (((ArrayList) this.LLILLL).size() > this.LLIZ - 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(((ArrayList) this.LLILLL).subList(0, this.LLIZ - 2));
                arrayList.add(new C0SWL(((ArrayList) this.LLILLL).size(), this.LLIZ, this.LLILZIL));
                DataCenter dataCenter = this.LLILZIL;
                C0SWK c0swk2 = this.LLILZLL;
                if (c0swk2 != null) {
                    mobParams3 = c0swk2.getMobParams();
                } else {
                    mobParams3 = null;
                }
                arrayList.add(new C0SWF(dataCenter, mobParams3));
                this.LL.getState().LJIILL(arrayList, null);
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.LLILLL);
            DataCenter dataCenter2 = this.LLILZIL;
            C0SWK c0swk3 = this.LLILZLL;
            if (c0swk3 != null) {
                mobParams2 = c0swk3.getMobParams();
            } else {
                mobParams2 = null;
            }
            arrayList2.add(new C0SWF(dataCenter2, mobParams2));
            this.LL.getState().LJIILL(arrayList2, null);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.LLILLL);
        arrayList3.add(new C0SWH(this.LLILZIL));
        DataCenter dataCenter3 = this.LLILZIL;
        C0SWK c0swk4 = this.LLILZLL;
        if (c0swk4 != null) {
            mobParams = c0swk4.getMobParams();
        } else {
            mobParams = null;
        }
        arrayList3.add(new C0SWF(dataCenter3, mobParams));
        this.LL.getState().LJIILL(arrayList3, null);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        InteractionTagInfo interactionTagInfo;
        AwemeStatus statusSafety;
        InteractionTagInfo interactionTagInfo2;
        AwemeStatus statusSafety2;
        C0RD4 c0rd42 = c0rd4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChanged: ");
        Object obj = c0rd42.LIZIZ;
        List<InteractionTagUserInfo> list = null;
        if (obj == null) {
            obj = null;
        }
        sbLIZ.append(obj);
        C1344030l4z.LIZJ("CommentTaggedPeopleView", C2188811AlT.LIZIZ(sbLIZ));
        String str = c0rd42.LIZ;
        if (str.hashCode() == -1771772845 && str.equals("TAGGED_PEOPLE_ACTION")) {
            Object obj2 = c0rd42.LIZIZ;
            if (obj2 == null) {
                obj2 = null;
            }
            Integer num = (Integer) obj2;
            if (num != null) {
                if (num.intValue() == 3) {
                    LIZIZ(true);
                    return;
                }
                int privateStatus = 0;
                if (num == null) {
                    return;
                }
                if (num.intValue() == 4) {
                    LIZIZ(false);
                    return;
                }
                if (num.intValue() != 2) {
                    return;
                }
                Activity activityLIZ = C1388190mED.LIZ(getContext());
                if (!(activityLIZ instanceof C19EG) || this.LLILZ == null || activityLIZ == null) {
                    return;
                }
                if (C298690BnH.LIZJ()) {
                    C737450SwJ c737450SwJ = C737450SwJ.LIZIZ;
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
                    Aweme aweme = this.LLILZ;
                    if (aweme != null && (statusSafety2 = AwemeExtKt.getStatusSafety(aweme)) != null) {
                        privateStatus = statusSafety2.getPrivateStatus();
                    }
                    Aweme aweme2 = this.LLILZ;
                    if (aweme2 != null && (interactionTagInfo2 = aweme2.getInteractionTagInfo()) != null) {
                        list = interactionTagInfo2.taggedUsers;
                    }
                    c737450SwJ.LIZLLL(c19egLIZIZ, "", aweme, privateStatus, list, new C0SWQ(this));
                    return;
                }
                C737450SwJ c737450SwJ2 = C737450SwJ.LIZIZ;
                Context context = getContext();
                Aweme aweme3 = this.LLILZ;
                if (aweme3 != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme3)) != null) {
                    privateStatus = statusSafety.getPrivateStatus();
                }
                Aweme aweme4 = this.LLILZ;
                if (aweme4 != null && (interactionTagInfo = aweme4.getInteractionTagInfo()) != null) {
                    list = interactionTagInfo.taggedUsers;
                }
                c737450SwJ2.LIZJ(context, "", aweme3, privateStatus, list, new OnActivityResultCallback() { // from class: X.0SWM
                    @Override // com.bytedance.router.OnActivityResultCallback
                    public final void onActivityResult(int i, int i2, Intent intent) {
                    }
                });
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onInteractionTagInfoEvent(InteractionTagInfoEvent interactionTagInfoEvent) {
        Aweme aweme;
        if (interactionTagInfoEvent == null) {
            return;
        }
        C0SWK c0swk = this.LLILZLL;
        if (c0swk != null && (aweme = c0swk.getAweme()) != null) {
            aweme.setInteractionTagInfo(interactionTagInfoEvent.aweme.getInteractionTagInfo());
        }
        C0SWK c0swk2 = this.LLILZLL;
        if (c0swk2 != null) {
            LIZ(this.LLILZIL, c0swk2);
        }
    }

    public C0SWJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = new ArrayList();
        this.LLIZ = 8;
        this.LLIZLLLIL = new LinkedHashSet();
        FrameLayout.inflate(context, R.layout.a4x, this);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.x2l);
        this.LLILLJJLI = tuxTextView;
        C451170Hmd c451170Hmd = (C451170Hmd) findViewById(R.id.x2m);
        this.LL = c451170Hmd;
        c451170Hmd.setItemAnimator(null);
        c451170Hmd.LJIILJJIL(TaggedPeopleAvatarCell.class, TaggedPeopleExpandCell.class, TaggedPeopleFoldCell.class, TaggedPeopleEditCell.class);
        c451170Hmd.setItemAnimator(null);
        float fIntValue = (((((Number) C473380IhM.LIZ(C1388190mED.LIZ(context)).getFirst()).intValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - tuxTextView.getPaint().measureText("Tagged:");
        final int iLIZIZ = (int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + fIntValue) / (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        this.LLIZ = iLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindTaggedPeople  maxW:");
        sbLIZ.append(fIntValue);
        sbLIZ.append("  count:");
        sbLIZ.append(iLIZIZ);
        C1344030l4z.LIZJ("CommentTaggedPeopleView", C2188811AlT.LIZIZ(sbLIZ));
        final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        c451170Hmd.addItemDecoration(new C0DXR(iLIZIZ, iLIZIZ2) { // from class: X.0GiN
            public final int LL;
            public final int LLILLJJLI;

            {
                this.LL = iLIZIZ;
                this.LLILLJJLI = iLIZIZ2;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                if (recyclerView.getChildLayoutPosition(view) >= this.LL) {
                    rect.top = this.LLILLJJLI;
                }
            }
        });
    }

    public final void LIZ(DataCenter dataCenter, C0SWK c0swk) {
        List<InteractionTagUserInfo> list;
        List<InteractionTagUserInfo> list2;
        InteractionTagInfo interactionTagInfo = c0swk.getAweme().getInteractionTagInfo();
        if (interactionTagInfo == null || (list = interactionTagInfo.taggedUsers) == null || list.isEmpty() || (C298710BnJ.LIZIZ() <= 0 && !C298690BnH.LIZIZ())) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            return;
        }
        int visibility2 = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, this);
        this.LL.setMaxLineCount(this.LLIZ);
        this.LLILZLL = c0swk;
        this.LLILZ = c0swk.getAweme();
        ((ArrayList) this.LLILLL).clear();
        this.LLIZLLLIL.clear();
        InteractionTagInfo interactionTagInfo2 = c0swk.getAweme().getInteractionTagInfo();
        if (interactionTagInfo2 != null && (list2 = interactionTagInfo2.taggedUsers) != null) {
            ArrayList arrayList = new ArrayList(list2);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C0SQA(InteractionTagInfoKt.toUser((InteractionTagUserInfo) it2.next()), c0swk.getMobParams(), this.LLIZLLLIL));
            }
            ((ArrayList) this.LLILLL).addAll(new ArrayList(arrayList2));
        }
        String quantityString = getResources().getQuantityString(2131755302, ((ArrayList) this.LLILLL).size());
        TuxTextView tuxTextView = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(quantityString);
        sbLIZ.append(':');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL = dataCenter;
        LIZIZ(c0swk.isTaggedPeopleFold());
    }
}
