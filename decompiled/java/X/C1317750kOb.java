package X;

import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.ACKResponse;
import com.bytedance.sdui.serializedData.common.CommonResponse;
import com.bytedance.sdui.serializedData.common.Frame;
import com.bytedance.sdui.serializedData.common.PollingResponse;
import com.bytedance.sdui.serializedData.common.operations.CustomOperation;
import com.bytedance.sdui.serializedData.common.operations.DetailOperation;
import com.bytedance.sdui.serializedData.common.operations.Edges;
import com.bytedance.sdui.serializedData.common.operations.EventAction;
import com.bytedance.sdui.serializedData.common.operations.ExtraOperation;
import com.bytedance.sdui.serializedData.common.operations.FontOperation;
import com.bytedance.sdui.serializedData.common.operations.Glyph;
import com.bytedance.sdui.serializedData.common.operations.GlyphList;
import com.bytedance.sdui.serializedData.common.operations.GlyphPosition;
import com.bytedance.sdui.serializedData.common.operations.GlyphRun;
import com.bytedance.sdui.serializedData.common.operations.HostOperation;
import com.bytedance.sdui.serializedData.common.operations.IRect;
import com.bytedance.sdui.serializedData.common.operations.KeyFrameOperation;
import com.bytedance.sdui.serializedData.common.operations.LayoutOperation;
import com.bytedance.sdui.serializedData.common.operations.NodeOperation;
import com.bytedance.sdui.serializedData.common.operations.Properties;
import com.bytedance.sdui.serializedData.common.operations.TreeOperation;
import com.bytedance.sdui.serializedData.common.operations.UIOperation;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317750kOb {
    public static ACKResponse LIZ(AbstractC1317820kOi abstractC1317820kOi) {
        int iLJI;
        ACKResponse aCKResponse = new ACKResponse();
        do {
            iLJI = abstractC1317820kOi.LJI();
            int i = iLJI >>> 3;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        abstractC1317820kOi.LIZIZ();
                    } else {
                        aCKResponse.LIZIZ = Long.valueOf(abstractC1317820kOi.LJIIIIZZ());
                    }
                } else {
                    aCKResponse.LIZ = abstractC1317820kOi.LIZIZ().toString(Charset.defaultCharset());
                }
            }
        } while (iLJI != 0);
        return aCKResponse;
    }

    public static AbsSerializedData LIZIZ(AbstractC1317820kOi abstractC1317820kOi) {
        int iLJI;
        AbsSerializedData absSerializedData = new AbsSerializedData();
        do {
            iLJI = abstractC1317820kOi.LJI();
            if ((iLJI >>> 3) != 0) {
                abstractC1317820kOi.LIZIZ();
            }
        } while (iLJI != 0);
        return absSerializedData;
    }

    public static Edges LIZJ(AbstractC1317820kOi abstractC1317820kOi) {
        int iLJI;
        Edges edges = new Edges();
        do {
            iLJI = abstractC1317820kOi.LJI();
            int i = iLJI >>> 3;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                abstractC1317820kOi.LIZIZ();
                            } else {
                                edges.LIZLLL = abstractC1317820kOi.LIZLLL();
                            }
                        } else {
                            edges.LIZJ = abstractC1317820kOi.LIZLLL();
                        }
                    } else {
                        edges.LIZIZ = abstractC1317820kOi.LIZLLL();
                    }
                } else {
                    edges.LIZ = abstractC1317820kOi.LIZLLL();
                }
            }
        } while (iLJI != 0);
        return edges;
    }

    public static GlyphList LIZLLL(AbstractC1317820kOi abstractC1317820kOi) {
        int iLJI;
        int iLJI2;
        int iLJI3;
        GlyphList glyphList = new GlyphList();
        ArrayList arrayList = null;
        do {
            iLJI = abstractC1317820kOi.LJI();
            int i = iLJI >>> 3;
            if (i != 0) {
                if (i != 1) {
                    abstractC1317820kOi.LIZIZ();
                } else {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    AbstractC1317820kOi abstractC1317820kOiNewCodedInput = abstractC1317820kOi.LIZIZ().newCodedInput();
                    Glyph glyph = new Glyph();
                    do {
                        iLJI2 = abstractC1317820kOiNewCodedInput.LJI();
                        int i2 = iLJI2 >>> 3;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    if (i2 != 3) {
                                        if (i2 != 4) {
                                            abstractC1317820kOiNewCodedInput.LIZIZ();
                                        } else {
                                            glyph.LIZLLL = abstractC1317820kOiNewCodedInput.LIZIZ();
                                        }
                                    } else {
                                        AbstractC1317820kOi abstractC1317820kOiNewCodedInput2 = abstractC1317820kOiNewCodedInput.LIZIZ().newCodedInput();
                                        IRect iRect = new IRect();
                                        do {
                                            iLJI3 = abstractC1317820kOiNewCodedInput2.LJI();
                                            int i3 = iLJI3 >>> 3;
                                            if (i3 != 0) {
                                                if (i3 != 1) {
                                                    if (i3 != 2) {
                                                        if (i3 != 3) {
                                                            if (i3 != 4) {
                                                                abstractC1317820kOiNewCodedInput2.LIZIZ();
                                                            } else {
                                                                iRect.LIZLLL = abstractC1317820kOiNewCodedInput2.LJ();
                                                            }
                                                        } else {
                                                            iRect.LIZJ = abstractC1317820kOiNewCodedInput2.LJ();
                                                        }
                                                    } else {
                                                        iRect.LIZIZ = abstractC1317820kOiNewCodedInput2.LJ();
                                                    }
                                                } else {
                                                    iRect.LIZ = abstractC1317820kOiNewCodedInput2.LJ();
                                                }
                                            }
                                        } while (iLJI3 != 0);
                                        glyph.LIZJ = iRect;
                                    }
                                } else {
                                    glyph.LIZIZ = abstractC1317820kOiNewCodedInput.LJII();
                                }
                            } else {
                                glyph.LIZ = abstractC1317820kOiNewCodedInput.LJII();
                            }
                        }
                    } while (iLJI2 != 0);
                    arrayList.add(glyph);
                }
            }
        } while (iLJI != 0);
        glyphList.LIZ = arrayList;
        return glyphList;
    }

    public static NodeOperation LJ(AbstractC1317820kOi abstractC1317820kOi) {
        int iLJI;
        int iLJI2;
        NodeOperation nodeOperation = new NodeOperation();
        ArrayList arrayList = null;
        do {
            iLJI = abstractC1317820kOi.LJI();
            int i = iLJI >>> 3;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                abstractC1317820kOi.LIZIZ();
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.add(abstractC1317820kOi.LIZIZ().toString(Charset.defaultCharset()));
                            }
                        } else {
                            AbstractC1317820kOi abstractC1317820kOiNewCodedInput = abstractC1317820kOi.LIZIZ().newCodedInput();
                            Properties properties = new Properties();
                            do {
                                iLJI2 = abstractC1317820kOiNewCodedInput.LJI();
                                int i2 = iLJI2 >>> 3;
                                if (i2 != 0) {
                                    if (i2 != 1) {
                                        abstractC1317820kOiNewCodedInput.LIZIZ();
                                    } else {
                                        properties.LIZ = abstractC1317820kOiNewCodedInput.LIZIZ().toString(Charset.defaultCharset());
                                    }
                                }
                            } while (iLJI2 != 0);
                            nodeOperation.LIZJ = properties;
                        }
                    } else {
                        nodeOperation.LIZIZ = abstractC1317820kOi.LIZIZ().toString(Charset.defaultCharset());
                    }
                } else {
                    nodeOperation.LIZ = Long.valueOf(abstractC1317820kOi.LJIIIIZZ());
                }
            }
        } while (iLJI != 0);
        nodeOperation.LIZLLL = arrayList;
        return nodeOperation;
    }

    public static PollingResponse LJFF(AbstractC1317820kOi abstractC1317820kOi) {
        int iLJI;
        int iLJI2;
        int iLJI3;
        int iLJI4;
        int iLJI5;
        int iLJI6;
        int iLJI7;
        int iLJI8;
        int iLJI9;
        int iLJI10;
        int iLJI11;
        int iLJI12;
        int iLJI13;
        int iLJI14;
        PollingResponse pollingResponse = new PollingResponse();
        do {
            iLJI = abstractC1317820kOi.LJI();
            int i = 1;
            int i2 = 2;
            switch (iLJI >>> 3) {
                case 0:
                    break;
                case 1:
                    pollingResponse.LIZ = abstractC1317820kOi.LIZIZ().toString(Charset.defaultCharset());
                    break;
                case 2:
                    AbstractC1317820kOi abstractC1317820kOiNewCodedInput = abstractC1317820kOi.LIZIZ().newCodedInput();
                    Frame frame = new Frame();
                    ArrayList arrayList = null;
                    do {
                        iLJI3 = abstractC1317820kOiNewCodedInput.LJI();
                        int i3 = iLJI3 >>> 3;
                        if (i3 != 0) {
                            if (i3 != i2) {
                                int i4 = 3;
                                if (i3 != 3) {
                                    abstractC1317820kOiNewCodedInput.LIZIZ();
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    AbstractC1317820kOi abstractC1317820kOiNewCodedInput2 = abstractC1317820kOiNewCodedInput.LIZIZ().newCodedInput();
                                    HostOperation hostOperation = new HostOperation();
                                    do {
                                        iLJI4 = abstractC1317820kOiNewCodedInput2.LJI();
                                        switch (iLJI4 >>> 3) {
                                            case 0:
                                                break;
                                            case 1:
                                                hostOperation.LIZ = LIZIZ(abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput());
                                                break;
                                            case 2:
                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput3 = abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput();
                                                FontOperation fontOperation = new FontOperation();
                                                do {
                                                    iLJI14 = abstractC1317820kOiNewCodedInput3.LJI();
                                                    int i5 = iLJI14 >>> 3;
                                                    if (i5 != 0) {
                                                        if (i5 != 1) {
                                                            if (i5 != 2) {
                                                                if (i5 != 3) {
                                                                    if (i5 != 4) {
                                                                        abstractC1317820kOiNewCodedInput3.LIZIZ();
                                                                    } else {
                                                                        fontOperation.LIZLLL = abstractC1317820kOiNewCodedInput3.LIZIZ();
                                                                    }
                                                                } else {
                                                                    fontOperation.LIZJ = Integer.valueOf(abstractC1317820kOiNewCodedInput3.LJII());
                                                                }
                                                            } else {
                                                                fontOperation.LIZIZ = Integer.valueOf(abstractC1317820kOiNewCodedInput3.LJII());
                                                            }
                                                        } else {
                                                            fontOperation.LIZ = Integer.valueOf(abstractC1317820kOiNewCodedInput3.LIZJ());
                                                        }
                                                    }
                                                } while (iLJI14 != 0);
                                                i4 = 3;
                                                hostOperation.LIZIZ = fontOperation;
                                                break;
                                            case 3:
                                            default:
                                                abstractC1317820kOiNewCodedInput2.LIZIZ();
                                                break;
                                            case 4:
                                                hostOperation.LIZJ = LJ(abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput());
                                                i4 = 3;
                                                break;
                                            case 5:
                                                hostOperation.LIZLLL = LJ(abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput());
                                                i4 = 3;
                                                break;
                                            case 6:
                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput4 = abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput();
                                                LayoutOperation layoutOperation = new LayoutOperation();
                                                do {
                                                    iLJI13 = abstractC1317820kOiNewCodedInput4.LJI();
                                                    switch (iLJI13 >>> 3) {
                                                        case 0:
                                                            break;
                                                        case 1:
                                                            layoutOperation.LIZ = abstractC1317820kOiNewCodedInput4.LJFF();
                                                            break;
                                                        case 2:
                                                            layoutOperation.LIZIZ = abstractC1317820kOiNewCodedInput4.LIZLLL();
                                                            break;
                                                        case 3:
                                                            layoutOperation.LIZJ = abstractC1317820kOiNewCodedInput4.LIZLLL();
                                                            break;
                                                        case 4:
                                                            layoutOperation.LIZLLL = abstractC1317820kOiNewCodedInput4.LIZLLL();
                                                            break;
                                                        case 5:
                                                            layoutOperation.LJ = abstractC1317820kOiNewCodedInput4.LIZLLL();
                                                            break;
                                                        case 6:
                                                            layoutOperation.LJFF = abstractC1317820kOiNewCodedInput4.LIZLLL();
                                                            break;
                                                        case 7:
                                                            layoutOperation.LJI = LIZJ(abstractC1317820kOiNewCodedInput4.LIZIZ().newCodedInput());
                                                            break;
                                                        case 8:
                                                            layoutOperation.LJII = LIZJ(abstractC1317820kOiNewCodedInput4.LIZIZ().newCodedInput());
                                                            break;
                                                        case BdTuring.TYPE_ECAF /* 9 */:
                                                            layoutOperation.LJIIIIZZ = LIZJ(abstractC1317820kOiNewCodedInput4.LIZIZ().newCodedInput());
                                                            break;
                                                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                            layoutOperation.LJIIIZ = LIZJ(abstractC1317820kOiNewCodedInput4.LIZIZ().newCodedInput());
                                                            break;
                                                        case BdTuring.TYPE_EMAIL /* 11 */:
                                                            layoutOperation.LJIIJ = LIZJ(abstractC1317820kOiNewCodedInput4.LIZIZ().newCodedInput());
                                                            break;
                                                        default:
                                                            abstractC1317820kOiNewCodedInput4.LIZIZ();
                                                            break;
                                                    }
                                                } while (iLJI13 != 0);
                                                hostOperation.LJ = layoutOperation;
                                                i4 = 3;
                                                break;
                                            case 7:
                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput5 = abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput();
                                                ExtraOperation extraOperation = new ExtraOperation();
                                                ArrayList arrayList2 = null;
                                                do {
                                                    iLJI10 = abstractC1317820kOiNewCodedInput5.LJI();
                                                    int i6 = iLJI10 >>> 3;
                                                    if (i6 != 0) {
                                                        if (i6 != i) {
                                                            if (i6 != 2) {
                                                                abstractC1317820kOiNewCodedInput5.LIZIZ();
                                                            } else {
                                                                if (arrayList2 == null) {
                                                                    arrayList2 = new ArrayList();
                                                                }
                                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput6 = abstractC1317820kOiNewCodedInput5.LIZIZ().newCodedInput();
                                                                GlyphRun glyphRun = new GlyphRun();
                                                                ArrayList arrayList3 = null;
                                                                do {
                                                                    iLJI11 = abstractC1317820kOiNewCodedInput6.LJI();
                                                                    int i7 = iLJI11 >>> 3;
                                                                    if (i7 != 0) {
                                                                        if (i7 != i) {
                                                                            if (i7 != 2) {
                                                                                if (i7 != 3) {
                                                                                    if (i7 != 4) {
                                                                                        abstractC1317820kOiNewCodedInput6.LIZIZ();
                                                                                    } else {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        AbstractC1317820kOi abstractC1317820kOiNewCodedInput7 = abstractC1317820kOiNewCodedInput6.LIZIZ().newCodedInput();
                                                                                        GlyphPosition glyphPosition = new GlyphPosition();
                                                                                        do {
                                                                                            iLJI12 = abstractC1317820kOiNewCodedInput7.LJI();
                                                                                            int i8 = iLJI12 >>> 3;
                                                                                            if (i8 != 0) {
                                                                                                if (i8 != 1) {
                                                                                                    if (i8 != 2) {
                                                                                                        if (i8 != 3) {
                                                                                                            abstractC1317820kOiNewCodedInput7.LIZIZ();
                                                                                                        } else {
                                                                                                            glyphPosition.LIZJ = abstractC1317820kOiNewCodedInput7.LIZLLL();
                                                                                                        }
                                                                                                    } else {
                                                                                                        glyphPosition.LIZIZ = abstractC1317820kOiNewCodedInput7.LIZLLL();
                                                                                                    }
                                                                                                } else {
                                                                                                    glyphPosition.LIZ = abstractC1317820kOiNewCodedInput7.LJII();
                                                                                                }
                                                                                            }
                                                                                        } while (iLJI12 != 0);
                                                                                        arrayList3.add(glyphPosition);
                                                                                    }
                                                                                } else {
                                                                                    glyphRun.LIZJ = abstractC1317820kOiNewCodedInput6.LIZLLL();
                                                                                }
                                                                            } else {
                                                                                glyphRun.LIZIZ = abstractC1317820kOiNewCodedInput6.LIZJ();
                                                                            }
                                                                        } else {
                                                                            glyphRun.LIZ = abstractC1317820kOiNewCodedInput6.LIZJ();
                                                                        }
                                                                    }
                                                                    i = 1;
                                                                } while (iLJI11 != 0);
                                                                glyphRun.LIZLLL = arrayList3;
                                                                arrayList2.add(glyphRun);
                                                            }
                                                        } else {
                                                            extraOperation.LIZ = Long.valueOf(abstractC1317820kOiNewCodedInput5.LJFF());
                                                        }
                                                    }
                                                } while (iLJI10 != 0);
                                                extraOperation.LIZIZ = arrayList2;
                                                hostOperation.LJFF = extraOperation;
                                                i4 = 3;
                                                break;
                                            case 8:
                                                hostOperation.LJI = LJI(abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput());
                                                i4 = 3;
                                                break;
                                            case BdTuring.TYPE_ECAF /* 9 */:
                                                hostOperation.LJII = LJI(abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput());
                                                i4 = 3;
                                                break;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                hostOperation.LJIIIIZZ = LJI(abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput());
                                                i4 = 3;
                                                break;
                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput8 = abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput();
                                                KeyFrameOperation keyFrameOperation = new KeyFrameOperation();
                                                do {
                                                    iLJI9 = abstractC1317820kOiNewCodedInput8.LJI();
                                                    int i9 = iLJI9 >>> 3;
                                                    if (i9 != 0) {
                                                        if (i9 != i) {
                                                            abstractC1317820kOiNewCodedInput8.LIZIZ();
                                                        } else {
                                                            keyFrameOperation.LIZ = abstractC1317820kOiNewCodedInput8.LIZIZ().toString(Charset.defaultCharset());
                                                        }
                                                    }
                                                } while (iLJI9 != 0);
                                                hostOperation.LJIIIZ = keyFrameOperation;
                                                i4 = 3;
                                                break;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput9 = abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput();
                                                EventAction eventAction = new EventAction();
                                                do {
                                                    iLJI8 = abstractC1317820kOiNewCodedInput9.LJI();
                                                    int i10 = iLJI8 >>> 3;
                                                    if (i10 != 0) {
                                                        if (i10 != i) {
                                                            if (i10 != 2) {
                                                                if (i10 != 3) {
                                                                    abstractC1317820kOiNewCodedInput9.LIZIZ();
                                                                } else {
                                                                    eventAction.LIZJ = Long.valueOf(abstractC1317820kOiNewCodedInput9.LJFF());
                                                                }
                                                            } else {
                                                                eventAction.LIZIZ = abstractC1317820kOiNewCodedInput9.LIZIZ().toString(Charset.defaultCharset());
                                                            }
                                                        } else {
                                                            eventAction.LIZ = abstractC1317820kOiNewCodedInput9.LIZIZ().toString(Charset.defaultCharset());
                                                        }
                                                    }
                                                } while (iLJI8 != 0);
                                                hostOperation.LJIIJ = eventAction;
                                                i4 = 3;
                                                break;
                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput10 = abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput();
                                                UIOperation uIOperation = new UIOperation();
                                                ArrayList arrayList4 = null;
                                                do {
                                                    iLJI7 = abstractC1317820kOiNewCodedInput10.LJI();
                                                    int i11 = iLJI7 >>> 3;
                                                    if (i11 != 0) {
                                                        if (i11 != i) {
                                                            if (i11 != i2) {
                                                                if (i11 != 3) {
                                                                    if (i11 != 4) {
                                                                        if (i11 != 5) {
                                                                            abstractC1317820kOiNewCodedInput10.LIZIZ();
                                                                        } else {
                                                                            uIOperation.LJ = Long.valueOf(abstractC1317820kOiNewCodedInput10.LJFF());
                                                                        }
                                                                    } else {
                                                                        uIOperation.LIZLLL = abstractC1317820kOiNewCodedInput10.LIZIZ().toString(Charset.defaultCharset());
                                                                    }
                                                                } else {
                                                                    uIOperation.LIZJ = abstractC1317820kOiNewCodedInput10.LIZIZ().toString(Charset.defaultCharset());
                                                                }
                                                            } else {
                                                                if (arrayList4 == null) {
                                                                    arrayList4 = new ArrayList();
                                                                }
                                                                arrayList4.add(abstractC1317820kOiNewCodedInput10.LIZIZ().toString(Charset.defaultCharset()));
                                                            }
                                                        } else {
                                                            uIOperation.LIZ = abstractC1317820kOiNewCodedInput10.LIZIZ().toString(Charset.defaultCharset());
                                                        }
                                                    }
                                                    i2 = 2;
                                                } while (iLJI7 != 0);
                                                uIOperation.LIZIZ = arrayList4;
                                                hostOperation.LJIIJJI = uIOperation;
                                                i4 = 3;
                                                break;
                                            case 14:
                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput11 = abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput();
                                                CustomOperation customOperation = new CustomOperation();
                                                do {
                                                    iLJI6 = abstractC1317820kOiNewCodedInput11.LJI();
                                                    int i12 = iLJI6 >>> 3;
                                                    if (i12 != 0) {
                                                        if (i12 != i) {
                                                            if (i12 != i2) {
                                                                if (i12 != i4) {
                                                                    if (i12 != 4) {
                                                                        abstractC1317820kOiNewCodedInput11.LIZIZ();
                                                                    } else {
                                                                        customOperation.LIZLLL = Long.valueOf(abstractC1317820kOiNewCodedInput11.LJFF());
                                                                    }
                                                                } else {
                                                                    customOperation.LIZJ = abstractC1317820kOiNewCodedInput11.LIZIZ().toString(Charset.defaultCharset());
                                                                }
                                                            } else {
                                                                customOperation.LIZIZ = abstractC1317820kOiNewCodedInput11.LIZIZ().toString(Charset.defaultCharset());
                                                            }
                                                        } else {
                                                            customOperation.LIZ = abstractC1317820kOiNewCodedInput11.LIZIZ().toString(Charset.defaultCharset());
                                                        }
                                                    }
                                                    i4 = 3;
                                                } while (iLJI6 != 0);
                                                hostOperation.LJIIL = customOperation;
                                                break;
                                            case 15:
                                                AbstractC1317820kOi abstractC1317820kOiNewCodedInput12 = abstractC1317820kOiNewCodedInput2.LIZIZ().newCodedInput();
                                                DetailOperation detailOperation = new DetailOperation();
                                                do {
                                                    iLJI5 = abstractC1317820kOiNewCodedInput12.LJI();
                                                    int i13 = iLJI5 >>> 3;
                                                    if (i13 != 0) {
                                                        if (i13 != i) {
                                                            if (i13 != i2) {
                                                                abstractC1317820kOiNewCodedInput12.LIZIZ();
                                                            } else {
                                                                detailOperation.LIZIZ = abstractC1317820kOiNewCodedInput12.LIZIZ().toString(Charset.defaultCharset());
                                                            }
                                                        } else {
                                                            detailOperation.LIZ = abstractC1317820kOiNewCodedInput12.LJ();
                                                        }
                                                    }
                                                } while (iLJI5 != 0);
                                                hostOperation.LJIILIIL = detailOperation;
                                                break;
                                        }
                                        i = 1;
                                        i2 = 2;
                                    } while (iLJI4 != 0);
                                    arrayList.add(hostOperation);
                                }
                            } else {
                                frame.LIZ = abstractC1317820kOiNewCodedInput.LJIIIIZZ();
                            }
                        }
                    } while (iLJI3 != 0);
                    frame.LIZIZ = arrayList;
                    pollingResponse.LIZIZ = frame;
                    break;
                case 3:
                    pollingResponse.LIZJ = LIZIZ(abstractC1317820kOi.LIZIZ().newCodedInput());
                    break;
                case 4:
                    pollingResponse.LIZLLL = LIZIZ(abstractC1317820kOi.LIZIZ().newCodedInput());
                    break;
                case 5:
                    AbstractC1317820kOi abstractC1317820kOiNewCodedInput13 = abstractC1317820kOi.LIZIZ().newCodedInput();
                    CommonResponse commonResponse = new CommonResponse();
                    do {
                        iLJI2 = abstractC1317820kOiNewCodedInput13.LJI();
                        int i14 = iLJI2 >>> 3;
                        if (i14 != 0) {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    abstractC1317820kOiNewCodedInput13.LIZIZ();
                                } else {
                                    commonResponse.LIZIZ = abstractC1317820kOiNewCodedInput13.LIZIZ().toString(Charset.defaultCharset());
                                }
                            } else {
                                commonResponse.LIZ = abstractC1317820kOiNewCodedInput13.LJ();
                            }
                        }
                    } while (iLJI2 != 0);
                    pollingResponse.LJ = commonResponse;
                    break;
                case 6:
                    pollingResponse.LJFF = abstractC1317820kOi.LIZIZ().toString(Charset.defaultCharset());
                    break;
                case 7:
                    pollingResponse.LJI = abstractC1317820kOi.LIZIZ().toString(Charset.defaultCharset());
                    break;
                case 8:
                    pollingResponse.LJII = LIZ(abstractC1317820kOi.LIZIZ().newCodedInput());
                    break;
                default:
                    abstractC1317820kOi.LIZIZ();
                    break;
            }
        } while (iLJI != 0);
        return pollingResponse;
    }

    public static TreeOperation LJI(AbstractC1317820kOi abstractC1317820kOi) {
        int iLJI;
        TreeOperation treeOperation = new TreeOperation();
        do {
            iLJI = abstractC1317820kOi.LJI();
            int i = iLJI >>> 3;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            abstractC1317820kOi.LIZIZ();
                        } else {
                            treeOperation.LIZJ = abstractC1317820kOi.LJFF();
                        }
                    } else {
                        treeOperation.LIZIZ = abstractC1317820kOi.LJFF();
                    }
                } else {
                    treeOperation.LIZ = abstractC1317820kOi.LJFF();
                }
            }
        } while (iLJI != 0);
        return treeOperation;
    }
}
