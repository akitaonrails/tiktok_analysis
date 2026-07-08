package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02c7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C624502c7 extends Message<C624502c7, C624602c8> {
    public static final ProtoAdapter<C624502c7> ADAPTER = new ProtoAdapter<C624502c7>() { // from class: X.02c6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C624502c7 decode(ProtoReader protoReader) {
            C624502c7 c624502c7 = new C624502c7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c624502c7.hide_total_price = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c624502c7.highlight_total_price = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c624502c7.benefit_display_style = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c624502c7.style = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c624502c7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C624502c7 c624502c7) {
            C624502c7 c624502c72 = c624502c7;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c624502c72.style) + protoAdapter.encodedSizeWithTag(2, c624502c72.benefit_display_style);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c624502c72.highlight_total_price) + protoAdapter2.encodedSizeWithTag(4, c624502c72.hide_total_price) + c624502c72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C624502c7 c624502c7) {
        }
    };
    public Integer benefit_display_style;
    public Boolean hide_total_price;
    public Boolean highlight_total_price;
    public Integer style;

    public C624502c7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C624602c8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
