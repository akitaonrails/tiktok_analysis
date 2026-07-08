package X;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0sgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnLongClickListenerC1636300sgO extends C1636160sgA implements View.OnLongClickListener {
    public final View LLJIJIL;
    public final InterfaceC1631620sYq<Effect, Integer, Integer, Unit> LLJILJIL;
    public ShortVideoContext LLJILJILJ;

    public final boolean d6() {
        Intent intent;
        boolean booleanExtra = false;
        if ((this.itemView.getContext() instanceof Activity) && (intent = ((Activity) this.itemView.getContext()).getIntent()) != null) {
            try {
                if (intent.getStringExtra("first_face_sticker") != null) {
                    if (intent.getBooleanExtra("template_tmp_key", false)) {
                        return false;
                    }
                    booleanExtra = intent.getBooleanExtra("move_sticker_to_first", false);
                    if (booleanExtra) {
                        intent.putExtra("template_tmp_key", true);
                        return booleanExtra;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return booleanExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int adapterPosition;
        DATA data = this.LL;
        if (data == 0 || -1 == (adapterPosition = getAdapterPosition())) {
            return true;
        }
        this.LLJILJIL.invoke(data, Integer.valueOf(adapterPosition), Integer.valueOf(this.LLILLJJLI));
        return true;
    }

    @Override // X.C1636160sgA, X.AbstractViewOnClickListenerC1636290sgN, X.C1636260sgK
    public final /* bridge */ /* synthetic */ void N5(int i, EnumC1641420soe enumC1641420soe, Integer num, Object obj) {
        N5((Effect) obj, enumC1641420soe, num, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1636160sgA, X.AbstractViewOnClickListenerC1636290sgN
    /* JADX INFO: renamed from: T5 */
    public final void N5(Effect effect, EnumC1641420soe enumC1641420soe, Integer num, int i) {
        MobileEffect mobileEffect;
        boolean z;
        String str;
        C1443680nfi c1443680nfi;
        int i2;
        super.N5(effect, enumC1641420soe, num, i);
        InterfaceC1631540sYi<Effect> interfaceC1631540sYi = this.LLIZ;
        if ((interfaceC1631540sYi instanceof MyEffectsViewModel) && interfaceC1631540sYi != null) {
            this.itemView.setOnLongClickListener(this);
        }
        if (effect instanceof MobileEffect) {
            mobileEffect = (MobileEffect) effect;
        } else {
            mobileEffect = null;
        }
        if (mobileEffect != null && mobileEffect.getModerationStatus() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.LLJIJIL;
        if (view != null) {
            if (!z && !(effect instanceof DraftEffect)) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        TextView textView = this.LLILZIL.getTextView();
        if (textView != null) {
            textView.setText(effect.getName());
        }
        if (effect instanceof DraftEffect) {
            InterfaceC1636220sgG interfaceC1636220sgG = this.LLJ;
            if (interfaceC1636220sgG != null && interfaceC1636220sgG.LIZ(this.LLILZLL.LLILIL(), effect)) {
                C1324800kZy imageView = this.LLILZIL.getImageView();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
                imageView.setAlpha(1.0f);
            } else {
                C1324800kZy imageView2 = this.LLILZIL.getImageView();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView2);
                imageView2.setAlpha(0.5f);
            }
        }
        try {
            InterfaceC1636220sgG interfaceC1636220sgG2 = this.LLJ;
            if (interfaceC1636220sgG2 != null && interfaceC1636220sgG2.LIZ(this.LLILZLL.LLILIL(), (Effect) this.LL) && d6()) {
                ShortVideoContext shortVideoContext = this.LLJILJILJ;
                String str2 = "";
                if (shortVideoContext != null) {
                    CreativeModel creativeModel = shortVideoContext.creativeModel;
                    if (creativeModel == null || (c1443680nfi = creativeModel.mecReportModel) == null || (str = c1443680nfi.LIZ) == null) {
                        str = "";
                        if (shortVideoContext == null) {
                            return;
                        }
                    }
                    Pair[] pairArr = new Pair[8];
                    pairArr[0] = new Pair("creation_id", shortVideoContext.getCreationId());
                    String str3 = shortVideoContext.enterFrom;
                    if (str3 == null) {
                        str3 = "";
                    }
                    pairArr[1] = new Pair("enter_from", str3);
                    String str4 = shortVideoContext.shootWay;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    pairArr[2] = new Pair("shoot_way", str2);
                    pairArr[3] = new Pair("template_id", effect.getId());
                    pairArr[4] = new Pair("template_name", effect.getName());
                    pairArr[5] = new Pair("is_existing_effect", CardStruct.IStatusCode.DEFAULT);
                    pairArr[6] = new Pair("is_pro_template", "1");
                    pairArr[7] = new Pair("user_entry_method", str);
                    C1449260noi.LJ("click_mobile_effect_template", C2097608Jq.LJIIIIZZ(pairArr));
                    this.LLJILJILJ = null;
                }
            }
        } catch (Error e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnLongClickListenerC1636300sgO(View view, C1662850tND c1662850tND, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi<Effect> interfaceC1631540sYi, View view2, InterfaceC1631620sYq<? super Effect, ? super Integer, ? super Integer, Unit> interfaceC1631620sYq, ShortVideoContext shortVideoContext) {
        super(view, c1662850tND, interfaceC1624480sNK, interfaceC1635560sfC, interfaceC1631540sYi);
        this.LLJIJIL = view2;
        this.LLJILJIL = interfaceC1631620sYq;
        this.LLJILJILJ = shortVideoContext;
    }
}
