package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.k0;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;

/* JADX INFO: renamed from: X.130p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199413130p extends AbstractC19933512yz<C199413130p> implements InterfaceC199411130n {
    public int LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public Object LLJI;
    public Object LLJIJIL;
    public Object LLJILJIL;
    public int LLJILJILJ;
    public Object LLJILLL;
    public C131Y LLJJ;
    public C130N<C131Y, C131Z, InterfaceC199415130r> LLJJI;
    public boolean LLJJIII;

    @Override // X.AbstractC19933512yz
    public final C19935812zM LJIIL() {
        C19935812zM c19935812zM = C131K.LJIILIIL;
        c19935812zM.LIZ(C199412130o.class, C199413130p.class);
        return c19935812zM;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LJIJJ, reason: merged with bridge method [inline-methods] */
    public final C199412130o buildPartial() {
        int i;
        C199412130o c199412130o = new C199412130o(this);
        int i2 = this.LLILZIL;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c199412130o.name_ = this.LLILZLL;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c199412130o.number_ = this.LLIZ;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c199412130o.label_ = this.LLIZLLLIL;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c199412130o.type_ = this.LLJ;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c199412130o.typeName_ = this.LLJI;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c199412130o.extendee_ = this.LLJIJIL;
                i |= 32;
            }
            if ((i2 & 64) != 0) {
                c199412130o.defaultValue_ = this.LLJILJIL;
                i |= 64;
            }
            if ((i2 & 128) != 0) {
                c199412130o.oneofIndex_ = this.LLJILJILJ;
                i |= 128;
            }
            if ((i2 & 256) != 0) {
                c199412130o.jsonName_ = this.LLJILLL;
                i |= 256;
            }
            if ((i2 & 512) != 0) {
                C130N<C131Y, C131Z, InterfaceC199415130r> c130n = this.LLJJI;
                c199412130o.options_ = c130n == null ? this.LLJJ : (C131Y) c130n.LIZIZ();
                i |= 512;
            }
            if ((i2 & 1024) != 0) {
                c199412130o.proto3Optional_ = this.LLJJIII;
                i |= 1024;
            }
            c199412130o.LLILLJJLI |= i;
        }
        LJIILL();
        return c199412130o;
    }

    public final C130N<C131Y, C131Z, InterfaceC199415130r> LJIJJLI() {
        if (this.LLJJI == null) {
            C131Y defaultInstance = this.LLJJ;
            if (defaultInstance == null) {
                defaultInstance = C131Y.getDefaultInstance();
            }
            this.LLJJI = new C130N<>(defaultInstance, LJIIJJI(), this.LLILLL);
            this.LLJJ = null;
        }
        return this.LLJJI;
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        InterfaceC19916512wF interfaceC19916512wFLIZLLL;
        if ((this.LLILZIL & 512) != 0) {
            C130N<C131Y, C131Z, InterfaceC199415130r> c130n = this.LLJJI;
            if (c130n == null) {
                interfaceC19916512wFLIZLLL = this.LLJJ;
                if (interfaceC19916512wFLIZLLL == null) {
                    interfaceC19916512wFLIZLLL = C131Y.getDefaultInstance();
                }
            } else {
                interfaceC19916512wFLIZLLL = c130n.LIZLLL();
            }
            if (!interfaceC19916512wFLIZLLL.isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public C199413130p() {
        this.LLILZLL = "";
        this.LLIZLLLIL = 1;
        this.LLJ = 1;
        this.LLJI = "";
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJILLL = "";
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19925612xi build() {
        C199412130o c199412130oBuildPartial = buildPartial();
        if (c199412130oBuildPartial.isInitialized()) {
            return c199412130oBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199412130oBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return C199412130o.getDefaultInstance();
    }

    @Override // X.AbstractC19933512yz, X.InterfaceC19931912yj, X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return C131K.LJIIL;
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19928112y7
    public final InterfaceC19930912yZ build() {
        C199412130o c199412130oBuildPartial = buildPartial();
        if (c199412130oBuildPartial.isInitialized()) {
            return c199412130oBuildPartial;
        }
        throw AbstractC19931812yi.LJI(c199412130oBuildPartial);
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return C199412130o.getDefaultInstance();
    }

    public C199413130p(InterfaceC19935412zI interfaceC19935412zI) {
        super(interfaceC19935412zI);
        this.LLILZLL = "";
        this.LLIZLLLIL = 1;
        this.LLJ = 1;
        this.LLJI = "";
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJILLL = "";
        if (k0.alwaysUseFieldBuilders) {
            LJIJJLI();
        }
    }

    @Override // X.AbstractC19931812yi
    public final AbstractC19931812yi LJ(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199412130o) {
            LJIL((C199412130o) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    public final void LJIL(C199412130o c199412130o) {
        C131Y c131y;
        if (c199412130o == C199412130o.getDefaultInstance()) {
            return;
        }
        if (c199412130o.hasName()) {
            this.LLILZLL = c199412130o.name_;
            this.LLILZIL |= 1;
            LJIILLIIL();
        }
        if (c199412130o.hasNumber()) {
            this.LLIZ = c199412130o.getNumber();
            this.LLILZIL |= 2;
            LJIILLIIL();
        }
        if (c199412130o.hasLabel()) {
            C130F label = c199412130o.getLabel();
            label.getClass();
            this.LLILZIL |= 4;
            this.LLIZLLLIL = label.getNumber();
            LJIILLIIL();
        }
        if (c199412130o.hasType()) {
            C130D type = c199412130o.getType();
            type.getClass();
            this.LLILZIL |= 8;
            this.LLJ = type.getNumber();
            LJIILLIIL();
        }
        if (c199412130o.hasTypeName()) {
            this.LLJI = c199412130o.typeName_;
            this.LLILZIL |= 16;
            LJIILLIIL();
        }
        if (c199412130o.hasExtendee()) {
            this.LLJIJIL = c199412130o.extendee_;
            this.LLILZIL |= 32;
            LJIILLIIL();
        }
        if (c199412130o.hasDefaultValue()) {
            this.LLJILJIL = c199412130o.defaultValue_;
            this.LLILZIL |= 64;
            LJIILLIIL();
        }
        if (c199412130o.hasOneofIndex()) {
            this.LLJILJILJ = c199412130o.getOneofIndex();
            this.LLILZIL |= 128;
            LJIILLIIL();
        }
        if (c199412130o.hasJsonName()) {
            this.LLJILLL = c199412130o.jsonName_;
            this.LLILZIL |= 256;
            LJIILLIIL();
        }
        if (c199412130o.hasOptions()) {
            C131Y options = c199412130o.getOptions();
            C130N<C131Y, C131Z, InterfaceC199415130r> c130n = this.LLJJI;
            if (c130n == null) {
                if ((this.LLILZIL & 512) != 0 && (c131y = this.LLJJ) != null && c131y != C131Y.getDefaultInstance()) {
                    this.LLILZIL |= 512;
                    LJIILLIIL();
                    ((C131Z) LJIJJLI().LIZJ()).LJJIJ(options);
                } else {
                    this.LLJJ = options;
                }
            } else {
                c130n.LJ(options);
            }
            if (this.LLJJ != null) {
                this.LLILZIL |= 512;
                LJIILLIIL();
            }
        }
        if (c199412130o.hasProto3Optional()) {
            this.LLJJIII = c199412130o.getProto3Optional();
            this.LLILZIL |= 1024;
            LJIILLIIL();
        }
        LJFF(c199412130o.getUnknownFields());
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.InterfaceC19931912yj
    public final InterfaceC19931912yj LJJIL(InterfaceC19930912yZ interfaceC19930912yZ) {
        if (interfaceC19930912yZ instanceof C199412130o) {
            LJIL((C199412130o) interfaceC19930912yZ);
            return this;
        }
        super.LJ(interfaceC19930912yZ);
        return this;
    }

    @Override // X.AbstractC19931812yi
    public final /* bridge */ /* synthetic */ AbstractC19931812yi LIZLLL(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJI(abstractC19927312xz, c19926312xp);
        return this;
    }

    public final void LJJI(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        c19926312xp.getClass();
        while (true) {
            try {
                try {
                    int iLJJIJIL = abstractC19927312xz.LJJIJIL();
                    switch (iLJJIJIL) {
                        case 0:
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            this.LLILZLL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 1;
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            this.LLJIJIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 32;
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            this.LLIZ = abstractC19927312xz.LJIJJLI();
                            this.LLILZIL |= 2;
                            break;
                        case 32:
                            int iLJIILLIIL = abstractC19927312xz.LJIILLIIL();
                            if (C130F.forNumber(iLJIILLIIL) == null) {
                                LJIILJJIL(4, iLJIILLIIL);
                            } else {
                                this.LLIZLLLIL = iLJIILLIIL;
                                this.LLILZIL |= 4;
                            }
                            break;
                        case 40:
                            int iLJIILLIIL2 = abstractC19927312xz.LJIILLIIL();
                            if (C130D.forNumber(iLJIILLIIL2) == null) {
                                LJIILJJIL(5, iLJIILLIIL2);
                            } else {
                                this.LLJ = iLJIILLIIL2;
                                this.LLILZIL |= 8;
                            }
                            break;
                        case BaseNotice.RECOMMEND_LIVE /* 50 */:
                            this.LLJI = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 16;
                            break;
                        case 58:
                            this.LLJILJIL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 64;
                            break;
                        case 66:
                            abstractC19927312xz.LJJI(LJIJJLI().LIZJ(), c19926312xp);
                            this.LLILZIL |= 512;
                            break;
                        case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                            this.LLJILJILJ = abstractC19927312xz.LJIJJLI();
                            this.LLILZIL |= 128;
                            break;
                        case 82:
                            this.LLJILLL = abstractC19927312xz.LJIILJJIL();
                            this.LLILZIL |= 256;
                            break;
                        case 136:
                            this.LLJJIII = abstractC19927312xz.LJIILIIL();
                            this.LLILZIL |= 1024;
                            break;
                        default:
                            if (!LJIJ(abstractC19927312xz, c19926312xp, iLJJIJIL)) {
                            }
                            break;
                    }
                } catch (C19926612xs e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e.unwrapIOException();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIILLIIL();
                throw th;
            }
        }
        LJIILLIIL();
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ AbstractC19924512xX mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJI(abstractC19927312xz, c19926312xp);
        return this;
    }

    @Override // X.AbstractC19931812yi, X.AbstractC19924512xX, X.InterfaceC19928112y7
    public final /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJJI(abstractC19927312xz, c19926312xp);
        return this;
    }
}
