package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550802Cs extends Message<C550802Cs, C02MA> {
    public static final ProtoAdapter<C550802Cs> ADAPTER = new ProtoAdapter<C550802Cs>() { // from class: X.025v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550802Cs decode(ProtoReader protoReader) {
            C550802Cs c550802Cs = new C550802Cs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 100) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c550802Cs.extra = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c550802Cs.is_promote_ad_label = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    c550802Cs.label_color = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c550802Cs.label_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c550802Cs.label_click = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c550802Cs.label_icon = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550802Cs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550802Cs c550802Cs) {
            C550802Cs c550802Cs2 = c550802Cs;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c550802Cs2.label_icon) + protoAdapter.encodedSizeWithTag(2, c550802Cs2.label_click);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c550802Cs2.label_text) + protoAdapter2.encodedSizeWithTag(4, c550802Cs2.label_color) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c550802Cs2.is_promote_ad_label) + protoAdapter2.encodedSizeWithTag(100, c550802Cs2.extra) + c550802Cs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550802Cs c550802Cs) {
            C550802Cs c550802Cs2 = c550802Cs;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c550802Cs2.label_icon);
            protoAdapter.encodeWithTag(protoWriter, 2, c550802Cs2.label_click);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c550802Cs2.label_text);
            protoAdapter2.encodeWithTag(protoWriter, 4, c550802Cs2.label_color);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c550802Cs2.is_promote_ad_label);
            protoAdapter2.encodeWithTag(protoWriter, 100, c550802Cs2.extra);
            protoWriter.writeBytes(c550802Cs2.unknownFields());
        }
    };
    public String extra;
    public Boolean is_promote_ad_label;
    public Integer label_click;
    public String label_color;
    public Integer label_icon;
    public String label_text;

    public C550802Cs() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
